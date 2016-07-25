// @SOURCE:/Users/jlo/workspace/sf-cors-proxy/conf/routes
// @HASH:51e541ef623bb3a15a6478a3dda3498a6d81980b
// @DATE:Sun Jul 24 23:37:24 CDT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {


// @LINE:7
// @LINE:6
// @LINE:5
def loginProxy(path:String): Call = {
   (path: @unchecked) match {
// @LINE:5
case (path)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("path", path))
                                         
   }
}
                                                

}
                          
}
                  


// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {


// @LINE:7
// @LINE:6
// @LINE:5
def loginProxy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loginProxy",
   """
      function(path) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", path)})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", path)})
      }
      if (true) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", path)})
      }
      }
   """
)
                        

}
              
}
        


// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {


// @LINE:5
def loginProxy(path:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loginProxy(path), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loginProxy", Seq(classOf[String]), "GET", """""", _prefix + """$path<.+>""")
)
                      

}
                          
}
        
    