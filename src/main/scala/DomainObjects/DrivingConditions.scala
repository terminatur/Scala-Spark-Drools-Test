package DomainObjects

import Enumerations.DrivingActionType.DrivingActionType
import Enumerations.DrivingType.DrivingType
import Enumerations.{DrivingActionType, LightColor}
import Enumerations.LightColor.LightColor

import scala.beans.BeanInfo

//sealed trait DrivingConditionFact

/**
  * Created by nahag on 11/1/2016.
  */
@BeanInfo
case class DrivingConditions(var cityName: String,
                             var lightColor: LightColor,
//                             trafficLight: TrafficLight,
                             var drivingType: DrivingType,
                             var drivingActionType: DrivingActionType) extends ObjectBase {

  def setCityName(name: String): Unit = {
    this.cityName = name
  }

  def setLightColor(color: LightColor): Unit = {
    this.lightColor = color
  }

  def setDrivingType(drivingType: DrivingType): Unit = {
    this.drivingType = drivingType
  }

  def setDrivingActionType(drivingActionType: DrivingActionType): Unit = {
    this.drivingActionType = drivingActionType
  }
}
