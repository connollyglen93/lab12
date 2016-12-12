
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

     object addProduct_Scope1 {
import helper._

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addProductForm: play.data.Form[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.102*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/admin/*8.7*/.adminMain("Add Product", user)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
	"""),format.raw/*9.2*/("""<h3>Add a new Product</h3>
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*11.3*/form(action = routes.AdminController.addProductSubmit(), 'class -> "form-horizontal",
		'role->"form", 'enctype -> "multipart/form-data")/*12.52*/ {_display_(Seq[Any](format.raw/*12.54*/("""
		
		"""),format.raw/*14.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*16.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*16.81*/("""
		"""),_display_(/*17.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*17.95*/("""

		"""),_display_(/*19.4*/select(
			addProductForm("category.id"),
			
			options(Category.options),
			'_label -> "Category", '_default -> "-- Choose a category --",
			'_showConstraints -> false, 'class -> "form-control"
		)),format.raw/*25.4*/("""
		"""),_display_(/*26.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*26.83*/("""
		"""),_display_(/*27.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*27.83*/("""

		"""),format.raw/*29.3*/("""<!-- Image upload input -->
		<div class="container-fluid">
			<div class="row">
				<label>Image</label>
			</div>
			<div class="row">
				"""),_display_(/*35.6*/if(env.resource("public/images/productImages/thumbnails/" + addProductForm("id").value() + ".jpg").isDefined)/*35.115*/ {_display_(Seq[Any](format.raw/*35.117*/("""
					"""),format.raw/*36.6*/("""<p><img src="/assets/images/productImages/thumbnails/"""),_display_(/*36.60*/(addProductForm("id").value() + ".jpg")),format.raw/*36.99*/(""""/></p>
				""")))}/*37.7*/else/*37.12*/{_display_(Seq[Any](format.raw/*37.13*/("""
					"""),format.raw/*38.6*/("""<p><img src="/assets/images/productImages/thumbnails/noImage.png"/></p>
				""")))}),format.raw/*39.6*/("""
			"""),format.raw/*40.4*/("""</div>
			<div class="row">
				<input class="btn-sm btn-default" type="file" name="upload">
			</div>
		</div>

		<!-- Hidden ID field - required for product updates -->
		"""),_display_(/*47.4*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*47.71*/("""

	"""),format.raw/*49.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*52.14*/routes/*52.20*/.AdminController.products()),format.raw/*52.47*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*55.3*/(""" """),format.raw/*55.4*/("""<!-- End Form definition -->

""")))}),format.raw/*57.2*/(""" """),format.raw/*57.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:play.data.Form[models.Product],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user,env)

  def f:((play.data.Form[models.Product],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user,env) => apply(addProductForm,user,env)

  def ref: this.type = this

}


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Mon Dec 12 11:56:02 GMT 2016
                  SOURCE: C:/Users/Glen/Desktop/test/play-crud6-image-upload/app/views/admin/addProduct.scala.html
                  HASH: 0434fa4e9b4c49ab2fb0560d53444b090a48dd1b
                  MATRIX: 873->112|1069->212|1101->317|1131->322|1143->327|1182->358|1221->360|1250->363|1371->458|1518->596|1558->598|1593->606|1716->703|1814->780|1845->785|1957->876|1990->883|2217->1090|2248->1095|2348->1174|2379->1179|2479->1258|2512->1264|2686->1412|2805->1521|2846->1523|2880->1530|2961->1584|3021->1623|3053->1638|3066->1643|3105->1644|3139->1651|3247->1729|3279->1734|3486->1915|3574->1982|3606->1987|3767->2121|3782->2127|3830->2154|3934->2228|3962->2229|4025->2262|4053->2263
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|39->8|40->9|42->11|43->12|43->12|45->14|47->16|47->16|48->17|48->17|50->19|56->25|57->26|57->26|58->27|58->27|60->29|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|70->39|71->40|78->47|78->47|80->49|83->52|83->52|83->52|86->55|86->55|88->57|88->57
                  -- GENERATED --
              */
          