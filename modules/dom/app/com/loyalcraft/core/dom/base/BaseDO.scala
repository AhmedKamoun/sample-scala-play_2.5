package com.loyalcraft.core.dom.base

import javax.persistence._

import com.loyalcraft.enumeration.Visibility
import com.loyalcraft.enumeration.Visibility.Visibility
import org.hibernate.annotations.GenericGenerator
import org.springframework.data.domain.Persistable

import scala.annotation.meta.field
import scala.beans.BeanProperty;


/**
  * BaseDO is the base entity for all Entity-Objects MD and TD.
  *
  * the database id is now an UUID Object String key,
  * stored as an VARBINARY 16 Number as primary technical key.
  */
@MappedSuperclass
abstract class BaseDO extends Persistable[String] {

  /*
	 * the technical database and object key.
	 */

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @BeanProperty
  var id: String = _


  /*
	 * optimistic locking
	 */
  @Version
  @Column(columnDefinition = "INT DEFAULT 0")
  @field
  @BeanProperty
  var version: Int = _

  /**
    * visibility of the entity: visible, deleted or deleted permanently
    */
  private var visibility: Int = Visibility.getId(Visibility.Visible)

  def getVisibility(): Visibility = Visibility.getValue(visibility)

  def setVisibility(value: Visibility) = visibility = Visibility.getId(value)

  override def isNew() = true

}
