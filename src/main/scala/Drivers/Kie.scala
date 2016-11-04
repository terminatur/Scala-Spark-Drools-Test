package Drivers

import org.kie.api.KieServices
import org.kie.api.runtime.{KieContainer, StatelessKieSession}

/**
  * Created by nahag on 11/1/2016.
  */
object Kie {

  private lazy val kieServices: KieServices = KieServices.Factory.get()
  private lazy val kContainer: KieContainer = kieServices.getKieClasspathContainer()

  def newStatelessSession: StatelessKieSession = kContainer.newStatelessKieSession()

  def executeStateless(facts: List[Any]) = newStatelessSession.execute(facts)

  def newSEssion = kContainer.newKieSession
}
