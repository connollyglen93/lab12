
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.121*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products", user)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.HomeController.products(0)),format.raw/*11.60*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*15.18*/for(c <- categories) yield /*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
                    """),format.raw/*16.21*/("""<a href=""""),_display_(/*16.31*/routes/*16.37*/.HomeController.products(c.getId)),format.raw/*16.70*/("""" class="list-group-item">"""),_display_(/*16.97*/c/*16.98*/.getName),format.raw/*16.106*/("""
                      """),format.raw/*17.23*/("""<span class="badge">"""),_display_(/*17.44*/c/*17.45*/.getProducts.size()),format.raw/*17.64*/("""</span>
                    </a>
                """)))}),format.raw/*19.18*/("""
            """),format.raw/*20.13*/("""</div>
      </div>
      <div class="col-sm-10">

          """),_display_(/*24.12*/if(flash.containsKey("success"))/*24.44*/ {_display_(Seq[Any](format.raw/*24.46*/("""
              """),format.raw/*25.15*/("""<div class="alert alert-success">
              """),_display_(/*26.16*/flash/*26.21*/.get("success")),format.raw/*26.36*/("""
              """),format.raw/*27.15*/("""</div>
          """)))}),format.raw/*28.12*/("""
          """),format.raw/*29.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>Image</th>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*44.12*/for(p <- products) yield /*44.30*/ {_display_(Seq[Any](format.raw/*44.32*/("""
              """),format.raw/*45.15*/("""<tr>
                  <!-- Display each product field value in a column -->
                  """),_display_(/*47.20*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*47.108*/ {_display_(Seq[Any](format.raw/*47.110*/("""
                      """),format.raw/*48.23*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*48.78*/(p.getId + ".jpg")),format.raw/*48.96*/(""""/></td>
                  """)))}/*49.21*/else/*49.26*/{_display_(Seq[Any](format.raw/*49.27*/("""
                      """),format.raw/*50.23*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
                  """)))}),format.raw/*51.20*/("""
                  """),format.raw/*52.19*/("""<td>"""),_display_(/*52.24*/p/*52.25*/.getName),format.raw/*52.33*/("""</td>
                  <td>"""),_display_(/*53.24*/p/*53.25*/.getCategory.getName),format.raw/*53.45*/("""</td>
                  <td>"""),_display_(/*54.24*/p/*54.25*/.getDescription),format.raw/*54.40*/("""</td>
                  <td>"""),_display_(/*55.24*/p/*55.25*/.getStock),format.raw/*55.34*/("""</td>
                  <td>&euro; """),_display_(/*56.31*/("%.2f".format(p.getPrice))),format.raw/*56.58*/("""</td>
              </tr>
					""")))}),format.raw/*58.7*/(""" """),format.raw/*58.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
      </div>
  </div>
  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Mon Dec 12 11:56:02 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/test/play-crud6-image-upload/app/views/products.scala.html
                  HASH: f33409fea9b2cb858653daa6eb360dad8ffb4562
                  MATRIX: 826->1|1041->120|1071->124|1131->157|1159->158|1205->177|1233->178|1261->179|1309->202|1339->224|1378->226|1408->230|1680->475|1695->481|1743->508|1998->736|2034->756|2074->758|2124->780|2161->790|2176->796|2230->829|2284->856|2294->857|2324->865|2376->889|2424->910|2434->911|2474->930|2557->982|2599->996|2692->1062|2733->1094|2773->1096|2817->1112|2894->1162|2908->1167|2944->1182|2988->1198|3038->1217|3078->1229|3588->1712|3622->1730|3662->1732|3706->1748|3831->1846|3929->1934|3970->1936|4022->1960|4104->2015|4143->2033|4191->2063|4204->2068|4243->2069|4295->2093|4420->2187|4468->2207|4500->2212|4510->2213|4539->2221|4596->2251|4606->2252|4647->2272|4704->2302|4714->2303|4750->2318|4807->2348|4817->2349|4847->2358|4911->2395|4959->2422|5023->2456|5051->2457
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|42->11|42->11|42->11|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|50->19|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|60->29|75->44|75->44|75->44|76->45|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|89->58|89->58
                  -- GENERATED --
              */
          