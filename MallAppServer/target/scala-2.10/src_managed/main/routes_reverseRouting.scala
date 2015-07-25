// @SOURCE:/home/crankycode/Documents/Play/Play 2.1.1/MallAppServer/conf/routes
// @HASH:7020831ed05e684a1d6fa8410bb45af22fe2e5cb
// @DATE:Tue Jul 21 17:45:14 SGT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:1
package controllers {

// @LINE:5
// @LINE:4
// @LINE:3
class ReverseProducts {
    

// @LINE:5
def save(ean:String): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "products/" + implicitly[PathBindable[String]].unbind("ean", dynamicString(ean)))
}
                                                

// @LINE:4
def details(ean:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products/" + implicitly[PathBindable[String]].unbind("ean", dynamicString(ean)))
}
                                                

// @LINE:3
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products")
}
                                                
    
}
                          

// @LINE:1
class ReverseApplication {
    

// @LINE:1
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:7
class ReverseProductsWithCombinators {
    

// @LINE:7
def details(ean:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products/" + implicitly[PathBindable[String]].unbind("ean", dynamicString(ean)) + "/combinators")
}
                                                
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:1
package controllers.javascript {

// @LINE:5
// @LINE:4
// @LINE:3
class ReverseProducts {
    

// @LINE:5
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.save",
   """
      function(ean) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ean", encodeURIComponent(ean))})
      }
   """
)
                        

// @LINE:4
def details : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.details",
   """
      function(ean) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ean", encodeURIComponent(ean))})
      }
   """
)
                        

// @LINE:3
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
      }
   """
)
                        
    
}
              

// @LINE:1
class ReverseApplication {
    

// @LINE:1
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:7
class ReverseProductsWithCombinators {
    

// @LINE:7
def details : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductsWithCombinators.details",
   """
      function(ean) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ean", encodeURIComponent(ean)) + "/combinators"})
      }
   """
)
                        
    
}
              

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:1
package controllers.ref {

// @LINE:5
// @LINE:4
// @LINE:3
class ReverseProducts {
    

// @LINE:5
def save(ean:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.save(ean), HandlerDef(this, "controllers.Products", "save", Seq(classOf[String]), "PUT", """""", _prefix + """products/$ean<[^/]+>""")
)
                      

// @LINE:4
def details(ean:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.details(ean), HandlerDef(this, "controllers.Products", "details", Seq(classOf[String]), "GET", """""", _prefix + """products/$ean<[^/]+>""")
)
                      

// @LINE:3
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.list(), HandlerDef(this, "controllers.Products", "list", Seq(), "GET", """""", _prefix + """products""")
)
                      
    
}
                          

// @LINE:1
class ReverseApplication {
    

// @LINE:1
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:7
class ReverseProductsWithCombinators {
    

// @LINE:7
def details(ean:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductsWithCombinators.details(ean), HandlerDef(this, "controllers.ProductsWithCombinators", "details", Seq(classOf[String]), "GET", """""", _prefix + """products/$ean<[^/]+>/combinators""")
)
                      
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      