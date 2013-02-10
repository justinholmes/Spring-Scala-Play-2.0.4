package controllers

import Global.Global._
import play.api.mvc._
import play.api._

object Application extends Controller {


  def index = Action {
    println(helloService.hello)
    Ok(helloService.hello)
  }


}
