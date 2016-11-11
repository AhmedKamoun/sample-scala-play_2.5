package com.loyalcraft.core.ex

import com.loyalcraft.constants.HelperUtility
import play.api.Logger
import play.api.libs.json.{JsArray, Json}

import scala.collection.mutable.Map

object ErrorCode {

  private val mapCodes: Map[String, String] = Map()

  final val FormErrors = "form_errors"
  final val JsRequestErrors = "json_request_errors"
  final val FormError_required = "form_error_required"
  final val FormError_email = "form_error_email"
  final val FormError_min = "form_error_min"
  final val FormError_min_strict = "form_error_min_strict"
  final val FormError_max = "form_error_max"
  final val FormError_max_strict = "form_error_max_strict"
  final val FormError_minLength = "form_error_min_length"
  final val FormError_maxLength = "form_error_max_length"
  final val InternalServerError = "internal_server_error"
  final val Forbidden = "forbidden"
  final val Action_NotFound = "action_notfound"
  final val BadRequest = "badrequest"
  final val NotFound_Achievement = "notfound_achievement"
  final val NotFound_AchievementGroup = "notfound_achievementgroup"
  final val NotFound_LevelDefinition = "notfound_leveldefinition"
  final val NotFound_ReputationLevelDefinition = "notfound_reputationleveldefinition"
  final val NotFound_ShopItem = "notfound_shopitem"
  final val NotFound_ShopCategory = "notfound_shopcategory"
  final val NotFound_Order = "notfound_order"
  final val NotFound_CardOrder = "notfound_cardorder"
  final val NotFound_CardOrder_Status = "notfound_cardorder_status"
  final val NotFound_Payment_Method = "notfound_payment_method"
  final val NotFound_Language = "notfound_language"
  final val NotFound_Gender = "notfound_gender"
  final val NotFound_Folder = "notfound_folder"
  final val NotFound_Feed = "notfound_feed"
  final val NotFound_User = "notfound_user"
  final val NotFound_Friendship = "notfound_friendship"
  final val NotFound_RelationShip_Status = "notfound_relationship_status"
  final val BadRequest_Shop_Items = "badrequest_shop_items"
  final val BadRequest_Friendship = "badrequest_friendship"
  final val BadRequest_Reduction = "badrequest_reduction"
  final val BadRequest_Friendship_Request = "badrequest_friendship_request"
  final val BadRequest_RelationShip_Status = "badrequest_relationship_status"
  final val BadRequest_RelationShip_Confirmation = "badrequest_relationship_confirmation"
  final val BadRequest_RelationShip = "badrequest_relationship"
  final val NotFound_RelationShip = "notfound_relationship"
  final val BadRequest_RelationShip_Edit = "badrequest_relationship_edit"
  final val NotFound_User_Phone = "notfound_user_phone"
  final val NotFound_User_Email = "notfound_user_email"
  final val BadRequest_User_Email = "badrequest_user_email"
  final val NotFound_User_Website = "notfound_user_website"
  final val NotFound_User_Job = "notfound_user_job"
  final val NotFound_User_College = "notfound_user_college"
  final val NotFound_User_HighSchool = "notfound_user_highschool"
  final val NotFound_Familyship = "notfound_familyship"
  final val BadRequest_Familyship_confirmation = "badrequest_familyship_confirmation"
  final val NotFound_Familyship_status = "notfound_familyship_status"
  final val BadRequest_Familyship = "badrequest_familyship"
  final val BadRequest_Email_Duplicated = "badrequest_email_duplicated"
  final val BadRequest_Email_Principal = "badrequest_email_principal"
  final val BadRequest_ReputationLevelDefinition = "badrequest_reputationleveldefinition"
  final val BadRequest_OldPassword = "badrequest_oldpassword"
  final val BadRequest_RepeatOldPassword = "badrequest_repeatoldpassword"
  final val NotFound_Foursquare_VenueId = "notfound_foursquare_venueid"
  final val NotFound_Facebook_PlaceId = "notfound_facebook_placeid"
  final val NotFound_Twitter_Mention = "notfound_twitter_mention"
  final val BadRequest_Shop_ItemLocked = "badrequest_shop_itemlocked"
  final val BadRequest_Shop_OrderPrice = "badrequest_shop_orderprice"
  final val BadRequest_User_LcCard = "badrequest_user_lccard"
  final val NotFound_User_LcCard = "notfound_user_lccard"
  final val BadRequest_User_MobileLcCard = "badrequest_user_mobilelccard"
  final val BadRequest_User_LcCard_2 = "badrequest_user_lccard_2"
  final val NotFound_ActivityDefinition = "notfound_activitydefinition"
  final val Unauthorized_Customer = "unauthorized_customer"
  final val NotFound_ActivityDefinition_Group = "notfound_activitydefinition_group"
  final val NotFound_Activity_Filter = "notfound_activity_filter"
  final val NotFound_Customer_Origin = "notfound_customer_origin"
  final val BadRequest_Origin = "badrequest_origin"
  final val BadRequest_Activity_Redo = "badrequest_activity_redo"
  final val NotFound_Sector = "notfound_sector"
  final val NotFound_BusinessSector = "notfound_businesssector"
  final val BadRequest_Customer_Fund = "badrequest_customer_fund"
  final val NotFound_Customer = "notfound_customer"
  final val BadRequest_Shop_EmptyStock = "badrequest_shop_emptystock"
  final val NotFound_Tip = "notfound_tip"
  final val BadRequest_Tip_Delete = "badrequest_tip_delete"
  final val NotFound_Answer = "notfound_answer"
  final val BadRequest_Answer_Accept = "badrequest_answer_accept"
  final val BadRequest_Answer_Delete = "badrequest_answer_delete"
  final val NotFound_Comment = "notfound_comment"
  final val BadRequest_Comment = "badrequest_comment"
  final val BadRequest_Comment_Delete = "badrequest_comment_delete"
  final val NotFound_Question = "notfound_question"
  final val BadRequest_Question_Accept = "badrequest_question_accept"
  final val BadRequest_Question_Delete = "badrequest_question_delete"
  final val BadRequest_Question = "badrequest_question"
  final val BadRequest_Question_Answer = "badrequest_question_answer"
  final val NotFound_Page = "notfound_page"
  final val NotFound_Customer_PageBox = "notfound_customer_pagebox"
  final val NotFound_Cash_Register = "notfound_cash_register"
  final val NotFound_Card_Category = "notfound_card_category"
  final val NotFound_Card_Item = "notfound_card_item"
  final val NotFound_Notification = "notfound_notification"
  final val NotFound_Reduction = "notfound_reduction"
  final val NotFound_Table = "notfound_table"
  final val NotFound_Table_Page = "notfound_table_page"
  final val BadRequest_Invalid_Tables = "badrequest_invalid_tables"
  final val BadRequest_Waiter_Table = "badrequest_waiter_table"
  final val BadRequest_No_Waiters = "badrequest_no_waiters"
  final val BadRequest_Admin_Role = "badrequest_admin_role"
  final val NotFound_Customer_PagePin = "notfound_customer_pagepin"
  final val BadRequest_Password = "badrequest_password"
  final val BadRequest_Password_Confirmation = "badrequest_password_confirmation"
  final val BadRequest_Page_Permission = "badrequest_page_permission"
  final val BadRequest_Page_Advanced = "badrequest_page_Advanced"
  final val NotFound_Page_Partner = "notfound_page_partner"
  final val BadRequest_Naming = "badrequest_naming"
  final val BadRequest_Credentials = "badrequest_credentials"
  final val BadRequest_Email_Validation = "badrequest_email_validation"
  final val BadRequest_Folder_Upload = "badrequest_folder_upload"
  final val BadRequest_Page_Item = "badrequest_page_item"
  final val BadRequest_TP_Table = "badrequest_tp_table"
  final val BadRequest_Delete_TP_Table = "badrequest_delete_tp_table"
  final val BadRequest_TP_Category = "badrequest_tp_category"
  final val BadRequest_Share = "badrequest_share"
  final val NotFound_Provider = "notfound_provider"
  final val BadRequest_SnugMenu_Login = "badrequest_snugmenu_login"
  final val BadRequest_LcToken = "badrequest_lctoken"
  final val BadRequest_User_link = "badrequest_user_link"
  final val NotFound_User_link = "notfound_user_link"
  final val BadRequest_TwitterApi = "badrequest_twitterapi"
  final val BadRequest_FoursquareApi = "badrequest_foursquareapi"
  final val BadRequest_FacebookApi = "badrequest_facebookapi"
  final val BadRequest_FacebookApi_Unauthorized = "badrequest_facebookapi_unauthorized"
  final val BadRequest_Provider_Parsing = "badrequest_provider_parsing"
  final val BadRequest_Provider_Scope = "badrequest_provider_scope"
  final val BadRequest_Provider_Token = "badrequest_provider_token"
  final val BadRequest_Provider_Code = "badrequest_provider_code"
  final val BadRequest_SubOrder_Role = "badrequest_suborder_role"
  final val NotFound_SubOrder_Role = "notfound_suborder_role"
  final val NotFound_SubOrderStatus = "notfound_suborder_status"
  final val BadRequest_Page_Role = "badrequest_page_role"
  final val BadRequest_Page_Cook = "badrequest_page_cook"
  final val BadRequest_Page_Barman = "badrequest_page_barman"
  final val BadRequest_Page_Barman_Cook = "badrequest_page_barman_cook"
  final val NotFound_CardItemType = "notfound_carditemtype"
  final val NotFound_Country = "notfound_country"
  final val NotFound_PrintFormat = "notfound_printFormat"
  final val NotFound_PrintLanguage = "notfound_printLanguage"
  final val NotFound_Page_Role = "notfound_page_role"
  final val NotFound_Sum_Indicator = "notfound_sum_indicator"
  final val BadRequest_Birthday_Range = "badrequest_birthday_range"
  final val BadRequest_Phone_Format = "badrequest_phone_format"
  final val NotFound_Phone_Type = "notfound_phone_type"
  final val BadRequest_OfficialCurrency = "badrequest_official_currency"
  final val NotFound_LookingFor = "notfound_looking_for"
  final val BadRequest_InvalidValue = "badrequest_invalid_value"
  final val BadRequest_UsedValue = "badrequest_used_value"
  final val NotFound_StripeCard = "notfound_stripe_card"
  final val BadRequest_Stripe_Code = "badrequest_stripe_code"
  final val BadRequest_Stripe_Scope = "badrequest_stripe_scope"
  final val NotFound_Permission_Context = "notfound_permission_context"
  final val BadRequest_Order_Payment = "badrequest_order_payment"
  final val BadRequest_Price_Invalid = "badrequest_price_invalid"
  final val BadRequest_Online_Payment = "badrequest_online_payment"
  final val BadRequest_Payment_Settings = "badrequest_payment_settings"
  final val BadRequest_Admin_Disabled = "badrequest_admin_disabled"
  final val BadRequest_Order_Waiter = "badrequest_order_waiter"


