
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
object currentAuth extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[_root_.scala.Function1[com.clouidio.play.module.auth.user.AuthUser, Html],play.api.templates.Html] {

    /**/
    def apply/*1.2*/()(body: com.clouidio.play.module.auth.user.AuthUser => Html):play.api.templates.Html = {
        _display_ {import com.clouidio.play.module.auth.PlayAuthenticate


Seq[Any](format.raw/*1.63*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/defining(PlayAuthenticate.getUser(session()))/*5.47*/ { auth =>_display_(Seq[Any](format.raw/*5.57*/("""
	"""),_display_(Seq[Any](/*6.3*/body(auth))),format.raw/*6.13*/("""
""")))})))}
    }
    
    def render(body:_root_.scala.Function1[com.clouidio.play.module.auth.user.AuthUser, Html]): play.api.templates.Html = apply()(body)
    
    def f:(() => (_root_.scala.Function1[com.clouidio.play.module.auth.user.AuthUser, Html]) => play.api.templates.Html) = () => (body) => apply()(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Mar 25 11:33:08 PDT 2013
                    SOURCE: /Users/502065961/Development/phmhealth/phm/play/play-auth/code/app/com/clouidio/play/module/auth/views/currentAuth.scala.html
                    HASH: 0a01972b4389d902d3a7c8862d64986964b557d9
                    MATRIX: 826->1|1018->62|1046->119|1082->121|1135->166|1182->176|1219->179|1250->189
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6
                    -- GENERATED --
                */
            