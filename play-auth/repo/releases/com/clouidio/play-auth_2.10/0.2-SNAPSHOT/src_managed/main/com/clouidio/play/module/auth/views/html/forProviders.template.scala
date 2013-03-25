
package com.clouidio.play.module.auth.views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object forProviders extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Boolean,Boolean,Boolean,_root_.scala.Function1[com.clouidio.play.module.auth.providers.AuthProvider, Html],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(skipCurrent: Boolean = false, showInternal: Boolean = false, showExternal: Boolean = true)(body: com.clouidio.play.module.auth.providers.AuthProvider => Html):play.api.templates.Html = {
        _display_ {import com.clouidio.play.module.auth.PlayAuthenticate

import com.clouidio.play.module.auth.providers.AuthProvider.Registry


Seq[Any](format.raw/*1.161*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/defining(Registry.getProviders())/*6.35*/ { providers =>_display_(Seq[Any](format.raw/*6.50*/("""
	"""),_display_(Seq[Any](/*7.3*/if(providers != null && providers.size() > 0)/*7.48*/ {_display_(Seq[Any](format.raw/*7.50*/("""
		"""),_display_(Seq[Any](/*8.4*/defining(PlayAuthenticate.isLoggedIn(session()))/*8.52*/ { loggedIn =>_display_(Seq[Any](format.raw/*8.66*/("""
			"""),_display_(Seq[Any](/*9.5*/defining(PlayAuthenticate.getUser(session()))/*9.50*/ { auth =>_display_(Seq[Any](format.raw/*9.60*/("""
			    """),_display_(Seq[Any](/*10.9*/for(p <- providers) yield /*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
			    	"""),_display_(Seq[Any](/*11.10*/if(((showExternal && p.isExternal()) || (showInternal && !p.isExternal())) && (!loggedIn || !skipCurrent || (skipCurrent && (loggedIn && !p.getKey().equals(auth.getProvider())))))/*11.189*/ {_display_(Seq[Any](format.raw/*11.191*/("""
			    		"""),_display_(Seq[Any](/*12.11*/body(p))),format.raw/*12.18*/("""
			    	""")))})),format.raw/*13.10*/("""
			    """)))})),format.raw/*14.9*/("""
		    """)))})),format.raw/*15.8*/("""
	    """)))})),format.raw/*16.7*/("""
	""")))})),format.raw/*17.3*/("""
""")))})))}
    }
    
    def render(skipCurrent:Boolean,showInternal:Boolean,showExternal:Boolean,body:_root_.scala.Function1[com.clouidio.play.module.auth.providers.AuthProvider, Html]): play.api.templates.Html = apply(skipCurrent,showInternal,showExternal)(body)
    
    def f:((Boolean,Boolean,Boolean) => (_root_.scala.Function1[com.clouidio.play.module.auth.providers.AuthProvider, Html]) => play.api.templates.Html) = (skipCurrent,showInternal,showExternal) => (body) => apply(skipCurrent,showInternal,showExternal)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Mar 25 11:33:08 PDT 2013
                    SOURCE: /Users/502065961/Development/phmhealth/phm/play/play-auth/code/app/com/clouidio/play/module/auth/views/forProviders.scala.html
                    HASH: 2ef3567437f1feb583ff1e2568aef20aec0c28a2
                    MATRIX: 860->1|1221->160|1249->287|1285->289|1326->322|1378->337|1415->340|1468->385|1507->387|1545->391|1601->439|1652->453|1691->458|1744->503|1791->513|1835->522|1870->541|1910->543|1956->553|2145->732|2186->734|2233->745|2262->752|2304->762|2344->771|2383->779|2421->786|2455->789
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|42->13|43->14|44->15|45->16|46->17
                    -- GENERATED --
                */
            