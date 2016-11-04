package DomainObjects

import Enumerations.LightColor
import Enumerations.LightColor.LightColor

import scala.beans.BeanInfo

/**
  * Created by nahag on 11/1/2016.
  */
@BeanInfo
case class TrafficLight (name: String, color: LightColor) extends ObjectBase