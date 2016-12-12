
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object main_Scope1 {
import controllers.security.LoginController
import controllers.security

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.57*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*8.62*/("""
        """),format.raw/*9.9*/("""<title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.versioned("images/favicon.png")),format.raw/*13.104*/("""">
    </head>
    <body>
    <!-- start of nav section -->
    <nav class="navbar navbar-inverse">
            <!-- nav header/ branding -->
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Product Catalogue</a>
            </div>
            <!-- List containing nav links -->
            <ul class="nav navbar-nav">
                <li """),_display_(/*24.22*/if(title == "Home")/*24.41*/{_display_(Seq[Any](format.raw/*24.42*/("""class="active"""")))}),format.raw/*24.57*/(""">
                    <a href=""""),_display_(/*25.31*/routes/*25.37*/.HomeController.index()),format.raw/*25.60*/("""">Home</a>
                </li>
                <li """),_display_(/*27.22*/if(title == "About")/*27.42*/{_display_(Seq[Any](format.raw/*27.43*/("""class="active"""")))}),format.raw/*27.58*/(""">
                    <a href=""""),_display_(/*28.31*/routes/*28.37*/.HomeController.about()),format.raw/*28.60*/("""">About Us</a>
                </li>
                <li """),_display_(/*30.22*/if(title == "Products")/*30.45*/{_display_(Seq[Any](format.raw/*30.46*/("""class="active"""")))}),format.raw/*30.61*/(""">
                    <a href=""""),_display_(/*31.31*/routes/*31.37*/.HomeController.products()),format.raw/*31.63*/("""">Products</a>
                </li>
                <!-- Login/ Logout  Link - Check if user logged in-->
                <li """),_display_(/*34.22*/if(title == "Login")/*34.42*/{_display_(Seq[Any](format.raw/*34.43*/("""class="active"""")))}),format.raw/*34.58*/(""">
                    """),_display_(/*35.22*/if(user != null)/*35.38*/ {_display_(Seq[Any](format.raw/*35.40*/("""
                        """),format.raw/*36.25*/("""<a href=""""),_display_(/*36.35*/controllers/*36.46*/.security.routes.LoginController.logout()),format.raw/*36.87*/("""">Logout """),_display_(/*36.97*/user/*36.101*/.getName()),format.raw/*36.111*/("""</a>
                    """)))}/*37.23*/else/*37.28*/{_display_(Seq[Any](format.raw/*37.29*/("""
                        """),format.raw/*38.25*/("""<a href=""""),_display_(/*38.35*/controllers/*38.46*/.security.routes.LoginController.login()),format.raw/*38.86*/("""">Login</a>
                    """)))}),format.raw/*39.22*/("""
                """),format.raw/*40.17*/("""</li>
            </ul>
    </nav>
    
    <div class="container-fluid">
        """),format.raw/*46.32*/("""
        """),_display_(/*47.10*/content),format.raw/*47.17*/("""
    """),format.raw/*48.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*57.19*/routes/*57.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*57.66*/("""" type="text/javascript"></script>
</html>

"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}
}

/**/
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Mon Dec 12 11:56:02 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/test/play-crud6-image-upload/app/views/main.scala.html
                  HASH: 0da51b6284b999f25076798eea8ad7d9e15a10ac
                  MATRIX: 865->77|1015->132|1045->136|1127->244|1163->254|1197->262|1222->267|1500->518|1515->524|1578->565|1667->627|1682->633|1743->672|2161->1063|2189->1082|2228->1083|2274->1098|2334->1131|2349->1137|2393->1160|2476->1216|2505->1236|2544->1237|2590->1252|2650->1285|2665->1291|2709->1314|2796->1374|2828->1397|2867->1398|2913->1413|2973->1446|2988->1452|3035->1478|3193->1609|3222->1629|3261->1630|3307->1645|3358->1669|3383->1685|3423->1687|3477->1713|3514->1723|3534->1734|3596->1775|3633->1785|3647->1789|3679->1799|3725->1827|3738->1832|3777->1833|3831->1859|3868->1869|3888->1880|3949->1920|4014->1954|4060->1972|4175->2150|4213->2161|4241->2168|4274->2174|4645->2518|4660->2524|4722->2565
                  LINES: 31->3|36->3|38->5|41->8|42->9|42->9|42->9|45->12|45->12|45->12|46->13|46->13|46->13|57->24|57->24|57->24|57->24|58->25|58->25|58->25|60->27|60->27|60->27|60->27|61->28|61->28|61->28|63->30|63->30|63->30|63->30|64->31|64->31|64->31|67->34|67->34|67->34|67->34|68->35|68->35|68->35|69->36|69->36|69->36|69->36|69->36|69->36|69->36|70->37|70->37|70->37|71->38|71->38|71->38|71->38|72->39|73->40|78->46|79->47|79->47|80->48|89->57|89->57|89->57
                  -- GENERATED --
              */
          