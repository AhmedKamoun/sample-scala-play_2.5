package configuration

import javax.inject._

import com.loyalcraft.core.ex.{ErrorCode, FailResult}
import play.api._
import play.api.http.DefaultHttpErrorHandler
import play.api.libs.json.Json
import play.api.mvc.Results._
import play.api.mvc._
import play.api.routing.Router

import scala.concurrent._

/**
  * @author Kamoun Ahmed
  *         https://www.playframework.com/documentation/2.5.x/ScalaErrorHandling#Extending-the-default-error-handler
  */
class ErrorHandler @Inject()(
                              env: Environment,
                              config: Configuration,
                              sourceMapper: OptionalSourceMapper,
                              router: Provider[Router]
                            ) extends DefaultHttpErrorHandler(env, config, sourceMapper, router) {

  override def onProdServerError(request: RequestHeader, exception: UsefulException) = {

    Future.successful(InternalServerError(Json.toJson(FailResult(ErrorCode.InternalServerError))))

  }

  override def onForbidden(request: RequestHeader, message: String) = {

    Future.successful(Forbidden(Json.toJson(FailResult(ErrorCode.InternalServerError))))

  }

  override def onClientError(request: RequestHeader, statusCode: Int, message: String) = {
    // 404 - page not found error
    if (statusCode == play.api.http.Status.NOT_FOUND) {
      val error_message = "action not found: " + request.method + " " + request.path
      Future.successful(NotFound(Json.obj("error_code" -> ErrorCode.Action_NotFound, "error_message" -> error_message)))

    }
    //400 if a route was found, but it was not possible to bind the request parameters
    else if (statusCode == play.mvc.Http.Status.BAD_REQUEST) {

      Future.successful(BadRequest(Json.obj("error_code" -> ErrorCode.BadRequest, "error_message" -> message)))

    }
    else {
      Future.successful(
        Status(statusCode)("A client error occurred: " + message)
      )
    }

  }


  /**
    * https://www.playframework.com/documentation/2.5.x/ScalaErrorHandling#Extending-the-default-error-handler
    * THIS METHOD MUST NOT BE OVERRIDE TO KEEP THE DEBUGGING STACK TRACE ENABLED IN DEV MODE
    */
  //override def onServerError(request: RequestHeader, exception: Throwable)
}
