// @SOURCE:/Users/jlo/workspace/sf-cors-proxy/conf/routes
// @HASH:58be8817d4ba1646ed468652172652878df35e41
// @DATE:Sun Jul 24 22:52:02 CDT 2016


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_Application_loginProxy0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("services/oauth2/"),DynamicPart("path", """.+""",false))))
private[this] lazy val controllers_Application_loginProxy0_invoker = createInvoker(
controllers.Application.loginProxy(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loginProxy", Seq(classOf[String]),"GET", """""", Routes.prefix + """services/oauth2/$path<.+>"""))
        

// @LINE:6
private[this] lazy val controllers_Application_loginProxy1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("services/oauth2/"),DynamicPart("path", """.+""",false))))
private[this] lazy val controllers_Application_loginProxy1_invoker = createInvoker(
controllers.Application.loginProxy(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loginProxy", Seq(classOf[String]),"POST", """""", Routes.prefix + """services/oauth2/$path<.+>"""))
        

// @LINE:7
private[this] lazy val controllers_Application_proxy2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("path", """.+""",false))))
private[this] lazy val controllers_Application_proxy2_invoker = createInvoker(
controllers.Application.proxy(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "proxy", Seq(classOf[String]),"GET", """""", Routes.prefix + """$path<.+>"""))
        

// @LINE:8
private[this] lazy val controllers_Application_proxy3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("path", """.+""",false))))
private[this] lazy val controllers_Application_proxy3_invoker = createInvoker(
controllers.Application.proxy(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "proxy", Seq(classOf[String]),"POST", """""", Routes.prefix + """$path<.+>"""))
        

// @LINE:9
private[this] lazy val controllers_Application_options4_route = Route("OPTIONS", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_options4_invoker = createInvoker(
controllers.Application.options(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "options", Seq(classOf[String]),"OPTIONS", """""", Routes.prefix + """"""))
        

// @LINE:10
private[this] lazy val controllers_Application_options5_route = Route("OPTIONS", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("path", """.+""",false))))
private[this] lazy val controllers_Application_options5_invoker = createInvoker(
controllers.Application.options(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "options", Seq(classOf[String]),"OPTIONS", """""", Routes.prefix + """$path<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """services/oauth2/$path<.+>""","""controllers.Application.loginProxy(path:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """services/oauth2/$path<.+>""","""controllers.Application.loginProxy(path:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$path<.+>""","""controllers.Application.proxy(path:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$path<.+>""","""controllers.Application.proxy(path:String)"""),("""OPTIONS""", prefix,"""controllers.Application.options(path:String = "")"""),("""OPTIONS""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$path<.+>""","""controllers.Application.options(path:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_Application_loginProxy0_route(params) => {
   call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_loginProxy0_invoker.call(controllers.Application.loginProxy(path))
   }
}
        

// @LINE:6
case controllers_Application_loginProxy1_route(params) => {
   call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_loginProxy1_invoker.call(controllers.Application.loginProxy(path))
   }
}
        

// @LINE:7
case controllers_Application_proxy2_route(params) => {
   call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_proxy2_invoker.call(controllers.Application.proxy(path))
   }
}
        

// @LINE:8
case controllers_Application_proxy3_route(params) => {
   call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_proxy3_invoker.call(controllers.Application.proxy(path))
   }
}
        

// @LINE:9
case controllers_Application_options4_route(params) => {
   call(Param[String]("path", Right(""))) { (path) =>
        controllers_Application_options4_invoker.call(controllers.Application.options(path))
   }
}
        

// @LINE:10
case controllers_Application_options5_route(params) => {
   call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_options5_invoker.call(controllers.Application.options(path))
   }
}
        
}

}
     