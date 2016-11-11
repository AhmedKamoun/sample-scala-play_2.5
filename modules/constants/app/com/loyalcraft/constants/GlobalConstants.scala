package com.loyalcraft.constants

object GlobalConstants {


  /**
    * application constants
    */
  val CONST_CACHE_TIMEOUT_MILLISECONDS = "cache_timeout_milliseconds"
  val CURRENCY_DEFAULT_EUR = "EUR"
  val PICTURE_UPLOAD_MAX_SIZE = "picture_upload_max_size"
  val CURRENCY_CONVERTER = "currency_converter"

  /**
    * cache related constants.
    */
  val CACHE_KEY = "keyValuePairs"
  val CACHE_KEY_CONFIGPROPERTY = "configPropertyKeyValuePairs"
  val CACHE_KEY_FRONTENDPROPERTY = "frontendPropertyKeyValuePairs"
  val CACHE_TIMERTASK_PERIOD_MILLISECONDS = "cache_timertask_period_milliseconds"


  /**
    * * Config properties **
    *
    * STRIPE KEYS (pkey in ConfigProperty Table)
    */
  val STRIPE_SECRET_KEY = "stripe.secret.key"
  //publishable.key is used in frontend and not in backend, we can remove it
  val STRIPE_PUBLISHABLE_KEY = "stripe.publishable.key"


  /**
    * pictures Resources folders.
    */
  val FOLDER_BASE_URL = "base_url"
  val FOLDER_USER_AVATARS = "folder_pic_users_avatars"
  val FOLDER_USER_COVERS = "folder_pic_users_covers"
  val FOLDER_PAGE_PIN = "folder_pic_page_pins"
  val FOLDER_CASH_REGISTER = "folder_pic_cash_register"
  val FOLDER_CARD_ITEM = "folder_pic_page_items"
  val FOLDER_PAGE_COVERS = "folder_pic_page_covers"
  val FOLDER_PAGE_AVATARS = "folder_pic_page_avatars"
  val FOLDER_REWARDS_PICTURES = "folder_pic_rewards"
  val FOLDER_POSTS = "folder_pic_posts"

  /**
    * pictures Format
    */
  val PICTURE_FORMAT_PNG = ".png"
  val PICTURE_FORMAT_JPEG = ".jpeg"
  val PICTURE_FORMAT_JPG = ".jpg"

  /**
    * relation request status
    */
  val RELATION_REQUEST_PENDING = "pending"
  val RELATION_REQUEST_WAITING = "waiting"
  val RELATION_REQUEST_CONFIRMED = "confirmed"

}