package com.loyalcraft.enumeration

import play.api.Logger


object Visibility extends Enumeration {
  type Visibility = Value
  val Visible, // allowed to be shown and used into system
  Deleted, // moved to trash , could be restored
  DeletedPermanently // cleaned from the trash, could not be restored
  = Value


  //Database ids
  private var map_db_ids = Map[Int,Visibility]()
  //Frontend identifiers
  private var map_identifiers = Map[String,Visibility]()

  //initialisation of maps by database ids and frontend identifiers
  //this initialisation's bloc should be implemented very carefully and all enum value should be set into maps
  //TODO we can improve initialisation by checking uniqueness of every db_id and identifiers
  {
    for (value <- Visibility.values) {
      value match {
        case Visible => {
          map_db_ids += (0 -> Visible)
          map_identifiers += ("visible" -> Visible)
        }
        case Deleted => {
          map_db_ids += (1 -> Deleted)
          map_identifiers += ("deleted" -> Deleted)
        }
        case DeletedPermanently => {
          map_db_ids += (2 -> DeletedPermanently)
          map_identifiers += ("deleted_permanently" -> DeletedPermanently)
        }

      }
    }

  }

  /**
   *
   * @param db_id
   * @return Visibility else default is 'Deleted'
   */
  def getValue(db_id: Int): Visibility = map_db_ids.getOrElse(db_id, Deleted)

  /**
   *
   * @param identifier
   * @return Visibility else default is 'Deleted'
   */
  def getValue(identifier: String): Visibility = map_identifiers.getOrElse(identifier, Deleted)

  /**
   *
   * @param v
   * @return database id by Visibility
   */
  def getId(v: Visibility): Int = {

    map_db_ids.find(_._2 == v) match {
      case Some(result) => result._1
      case None => throw new NullPointerException("This Enum value does not have a database id  => check map initialisation")
    }

  }

  /**
   *
   * @param v
   * @return frontend identifier by Visibility
   */
  def getIdentifier(v: Visibility): String = {

    map_identifiers.find(_._2 == v) match {
      case Some(result) => result._1
      case None => throw new NullPointerException("This Enum value does not have a frontend identifier => check map initialisation")
    }

  }
}