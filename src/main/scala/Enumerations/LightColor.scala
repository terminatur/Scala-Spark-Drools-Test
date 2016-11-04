package Enumerations

import scala.beans.BeanInfo

/**
  * Created by nahag on 11/1/2016.
  */
object LightColor extends Enumeration {
  type LightColor = Value

  val Red = Value(0)
  val Yellow = Value(1)
  val Green = Value(2)
}

//@BeanInfo
//sealed abstract class lightColor(id: Int)
//case object RedLight extends lightColor(0)
//case object YellowLight extends lightColor(1)
//case object GreenLight extends lightColor(2)