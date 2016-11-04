package Enumerations

import scala.beans.BeanInfo

/**
  * Created by nahag on 11/1/2016.
  */
object DrivingType extends Enumeration{
  type DrivingType = Value

  val Crazy = Value(0)
  val Sane = Value(1)
}

//@BeanInfo
//sealed abstract class drivingType(id: Int)
//case object CrazyDrivingType extends drivingType(0)
//case object SaneDrivingType extends drivingType(1)