  /** Stripe card exceptions **/

  final val Stripe_Server_Exception = "stripe_server_exception"
  final val Stripe_Invalid_Number = "invalid_number"
  final val Stripe_Invalid_Expiry_Month = "invalid_expiry_month"
  final val Stripe_Invalid_Expiry_Year = "invalid_expiry_year"
  final val Stripe_Invalid_Cvc = "invalid_cvc"
  final val Stripe_Incorrect_Number = "incorrect_number"
  final val Stripe_Expired_Card = "expired_card"
  final val Stripe_Incorrect_Cvc = "incorrect_cvc"
  final val Stripe_Incorrect_Zip = "incorrect_zip"
  final val Stripe_Card_Declined = "card_declined"
  final val Stripe_Card_Missing = "missing"
  final val Stripe_Card_Processing = "processing_error"

  def getErrorMessage(code: String): String = {
    if (mapCodes.isEmpty) {
      mapCodes += (Action_NotFound -> "requested api url is not found!")
      mapCodes += (JsRequestErrors -> "Errors while processing json body request!")
      mapCodes += (FormErrors -> "Errors while processing form data!")
      mapCodes += (FormError_required -> "This field is required")
      mapCodes += (FormError_email -> "invalid email format")
      mapCodes += (FormError_min -> "min value constraint is not respected")
      mapCodes += (FormError_min_strict -> "strict min value constraint is not respected")
      mapCodes += (FormError_max -> "max value constraint is not respected")
      mapCodes += (FormError_max_strict -> "strict max value constraint is not respected")
      mapCodes += (FormError_minLength -> "min length constraint is not respected")
      mapCodes += (FormError_maxLength -> "max length constraint is not respected")
      mapCodes += (InternalServerError -> "internal server error: please contact asap the backend team for this exception!")
      mapCodes += (Forbidden -> "You're not allowed to access this resource.")
      mapCodes += (NotFound_Achievement -> "This bkIdentifier does not refer to any valid achievement definition")
      mapCodes += (NotFound_AchievementGroup -> "Undefined achievements group")
      mapCodes += (NotFound_LevelDefinition -> "There is not a level definition with this id")
      mapCodes += (NotFound_ReputationLevelDefinition -> "There is not a reputation level definition with this id")
      mapCodes += (NotFound_ShopItem -> "There is no shop item with this id")
      mapCodes += (NotFound_ShopCategory -> "There is no shop category with this id")
      mapCodes += (NotFound_Order -> "This order does not exist")
      mapCodes += (NotFound_CardOrder -> "This card order does not exist")
      mapCodes += (NotFound_CardOrder_Status -> "This card order status does not exist")
      mapCodes += (NotFound_Payment_Method -> "This payment method does not exist")
      mapCodes += (NotFound_Language -> "invalid language value")
      mapCodes += (NotFound_Gender -> "invalid gender value")
      mapCodes += (NotFound_Folder -> "invalid Folder value")
      mapCodes += (NotFound_Feed -> "This identifier does not refer to any valid feed activity")
      mapCodes += (NotFound_User -> "This identifier does not refer to any valid user account")
      mapCodes += (NotFound_Friendship -> "there is not friendship relation between these two users")
      mapCodes += (NotFound_RelationShip_Status -> "invalid relation status key")
      mapCodes += (BadRequest_Shop_Items -> "The list of shopItems is empty")
      mapCodes += (BadRequest_Friendship -> "you are searching mutual friends between the same user")
      mapCodes += (BadRequest_Friendship_Request -> "user cannot request friendship twice")
      mapCodes += (BadRequest_RelationShip_Status -> "invalid relationship id or maybe you do not belong to this relation")
      mapCodes += (BadRequest_RelationShip_Confirmation -> "invalid operation, you could only confirm relation that is referred to you!")
      mapCodes += (BadRequest_RelationShip -> "you have already a relationship!")
      mapCodes += (NotFound_RelationShip -> "you do not have any relationship request to confirm")
      mapCodes += (BadRequest_RelationShip_Edit -> "invalid relationship operation!")
      mapCodes += (NotFound_User_Phone -> "This phone id does not belong to the current user")
      mapCodes += (NotFound_User_Email -> "Email not found")
      mapCodes += (BadRequest_User_Email -> "This email id does not belong to the current user")
      mapCodes += (NotFound_User_Website -> "Website not found")
      mapCodes += (NotFound_User_Job -> "Work not found")
      mapCodes += (NotFound_User_College -> "College not found")
      mapCodes += (NotFound_User_HighSchool -> "High School not found")
      mapCodes += (NotFound_Familyship -> "invalid familyship id or maybe you do not belong to this relation")
      mapCodes += (BadRequest_Familyship_confirmation -> "invalid operation, you could only confirm relation that is referred to you!")
      mapCodes += (NotFound_Familyship_status -> "invalid familyship status key")
      mapCodes += (BadRequest_Familyship -> "You have already a familyship with this user, you are unauthorized to have two relation with the same user")
      mapCodes += (BadRequest_Email_Duplicated -> "This email is already used")
      mapCodes += (BadRequest_Email_Principal -> "this email is a principal email, user must set another principal email first")
      mapCodes += (BadRequest_ReputationLevelDefinition -> "This reputation level don't belong to the customer")
      mapCodes += (BadRequest_OldPassword -> "Your old password is wrong")
      mapCodes += (BadRequest_RepeatOldPassword -> "You must write your old password")
      mapCodes += (NotFound_Foursquare_VenueId -> "This page has not a foursquare venue id")
      mapCodes += (NotFound_Facebook_PlaceId -> "This page has not a facebook place id")
      mapCodes += (NotFound_Twitter_Mention -> "This page has not a twitter mention")
      mapCodes += (BadRequest_Shop_ItemLocked -> "user has not level or required level")
      mapCodes += (BadRequest_Shop_OrderPrice -> "user has not the price of the order")
      mapCodes += (BadRequest_User_LcCard -> "user has already a loyalCraft Card, can't buy a second one")
      mapCodes += (NotFound_User_LcCard -> "user don't have a loyalCraft Card, he must buy one")
      mapCodes += (BadRequest_User_MobileLcCard -> "user has already a loyalCraft Mobile Card, can't buy a second one")
      mapCodes += (BadRequest_User_LcCard_2 -> "user must buy a loyalCraft Card")
      mapCodes += (NotFound_ActivityDefinition -> "This activity definition does not exist or does not belong to the specified group")
      mapCodes += (Unauthorized_Customer -> "this customer is unauthorized to use LoyalCraft")
      mapCodes += (NotFound_ActivityDefinition_Group -> "This activity definition group does not exist")
      mapCodes += (NotFound_Activity_Filter -> "No filter defined for this activity, so it will be ignored.")
      mapCodes += (NotFound_Customer_Origin -> "This request origin does not refer to any valid loyalCraft customer")
      mapCodes += (BadRequest_Origin -> "This request is from LoyalCraft system and not from customer website!")
      mapCodes += (BadRequest_Activity_Redo -> "This activity cannot be redone by this user at this time")
      mapCodes += (NotFound_Sector -> "This identifier does not refer to any valid loyalcraft sector")
      mapCodes += (NotFound_BusinessSector -> "LoyalCraft business sector not found")
      mapCodes += (BadRequest_Customer_Fund -> "customer does not have enough money in his fund")
      mapCodes += (NotFound_Customer -> "LoyalCraft Customer not found!")
      mapCodes += (BadRequest_Shop_EmptyStock -> "There is no shopItem in stock")
      mapCodes += (NotFound_Tip -> "Tip not found!")
      mapCodes += (BadRequest_Tip_Delete -> "user could not delete a tip that he has not posted himself")
      mapCodes += (NotFound_Answer -> "Answer to question not found!")
      mapCodes += (BadRequest_Answer_Accept -> "user could not accept an answer that doesn't belong to his own question")
      mapCodes += (BadRequest_Answer_Delete -> "user could not delete an answer that he has not posted himself or that is not related to his own question")
      mapCodes += (NotFound_Comment -> "Comment not found!")
      mapCodes += (BadRequest_Comment -> "comment api could not be used to comment a question, use answer api instead")
      mapCodes += (BadRequest_Comment_Delete -> "user could not delete a comment that he has not posted himself or that is not related to his own feed")
      mapCodes += (NotFound_Question -> "Question not found!")
      mapCodes += (BadRequest_Question_Accept -> "this question already has an accepted answer")
      mapCodes += (BadRequest_Question_Delete -> "user could not delete a question that he has not posted himself")
      mapCodes += (BadRequest_Question -> "this question is not yours!")
      mapCodes += (BadRequest_Question_Answer -> "this question does not have an accepted answer yet.")
      mapCodes += (NotFound_Page -> "page not found!")
      mapCodes += (NotFound_Customer_PageBox -> "this id does not refer to any customer page box")
      mapCodes += (NotFound_Cash_Register -> "Cash Register not found for this page!")
      mapCodes += (NotFound_Card_Category -> "Card category not found!")
      mapCodes += (NotFound_Card_Item -> " Card item not found!")
      mapCodes += (NotFound_Notification -> "Notification not found!")
      mapCodes += (NotFound_Reduction -> "Reduction not found!")
      mapCodes += (NotFound_Table -> "Table not found!")
      mapCodes += (NotFound_Customer_PagePin -> "this id does not refer to any customer page pin")
      mapCodes += (BadRequest_Password -> "Must contain 6 to 20 characters string with at least one digit, one upper case letter, one lower case letter and can only characters in [a-zA-Z0-9!$@]")
      mapCodes += (BadRequest_Password_Confirmation -> "Confirm password and password must be identical")
      mapCodes += (BadRequest_Page_Permission -> "you do not have permission to do this action in this partner page")
      mapCodes += (BadRequest_Page_Advanced -> "cannot do this action with this type of page")
      mapCodes += (NotFound_Page_Partner -> "this page is not linked to a partner")
      mapCodes += (BadRequest_Naming -> "You are using unauthorized and unsafe characters (/ , % . $ & + : ; = ? @ # { } \\ < > ^ [ ] | ~)")
      mapCodes += (BadRequest_Credentials -> "wrong credentials!")
      mapCodes += (BadRequest_Email_Validation -> "validate you email first to be able to login!")
      mapCodes += (BadRequest_Folder_Upload -> "this file was uploaded into a wrong folder")
      mapCodes += (BadRequest_Page_Item -> "this item is not related to your page")
      mapCodes += (BadRequest_TP_Table -> "There is already a table with this number")
      mapCodes += (BadRequest_Invalid_Tables -> "Some tables are invalid!")
      mapCodes += (BadRequest_TP_Category -> "There is already a category with this name")
      mapCodes += (BadRequest_Share -> "user cannot share on this provider")
      mapCodes += (NotFound_Provider -> "invalid social provider identifier or may be it is not already supported in backend!")
      mapCodes += (BadRequest_SnugMenu_Login -> "this user is not an admin of any tourism page")
      mapCodes += (BadRequest_LcToken -> "invalid LoyalCraft token!")
      mapCodes += (BadRequest_User_link -> "this provider account is already used and linked by another lc user!")
      mapCodes += (NotFound_User_link -> " user account not linked with this provider")
      mapCodes += (BadRequest_TwitterApi -> "error response from twitter api.")
      mapCodes += (BadRequest_FoursquareApi -> "error response from foursquare api.")
      mapCodes += (BadRequest_FacebookApi -> "error response from facebook api.")
      mapCodes += (BadRequest_FacebookApi_Unauthorized -> "this token is from unauthorized facebook application!")
      mapCodes += (BadRequest_FacebookApi -> "error response from facebook api.")
      mapCodes += (BadRequest_Provider_Parsing -> "error while validating json response from provider ")
      mapCodes += (BadRequest_Provider_Scope -> "invalid token or scope")
      mapCodes += (BadRequest_Provider_Token -> "this token is not valid!")
      mapCodes += (BadRequest_Provider_Code -> "your code is invalid, cannot exchange access token from provider api")
      mapCodes += (BadRequest_Page_Role -> "The user has not a role in this page!")
      mapCodes += (BadRequest_SubOrder_Role -> "invalid required role for managing sub order!")
      mapCodes += (BadRequest_Page_Cook -> "This page has not a cook")
      mapCodes += (BadRequest_Page_Barman -> "This page has not a barman")
      mapCodes += (BadRequest_Page_Barman_Cook -> "This page has neither a barman nor cook")
      mapCodes += (NotFound_CardItemType -> "this item type does not exist")
      mapCodes += (NotFound_Country -> "this country does not exist")
      mapCodes += (NotFound_PrintFormat -> "this print format does not exist")
      mapCodes += (NotFound_PrintLanguage -> "this print language does not exist")
      mapCodes += (NotFound_Page_Role -> "this role does not exist")
      mapCodes += (NotFound_SubOrder_Role -> "this order does not contain sub tasks for this role!")
      mapCodes += (NotFound_SubOrderStatus -> "invalid sub-order status!")
      mapCodes += (BadRequest_Birthday_Range -> "Birthday is out of range [1800 .. now]!")
      mapCodes += (BadRequest_Phone_Format -> "Phone number format is invalid!")
      mapCodes += (NotFound_Phone_Type -> "Phone type is not valid!")
      mapCodes += (NotFound_Sum_Indicator -> "this sum indicator does not exist")
      mapCodes += (BadRequest_OfficialCurrency -> "Official currency is invalid!")
      mapCodes += (NotFound_LookingFor -> "notfound_looking_for")
      mapCodes += (BadRequest_UsedValue -> "value field already used")
      mapCodes += (BadRequest_InvalidValue -> "invalid value field")
      mapCodes += (BadRequest_Reduction -> "reduction already exists for this page")
      mapCodes += (NotFound_StripeCard -> "Stripe card does not exist")
      mapCodes += (BadRequest_Stripe_Code -> "your code is invalid, cannot exchange access token from stripe api")
      mapCodes += (BadRequest_Stripe_Scope -> "stripe scope must be read_write!")
      mapCodes += (NotFound_Permission_Context -> "permission does not exist in this context!")
      mapCodes += (BadRequest_Order_Payment -> "order was already payed!")
      mapCodes += (BadRequest_Price_Invalid -> "price cannot be negative or zero!")
      mapCodes += (BadRequest_Online_Payment -> "online payment is disabled for this customer")
      mapCodes += (BadRequest_Payment_Settings -> "you cannot pay until you set your payment card ")
      mapCodes += (Stripe_Server_Exception -> "caught exception from Stripe serve, please try again later")
      mapCodes += (BadRequest_Admin_Role -> "an admin with this role does not exist.")
      mapCodes += (BadRequest_Admin_Disabled -> "this admin is disabled.")
      mapCodes += (BadRequest_Waiter_Table -> "this table is not controlled by this waiter.")
      mapCodes += (NotFound_Table_Page -> "this table does not belong to this customer.")
      mapCodes += (BadRequest_No_Waiters -> "there is no waiter assigned to this table.")
      mapCodes += (BadRequest_Delete_TP_Table -> "This Table could not be deleted because there are waiters assigned to it.")
      mapCodes += (BadRequest_Order_Waiter -> "This order is already assigned to another waiter")

      /** Stripe card exceptions **/
      mapCodes += (Stripe_Invalid_Number -> "The card number is not a valid credit card number.")
      mapCodes += (Stripe_Invalid_Expiry_Month -> "The card's expiration month is invalid.")
      mapCodes += (Stripe_Invalid_Expiry_Year -> "The card's expiration year is invalid.")
      mapCodes += (Stripe_Invalid_Cvc -> "The card's security code is invalid.")
      mapCodes += (Stripe_Incorrect_Number -> "The card number is incorrect.")
      mapCodes += (Stripe_Expired_Card -> "The card has expired.")
      mapCodes += (Stripe_Incorrect_Cvc -> "The card's security code is incorrect.")
      mapCodes += (Stripe_Incorrect_Zip -> "The card's zip code failed validation.")
      mapCodes += (Stripe_Card_Declined -> "The card was declined.")
      mapCodes += (Stripe_Card_Missing -> "There is no card on a customer that is being charged.")
      mapCodes += (Stripe_Card_Processing -> "An error occurred while processing the card.")

    }

    mapCodes.get(code) match {
      case Some(value) => value
      case None => {
        Logger.error(s"The error code (( $code )) is missing!")

        HelperUtility.EMPTY_STRING
      }
    }
  }

  def getErrors(): JsArray = {
    // just to initialise the mapCodes
    getErrorMessage(NotFound_User)

    var array = Json.arr()
    for (item <- mapCodes) {
      array = array :+ Json.obj("error_code" -> item._1, "error_message" -> item._2)
    }
    array
  }
}