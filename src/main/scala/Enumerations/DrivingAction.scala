package Enumerations

import scala.beans.BeanInfo

/**
  * Created by nahag on 11/1/2016.
  */
object DrivingActionType extends Enumeration {
  type DrivingActionType = Value

  val Accelerate = Value(0)
  val Stop = Value(1)
  val Proceed = Value(2)
}

//@BeanInfo
//sealed abstract class drivingActionType(id: Int)
//case object AccelerateDrivingAction extends drivingActionType(0)
//case object StopDrivingAction extends drivingActionType(1)
//case object ProceedDrivingAction extends drivingActionType(2)

