package configuration.filters

import javax.inject.Inject

import akka.stream.Materializer
import controllers.Default
import play.api.http.HeaderNames._
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}

/**
  * FOR MORE INFORMATION:
  * https://www.playframework.com/documentation/2.4.x/ScalaHttpFilters
  * https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS
  * http://www.html5rocks.com/en/tutorials/cors/
  * https://gist.github.com/jeantil/7214962
  * http://windrush.io/tech/2013/12/17/cors-and-play.html
  * http://stackoverflow.com/questions/10392545/custom-configuration-files-play-framework-2-0/21205813#21205813
  *
  * @author Kamoun Ahmed
  *         This is an initial implementation which can certainly be improved :
  *         At the moment the filter will fallback to ever more permissive allow origin, it should most likely be the opposite
  *         The allowed domain only accepts one domain, it could be made a whitelist to check origin against
  *         The allowed methods and headers could be made configurable
  */

class CORSFilter @Inject()(implicit val mat: Materializer, ec: ExecutionContext, configuration: play.api.Configuration) extends Filter {



  def isPreFlight(r: RequestHeader) = {
    r.method.toLowerCase.equals("options")
    // &&  r.headers.get("Access-Control-Request-Method").nonEmpty
  }

  /**
    * //TODO could be improved by getting dynamically the list of allowed origins from database instead of static config file
    *
    * @param request
    * @return Check if request origin is allowed
    */
  def getAllowedOrigin(request: RequestHeader): Option[String] = {

    request.headers.get(ORIGIN) match {
      case Some(origin) => {
        if (configuration.getStringList("play.filters.cors.allowedOrigins").contains(origin))
          Some(origin)
        else None
      }
      case None => None
    }


  }

  def apply(nextFilter: (RequestHeader) => Future[Result])
           (requestHeader: RequestHeader): Future[Result] = {

    if (isPreFlight(requestHeader)) {
      //  Logger.warn("[cors] request is preflight")

      Future.successful(Default.Ok.withHeaders(
        "Access-Control-Allow-Origin" -> getAllowedOrigin(requestHeader).getOrElse(""),
        "Access-Control-Allow-Methods" -> requestHeader.headers.get("Access-Control-Request-Method").getOrElse("*"),
        "Access-Control-Allow-Headers" -> requestHeader.headers.get("Access-Control-Request-Headers").getOrElse(""),
        "Access-Control-Allow-Credentials" -> "true")
      )

    }


    else {

      //  Logger.warn("[cors] request is normal")
      nextFilter(requestHeader).map { result =>

        result.withHeaders(
          "Access-Control-Allow-Origin" -> getAllowedOrigin(requestHeader).getOrElse(""),
          "Access-Control-Allow-Methods" -> requestHeader.headers.get("Access-Control-Request-Method").getOrElse("*"),
          "Access-Control-Allow-Headers" -> requestHeader.headers.get("Access-Control-Request-Headers").getOrElse(""),
          "Access-Control-Allow-Credentials" -> "true")

      }


    }
  }
}