// @SOURCE:/home/crankycode/Documents/Play/Play 2.1.1/MallAppServer/conf/routes
// @HASH:7020831ed05e684a1d6fa8410bb45af22fe2e5cb
// @DATE:Tue Jul 21 17:45:14 SGT 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:1
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:3
private[this] lazy val controllers_Products_list1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products"))))
        

// @LINE:4
private[this] lazy val controllers_Products_details2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"),DynamicPart("ean", """[^/]+""",true))))
        

// @LINE:5
private[this] lazy val controllers_Products_save3 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"),DynamicPart("ean", """[^/]+""",true))))
        

// @LINE:7
private[this] lazy val controllers_ProductsWithCombinators_details4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"),DynamicPart("ean", """[^/]+""",true),StaticPart("/combinators"))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products""","""controllers.Products.list"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/$ean<[^/]+>""","""controllers.Products.details(ean:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/$ean<[^/]+>""","""controllers.Products.save(ean:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/$ean<[^/]+>/combinators""","""controllers.ProductsWithCombinators.details(ean:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:1
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:3
case controllers_Products_list1(params) => {
   call { 
        invokeHandler(controllers.Products.list, HandlerDef(this, "controllers.Products", "list", Nil,"GET", """""", Routes.prefix + """products"""))
   }
}
        

// @LINE:4
case controllers_Products_details2(params) => {
   call(params.fromPath[String]("ean", None)) { (ean) =>
        invokeHandler(controllers.Products.details(ean), HandlerDef(this, "controllers.Products", "details", Seq(classOf[String]),"GET", """""", Routes.prefix + """products/$ean<[^/]+>"""))
   }
}
        

// @LINE:5
case controllers_Products_save3(params) => {
   call(params.fromPath[String]("ean", None)) { (ean) =>
        invokeHandler(controllers.Products.save(ean), HandlerDef(this, "controllers.Products", "save", Seq(classOf[String]),"PUT", """""", Routes.prefix + """products/$ean<[^/]+>"""))
   }
}
        

// @LINE:7
case controllers_ProductsWithCombinators_details4(params) => {
   call(params.fromPath[String]("ean", None)) { (ean) =>
        invokeHandler(controllers.ProductsWithCombinators.details(ean), HandlerDef(this, "controllers.ProductsWithCombinators", "details", Seq(classOf[String]),"GET", """""", Routes.prefix + """products/$ean<[^/]+>/combinators"""))
   }
}
        

// @LINE:9
case controllers_Assets_at5(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        