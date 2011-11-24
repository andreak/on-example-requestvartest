package bootstrap.liftweb

import net.liftweb.http._
import net.liftweb.http.js.jquery.JQuery14Artifacts


class Boot {
	def boot() {
		LiftRules.addToPackages("no.officenet.example.requestvartest")

		LiftRules.jsArtifacts = JQuery14Artifacts

	}

}
