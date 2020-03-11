import react.ReactElement

@JsModule("svg/rain-day.svg")
external val svgRainDay: SvgrModule

interface SvgrModule {
    val default: () -> ReactElement
}