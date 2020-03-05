import react.dom.h1
import react.dom.render
import kotlin.browser.document

fun main() {
    render(document.getElementById("root")) {
        h1 {
            +"Kotlin React SVG"
        }

        // just calling it for example
        // might not work like this if build goes successful..
        child(svgRainDay.default)
    }
}