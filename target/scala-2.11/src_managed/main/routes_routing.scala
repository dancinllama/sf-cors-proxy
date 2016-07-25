// @SOURCE:/Users/jlo/workspace/sf-cors-proxy/conf/routes
// @HASH:51e541ef623bb3a15a6478a3dda3498a6d81980b
// @DATE:Sun Jul 24 23:37:24 CDT 2016


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
private[this] lazy val controllers_Application_loginProxy0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("path", """.+""",false))))
private[this] lazy val controllers_Application_loginProxy0_invoker = createInvoker(
controllers.Application.loginProxy(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loginProxy", Seq(classOf[String]),"GET", """""", Routes.prefix + """$path<.+>"""))
        

// @LINE:6
private[this] lazy val controllers_Application_loginProxy1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("path", """.+""",false))))
private[this] lazy val controllers_Application_loginProxy1_invoker = createInvoker(
controllers.Application.loginProxy(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loginProxy", Seq(classOf[String]),"POST", """""", Routes.prefix + """$path<.+>"""))
        

// @LINE:7
private[this] lazy val controllers_Application_loginProxy2_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("path", """.+""",false))))
private[this] lazy val controllers_Application_loginProxy2_invoker = createInvoker(
controllers.Application.loginProxy(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loginProxy", Seq(classOf[String]),"PUT", """""", Routes.prefix + """$path<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$path<.+>""","""controllers.Application.loginProxy(path:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$path<.+>""","""controllers.Application.loginProxy(path:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$path<.+>""","""controllers.Application.loginProxy(path:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Application_loginProxy2_route(params) => {
   call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_loginProxy2_invoker.call(controllers.Application.loginProxy(path))
   }
}
        
}

}
     