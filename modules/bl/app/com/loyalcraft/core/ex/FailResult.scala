package com.loyalcraft.core.ex

import play.api.libs.json.{JsValue, Json, Writes}


case class FailResult(errorCode: String, meta: Option[JsValue] = None)

object FailResult {

  implicit val writes: Writes[FailResult] = Writes {
    (failure: FailResult) => {
      var response = Json.obj()

      response += ("error_code" -> Json.toJson(failure.errorCode))
      response += ("error_message" -> Json.toJson(ErrorCode.getErrorMessage(failure.errorCode)))

      failure.meta.map {
        meta =>
          response += ("meta" -> meta)
      }

      response
    }
  }
}