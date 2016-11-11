package com.loyalcraft.core.ex

//TODO can be optimized if replaced by sealed case class for displaying compiler warning instead of enumeration
object ErrorStatusCode extends Enumeration {
  val
  NotFoundResource, //Undefined Achievement, AchievementGroup, ReputationLevel, LoyalCraftCustomer...
  BadRequest, // INTEGRITY PROBLEM: REQUEST THAT DOES NOT MAKE SENS
  InternalServerError,
  TooManyRequests,
  Locked,
  Unauthorized
  = Value
}
