package Drivers

import java.util

import DomainObjects._
import Enumerations._
import JavaDomainObjects.JavaDrivingCondition
import JavaEnumerations.{JavaDrivingAction, JavaDrivingType, JavaLightColor}
import org.scalatest.FunSuite

/**
  * Created by nahag on 11/1/2016.
  */
class DrivingActionKieDemo$Test extends FunSuite {



  test(" Green Light Test") {

    val trafficLight: TrafficLight = TrafficLight("Light1", LightColor.Green)

    val drivingConditions: DrivingConditions = DrivingConditions("Boston",
      LightColor.Green,
      DrivingType.Sane,
      DrivingActionType.Proceed
    )
    val drivingConditions2: DrivingConditions = DrivingConditions("NYC",
      LightColor.Red,
      DrivingType.Sane,
      DrivingActionType.Proceed
    )
    val drivingConditions3: DrivingConditions = DrivingConditions("Chicago",
      LightColor.Yellow,
      DrivingType.Crazy,
      DrivingActionType.Proceed
    )

    val conditions: List[DrivingConditions] = List(drivingConditions, drivingConditions2, drivingConditions3)

//    val conditions = new util.ArrayList[DrivingConditions]()

    val session = Kie.newStatelessSession

//    session.setGlobal("conditions", conditions)

    val results = conditions.map(condition => {
      session.execute(condition)
      condition
    })

//    session.insert(drivingConditions)

//    session.fireAllRules()
//    session.dispose()

    println("Done")

  }


  test ("With java objects/enums version demo test") {
    val drivingCondition1: JavaDrivingCondition = new JavaDrivingCondition("Boston",
      JavaLightColor.Green,
      JavaDrivingType.Sane,
      JavaDrivingAction.Proceed)

    val drivingCondition2: JavaDrivingCondition = new JavaDrivingCondition("NYC",
      JavaLightColor.Red,
      JavaDrivingType.Sane,
      JavaDrivingAction.Proceed)

    val drivingCondition3: JavaDrivingCondition = new JavaDrivingCondition("Chicago",
      JavaLightColor.Yellow,
      JavaDrivingType.Crazy,
      JavaDrivingAction.Proceed)

    val conditions: List[JavaDrivingCondition] = List(drivingCondition1, drivingCondition2, drivingCondition3)

    val session = Kie.newStatelessSession

    //    session.setGlobal("conditions", conditions)

    val results = conditions.map(condition => {
      session.execute(condition)
      condition
    })

    println("Done")
  }
}
