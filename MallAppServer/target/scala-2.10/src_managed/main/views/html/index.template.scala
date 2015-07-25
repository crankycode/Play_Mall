
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
  <title>Products</title>
  <link rel='stylesheet' type='text/css'
    href='"""),_display_(Seq[Any](/*6.12*/routes/*6.18*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*6.57*/("""'>
  <link rel='stylesheet' type='text/css'
    href=""""),_display_(Seq[Any](/*8.12*/routes/*8.18*/.Assets.at("stylesheets/main.css"))),format.raw/*8.52*/("""">
  <script src='"""),_display_(Seq[Any](/*9.17*/routes/*9.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*9.68*/("""'
    type='text/javascript'></script>
  <script src='"""),_display_(Seq[Any](/*11.17*/routes/*11.23*/.Assets.at("javascripts/products.js"))),format.raw/*11.60*/("""'
    type='text/javascript'></script>
</head>
<body>
<div class="screenshot">

  <div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
      <div class="container">
        <a class="brand" href=""""),_display_(Seq[Any](/*20.33*/routes/*20.39*/.Application.index())),format.raw/*20.59*/("""">
           Product catalog
        </a>
        <ul class="nav"></ul>
      </div>
    </div>
  </div>

<div class="container">
  <table data-list=""""),_display_(Seq[Any](/*29.22*/routes/*29.28*/.Products.list)),format.raw/*29.42*/(""""
    data-details=""""),_display_(Seq[Any](/*30.20*/routes/*30.26*/.Products.details("0"))),format.raw/*30.48*/("""">
  </table>
</div>

</div>
</body>
</html>
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 21 17:49:36 SGT 2015
                    SOURCE: /home/crankycode/Documents/Play/Play 2.1.1/MallAppServer/app/views/index.scala.html
                    HASH: 87cf5c1f4a1a11666fd6dd4b9c796a05e5d2dc2f
                    MATRIX: 569->0|712->108|726->114|786->153|876->208|890->214|945->248|999->267|1013->273|1079->318|1170->373|1185->379|1244->416|1493->629|1508->635|1550->655|1738->807|1753->813|1789->827|1846->848|1861->854|1905->876
                    LINES: 22->1|27->6|27->6|27->6|29->8|29->8|29->8|30->9|30->9|30->9|32->11|32->11|32->11|41->20|41->20|41->20|50->29|50->29|50->29|51->30|51->30|51->30
                    -- GENERATED --
                */
            