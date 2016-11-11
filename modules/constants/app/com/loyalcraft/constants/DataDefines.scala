package com.loyalcraft.constants

/**
 * Defines commonly used definitions for certain required "data-types"
 *
 *
 * @author Mohamed Fekih-Romdhane
 * @version 2.0.0
 */


object DataDefines {


  /**
   * "The local-part of an e-mail address may be up to 64 characters long and the
   * domain name may have a maximum of 255 characters"
   *
   * http://en.wikipedia.org/wiki/E-mail_address#RFC_specification
   * that would be 320 !! but we go with a lower value
   *
   */

  /**
   * max length for column name
   */
  final val COLUMN_NAME = 255;
  /**
   * "The local-part of an e-mail address may be up to 64 characters long and the
   * domain name may have a maximum of 255 characters"
   *
   * http://en.wikipedia.org/wiki/E-mail_address#RFC_specification
   * that would be 320 !! but we go with a lower value
   *
   */
  final val EMAIL_ADDRESS_LENGTH = 100;

  /**
   * the default length of names like surname, name, company name etc
   */
  final val NAME_LENGTH = 50;

  final val PASSWORD_LENGTH = 50;

  /**
   * the default string length for description properties
   */
  final val DESCRIPTION_LENGTH = 512;

  /**
   * max length url
   */
  final val URL_LENGTH = 512;

  /**
   * max length filepath
   */
  final val FILE_PATH_LENGTH = 512;

  /**
   * max property value length
   */
  final val PROPERTY_VALUE_LENGTH = 4000;

  /**
   * max text field length
   */
  final val TEXT_FIELD = 2000;

  /**
   * max key length
   */
  final val KEY_LENGTH = 255;

  /**
   * max filename length
   */
  final val FILENAME_LENGTH = 255;

  /**
   * max locale length
   */
  final val LOCALE_LENGTH = 3;

  /**
   * min title length
   */
  final val TITLE_LENGTH = 512;


}
