package configuration.filters

import javax.inject.Inject

import play.api.http.HttpFilters
import play.filters.headers.SecurityHeadersFilter

/**
  *
  * @author Kamoun Ahmed
  *         https://www.playframework.com/documentation/2.4.x/SecurityHeaders
  *
  */
class Filters @Inject()(securityHeadersFilter: SecurityHeadersFilter, corsFilter: CORSFilter) extends HttpFilters {
  val filters = Seq(securityHeadersFilter, corsFilter)
}