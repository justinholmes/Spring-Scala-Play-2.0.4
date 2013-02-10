package Global

import org.springframework.context.support.ClassPathXmlApplicationContext
import services.{LoginService, HelloService}

object Global {
  val ctx = new ClassPathXmlApplicationContext("components.xml");
  val helloService = ctx.getBean(classOf[HelloService])
  val loginService = ctx.getBean(classOf[LoginService])
}
