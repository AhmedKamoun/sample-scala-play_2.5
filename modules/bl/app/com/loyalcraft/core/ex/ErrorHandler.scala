package com.loyalcraft.core.ex

import com.loyalcraft.core.ex.FailResult._
import play.api.data.Form
import play.api.i18n.Messages
import play.api.libs.json.{JsError, Json}
import play.api.mvc.Result
import play.api.mvc.Results._

object ErrorHandler {

  def manageException(exception: Throwable): Result = {
    exception match {
      case LoyalCraftException(ErrorStatusCode.NotFoundResource, code, meta) => NotFound(Json.toJson(FailResult(code, meta)))
      case LoyalCraftException(ErrorStatusCode.InternalServerError, code, meta) => InternalServerError(Json.toJson(FailResult(code, meta)))
      case LoyalCraftException(ErrorStatusCode.TooManyRequests, code, meta) => TooManyRequests(Json.toJson(FailResult(code, meta)))
      case LoyalCraftException(ErrorStatusCode.BadRequest, code, meta) => BadRequest(Json.toJson(FailResult(code, meta)))
      case LoyalCraftException(ErrorStatusCode.Locked, code, meta) => Locked(Json.toJson(FailResult(code, meta)))
      case LoyalCraftException(ErrorStatusCode.Unauthorized, code, meta) => Unauthorized(Json.toJson(FailResult(code, meta)))
      case exception: Throwable => throw exception
    }

  }

  def formProcessingError(form: Form[_])(implicit messages: Messages) = BadRequest(Json.toJson(FailResult(ErrorCode.FormErrors, Some(form.errorsAsJson))))

  def jsonProcessingError(errors: JsError) = BadRequest(Json.toJson(FailResult(ErrorCode.JsRequestErrors, Some(JsError.toJson(errors)))))
}
