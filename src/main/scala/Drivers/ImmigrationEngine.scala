package Drivers

import java.util.ArrayList

import DomainObjects.{Applicant, ImmigrationFact}

import scala.collection.JavaConversions.iterableAsScalaIterable

object ImmigrationEngine {

  def determineEligibleApplicants(facts: List[ImmigrationFact]): List[Applicant] = {
    val eligibleApplicants = new ArrayList[Applicant]
    val session = Kie.newSEssion

    session.setGlobal("eligibleApplicants", eligibleApplicants)
    facts map session.insert

    session.fireAllRules()
    session.dispose()

    eligibleApplicants.toList
  }
}
