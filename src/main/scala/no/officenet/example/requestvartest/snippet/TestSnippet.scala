package no.officenet.example.requestvartest.snippet

import net.liftweb._
import common.{Full, Empty, Box}
import http._
import util.Helpers._

class TestSnippet {

	object fiskVar extends RequestVar[Box[String]](Empty)

	def render = {
		fiskVar.set(Full("fiskVar from render"))
		":text" #> SHtml.text("", (s) => {
			println("submit assignment-callback: fiskVar: " + fiskVar.get) // Prints Empty
		}, "onblur" -> SHtml.onEvent((s) => {
			println("onblur: fiskVar: " + fiskVar.get)
		})._2.toJsCmd) &
		":submit" #> SHtml.ajaxSubmit("Drus", () => {})
	}

}
