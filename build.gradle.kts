plugins {
    val kotlinVersion = "1.3.70"
    id("org.jetbrains.kotlin.js") version kotlinVersion
}

group = "kotlin-react-svg"
version = "1.0.0"

repositories {
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    jcenter()
    mavenCentral()
}

// Versions
val kotlinWrappersVersion = "pre.92-kotlin-1.3.61"
val reactVersion = "16.13.0"

dependencies {
    implementation(kotlin("stdlib-js"))

    implementation("org.jetbrains:kotlin-react:${reactVersion}-${kotlinWrappersVersion}")
    implementation("org.jetbrains:kotlin-react-dom:${reactVersion}-${kotlinWrappersVersion}")

    implementation(npm("react", reactVersion))
    implementation(npm("react-dom", reactVersion))

    implementation(npm("@svgr/webpack"))
}

kotlin {
    target {
        browser {
            useCommonJs()
        }
    }
}
