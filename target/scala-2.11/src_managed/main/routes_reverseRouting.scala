// @SOURCE:/Users/jlo/workspace/sf-cors-proxy/conf/routes
// @HASH:58be8817d4ba1646ed468652172652878df35e41
// @DATE:Sun Jul 24 22:52:02 CDT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {


// @LINE:8
// @LINE:7
def proxy(path:String): Call = {
   (path: @unchecked) match {
// @LINE:7
case (path)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("path", path))
                                         
   }
}
                                                

// @LINE:6
// @LINE:5
def loginProxy(path:String): Call = {
   (path: @unchecked) match {
// @LINE:5
case (path)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "services/oauth2/" + implicitly[PathBindable[String]].unbind("path", path))
                                         
   }
}
                                                

// @LINE:10
// @LINE:9
def options(path:String): Call = {
   (path: @unchecked) match {
// @LINE:9
case (path) if path == "" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "")))
  Call("OPTIONS", _prefix)
                                         
// @LINE:10
case (path)  =>
  import ReverseRouteContext.empty
  Call("OPTIONS", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("path", path))
                                         
   }
}
                                                

}
                          
}
                  


// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {


// @LINE:8
// @LINE:7
def proxy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.proxy",
   """
      function(path) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", path)})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", path)})
      }
      }
   """
)
                        

// @LINE:6
// @LINE:5
def loginProxy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loginProxy",
   """
      function(path) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "services/oauth2/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", path)})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "services/oauth2/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", path)})
      }
      }
   """
)
                        

// @LINE:10
// @LINE:9
def options : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.options",
   """
      function(path) {
      if (path == """ + implicitly[JavascriptLitteral[String]].to("") + """) {
      return _wA({method:"OPTIONS", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"OPTIONS", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", path)})
      }
      }
   """
)
                        

}
              
}
        


// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {


// @LINE:7
def proxy(path:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.proxy(path), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "proxy", Seq(classOf[String]), "GET", """""", _prefix + """$path<.+>""")
)
                      

// @LINE:5
def loginProxy(path:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loginProxy(path), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loginProxy", Seq(classOf[String]), "GET", """""", _prefix + """services/oauth2/$path<.+>""")
)
                      

// @LINE:9
def options(path:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.options(path), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "options", Seq(classOf[String]), "OPTIONS", """""", _prefix + """""")
)
                      

}
                          
}
        
    