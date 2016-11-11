package com.loyalcraft.constants

object LoyalCraftConstants {

  val DEFAULT_SECRET_PASSWORD = "loyalcraft_default_secret_key"
  /*
   * Session cookies
   */

  val COOKIE_ACCESS_TIME = "LOYALCRAFT_ENDUSER.access.time"

  /**
    * Token claims
    */
  val TOKEN_CLAIM_USER_ID = "userID"
  val TOKEN_CLAIM_ADMIN_ID = "adminID"
  val TOKEN_CLAIM_EMAIL = "email"
  val TOKEN_CLAIM_PAGE_ID = "page_id"

  /*
   * mail configuration
   */
  val CONFIG_MAIL_USERNAME = "config.mail.username"
  val CONFIG_MAIL_PASSWORD = "config.mail.password"
  val CONFIG_MAIL_EMAIL = "config.mail.email"
  val MAIL_SMTP_AUTH = "mail.smtp.auth"
  val MAIL_SMTP_STARTTLS_ENABLE = "mail.smtp.starttls.enable"
  val MAIL_SMTP_HOST = "mail.smtp.host"
  val MAIL_SMTP_PORT = "mail.smtp.port"
  val MAIL_DEBUG = "mail.debug"

  //REGISTRATION
  val CONFIG_MAIL_SUBJECT_REGISTRATION = "config.mail.subject.registration"
  val CONFIG_MAIL_TEXT_REGISTRATION = "config.mail.text.registration"
  val CONFIG_MAIL_RESPONSE_SUCCESS_REGISTRATION = "config.mail.response.success.registration"
  val CONFIG_MAIL_RESPONSE_ERROR_REGISTRATION = "config.mail.response.error.registration"

  // RESET
  val CONFIG_MAIL_SUBJECT_RESET = "config.mail.subject.reset"
  val CONFIG_MAIL_TEXT_RESET = "config.mail.text.reset"

  //TODO must be returned from resource api
  val CONFIG_MAIL_RESPONSE_SUCCESS_RESET = "config.mail.response.success.reset"
  val CONFIG_MAIL_RESPONSE_ERROR_RESET = "config.mail.response.error.reset"

  //CURRENCIES IDENTIFIERS : ALSO USED IN JSON RESPONSE OBJECT
  //COINS:BRONZE
  val CURRENCY_COINS_BRONZE = "currency_coins_bronze"
  //Achievements score
  val CURRENCY_ACHIEVEMENTS_SCORE = "currency_achievement_score"
  //JEWEL or DIAMOND
  val CURRENCY_DIAMOND = "currency_diamond"
  //STAR
  val CURRENCY_STAR = "currency_star"
  //Reputation Currency
  val CURRENCY_REPUTATION = "currency_reputation"


  // FRIENDSHIP ACTIONS
  val FRIENDSHIP_ACTION_ADD = "add"
  val FRIENDSHIP_ACTION_REMOVE = "remove"
  val FRIENDSHIP_ACTION_PENDING_REQUEST = "pending"
  val FRIENDSHIP_ACTION_WAITING_FOR_RESPONSE = "waiting"

  // PAGE SIZE :
  val SHOPITEMS_PAGE_SIZE = 12
  val SHOP_CATEGORIES_PAGE_SIZE = 8
  val SHOP_SUGGESTION_PAGE_SIZE = 5
  val ORDERS_PAGE_SIZE = 5
  val REPUTATION_PAGE_SIZE = 7
  val ACHIEVEMENTS_WON_PAGE_SIZE = 5
  val ACHIEVEMENTS_GROUPS_PAGE_SIZE = 5
  val FRIENDS_SCROLL_PAGE_SIZE = 10
  val FRIENDS_SUGGESTIONS_PAGE_SIZE = 5
  val SEARCH_USER_PAGE_SIZE = 5
  val HOME_SCROLL_PAGE_SIZE = 5
  val COMMENTS_DEFAULT_PAGE_SIZE = 3
  val FIRST_LEADERBOARD_LIST_SIZE = 10
  val SECOND_LEADERBOARD_LIST_SIZE = 5
  val LOYALCRAFT_CUSTOMER_SUGGESTION = 5
  val NOTIFICATIONS_PAGE_SIZE = 10
  val USERS_AND_LOYALCRAFT_CUSTOMERS_SUGGESTION = 5
  val CUSTOMER_PAGE_BOX_PAGE_SIZE = 10
  val CUSTOMER_PAGE_PIN_PAGE_SIZE = 10
  val PICTURES_BOX_PAGE_SIZE = 5
  val PARTNER_PAGE_SEARCH_PAGE_SIZE = 5
  val CUSTOMER_CARD_CATEGORY_PAGE_SIZE = 10
  val CUSTOMER_CARD_ITEM_PAGE_SIZE = 10
  val CUSTOMER_CARD_Order_PAGE_SIZE = 10


  // EXPERIENCE POINTS
  val EXPERIENCE_MIN = 1
  val EXPERIENCE_MAX_PER_TIME = 200
  val TIME_MAX = 24

  // EXPERIENCE POINTS
  val CURRENCY_CONVERTER = 10000

  //QRCODE Structure
  val QRCODE_LINK = "https://partner.snug.menu/download"

  //DEFAULT PICTURES NAMES
  val USER_DEFAULT_AVATAR = "user_default_avatar"
  val USER_DEFAULT_COVER = "user_default_cover"
  val PAGE_DEFAULT_AVATAR = "page_default_avatar"
  val PAGE_DEFAULT_COVER = "page_default_cover"

  //ORDER's PRICE SUM INDICATORS
  val TOTAL_PER_DAY = "total_per_day"
  val TOTAL_PER_MONTH = "total_per_month"
  val TOTAL_PER_YEAR = "total_per_year"
}