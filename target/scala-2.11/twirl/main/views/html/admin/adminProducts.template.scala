
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminProducts_Scope0 {
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

class adminProducts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/admin/*4.7*/.adminMain("Products", user)/*4.35*/ {_display_(Seq[Any](format.raw/*4.37*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.AdminController.products(0)),format.raw/*11.61*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*15.18*/for(c <- categories) yield /*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
                    """),format.raw/*16.21*/("""<a href=""""),_display_(/*16.31*/routes/*16.37*/.AdminController.products(c.getId)),format.raw/*16.71*/("""" class="list-group-item">"""),_display_(/*16.98*/c/*16.99*/.getName),format.raw/*16.107*/("""
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
            <th>ID</th>
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
			        """),format.raw/*45.12*/("""<tr>
                  <td>"""),_display_(/*46.24*/p/*46.25*/.getId),format.raw/*46.31*/("""</td>
                  <td>"""),_display_(/*47.24*/p/*47.25*/.getName),format.raw/*47.33*/("""</td>
                  <td>"""),_display_(/*48.24*/p/*48.25*/.getCategory.getName),format.raw/*48.45*/("""</td>
                  <td>"""),_display_(/*49.24*/p/*49.25*/.getDescription),format.raw/*49.40*/("""</td>
                  <td>"""),_display_(/*50.24*/p/*50.25*/.getStock),format.raw/*50.34*/("""</td>
                  <td>&euro; """),_display_(/*51.31*/("%.2f".format(p.getPrice))),format.raw/*51.58*/("""</td>

                  <!-- Edit product button -->
                  <td>
                      <a href=""""),_display_(/*55.33*/routes/*55.39*/.AdminController.updateProduct(p.getId)),format.raw/*55.78*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*60.33*/routes/*60.39*/.AdminController.deleteProduct(p.getId)),format.raw/*60.78*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				    </tr>
					""")))}),format.raw/*66.7*/(""" """),format.raw/*66.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*70.21*/routes/*70.27*/.AdminController.addProduct()),format.raw/*70.56*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*79.27*/("""{"""),format.raw/*79.28*/("""
        """),format.raw/*80.9*/("""return confirm('Are you sure?');
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/("""
  """),format.raw/*82.3*/("""</script>

  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


}

/**/
object adminProducts extends adminProducts_Scope0.adminProducts
              /*
                  -- GENERATED --
                  DATE: Mon Dec 12 11:56:02 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/test/play-crud6-image-upload/app/views/admin/adminProducts.scala.html
                  HASH: 33206f2ec2d972e903633e750479d959f41a1bcd
                  MATRIX: 821->1|1008->93|1038->97|1098->130|1126->131|1172->150|1200->151|1228->152|1276->175|1288->180|1324->208|1363->210|1393->214|1665->459|1680->465|1729->493|1984->721|2020->741|2060->743|2110->765|2147->775|2162->781|2217->815|2271->842|2281->843|2311->851|2363->875|2411->896|2421->897|2461->916|2544->968|2586->982|2679->1048|2720->1080|2760->1082|2804->1098|2881->1148|2895->1153|2931->1168|2975->1184|3025->1203|3065->1215|3572->1695|3606->1713|3646->1715|3687->1728|3743->1757|3753->1758|3780->1764|3837->1794|3847->1795|3876->1803|3933->1833|3943->1834|3984->1854|4041->1884|4051->1885|4087->1900|4144->1930|4154->1931|4184->1940|4248->1977|4296->2004|4436->2117|4451->2123|4511->2162|4775->2399|4790->2405|4850->2444|5113->2677|5141->2678|5265->2775|5280->2781|5330->2810|5602->3054|5631->3055|5668->3065|5733->3103|5761->3104|5792->3108
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|42->11|42->11|42->11|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|50->19|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|60->29|75->44|75->44|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|86->55|86->55|86->55|91->60|91->60|91->60|97->66|97->66|101->70|101->70|101->70|110->79|110->79|111->80|112->81|112->81|113->82
                  -- GENERATED --
              */
          