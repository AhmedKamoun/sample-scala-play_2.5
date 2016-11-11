package com.loyalcraft.core.ex

import play.api.libs.json.JsValue


case class LoyalCraftException(status: ErrorStatusCode.Value, errorCode: String, meta: Option[JsValue] = None) extends Throwable

case class CustomerFundException() extends Throwable