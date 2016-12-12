
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminMain_Scope0 {
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

     object adminMain_Scope1 {
import controllers.security.LoginController
import controllers.security

class adminMain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

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
                <a class="navbar-brand" href="/admin/products">Product Admin</a>
            </div>
            <!-- List containing nav links -->
            <ul class="nav navbar-nav">
                <li """),_display_(/*24.22*/if(title == "Products")/*24.45*/{_display_(Seq[Any](format.raw/*24.46*/("""class="active"""")))}),format.raw/*24.61*/(""">
                    <a href=""""),_display_(/*25.31*/routes/*25.37*/.AdminController.products()),format.raw/*25.64*/("""">Products</a>
                </li>
                <!-- Login/ Logout  Link - Check if user logged in-->
                <li """),_display_(/*28.22*/if(title == "Login")/*28.42*/{_display_(Seq[Any](format.raw/*28.43*/("""class="active"""")))}),format.raw/*28.58*/(""">
                    """),_display_(/*29.22*/if(user != null)/*29.38*/ {_display_(Seq[Any](format.raw/*29.40*/("""
                        """),format.raw/*30.25*/("""<a href=""""),_display_(/*30.35*/controllers/*30.46*/.security.routes.LoginController.logout()),format.raw/*30.87*/("""">Logout """),_display_(/*30.97*/user/*30.101*/.getName()),format.raw/*30.111*/("""</a>
                    """)))}/*31.23*/else/*31.28*/{_display_(Seq[Any](format.raw/*31.29*/("""
                        """),format.raw/*32.25*/("""<a href=""""),_display_(/*32.35*/controllers/*32.46*/.security.routes.LoginController.login()),format.raw/*32.86*/("""">Login</a>
                    """)))}),format.raw/*33.22*/("""
                """),format.raw/*34.17*/("""</li>
            </ul>
    </nav>
    
    <div class="container-fluid">
        """),format.raw/*40.32*/("""
        """),_display_(/*41.10*/content),format.raw/*41.17*/("""
    """),format.raw/*42.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*51.19*/routes/*51.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*51.66*/("""" type="text/javascript"></script>
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
object adminMain extends adminMain_Scope0.adminMain_Scope1.adminMain
              /*
                  -- GENERATED --
                  DATE: Mon Dec 12 11:56:02 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/test/play-crud6-image-upload/app/views/admin/adminMain.scala.html
                  HASH: 96f08db6f04e5db02ffd16d53c5cff2a9affa398
                  MATRIX: 886->77|1036->132|1066->136|1148->244|1184->254|1218->262|1243->267|1521->518|1536->524|1599->565|1688->627|1703->633|1764->672|2192->1073|2224->1096|2263->1097|2309->1112|2369->1145|2384->1151|2432->1178|2590->1309|2619->1329|2658->1330|2704->1345|2755->1369|2780->1385|2820->1387|2874->1413|2911->1423|2931->1434|2993->1475|3030->1485|3044->1489|3076->1499|3122->1527|3135->1532|3174->1533|3228->1559|3265->1569|3285->1580|3346->1620|3411->1654|3457->1672|3572->1850|3610->1861|3638->1868|3671->1874|4042->2218|4057->2224|4119->2265
                  LINES: 31->3|36->3|38->5|41->8|42->9|42->9|42->9|45->12|45->12|45->12|46->13|46->13|46->13|57->24|57->24|57->24|57->24|58->25|58->25|58->25|61->28|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|63->30|63->30|63->30|63->30|64->31|64->31|64->31|65->32|65->32|65->32|65->32|66->33|67->34|72->40|73->41|73->41|74->42|83->51|83->51|83->51
                  -- GENERATED --
              */
          