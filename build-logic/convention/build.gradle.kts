plugins {
    `kotlin-dsl`
}
group = "com.mju.convention"

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.ksp.gradle.plugin)
    compileOnly(libs.compose.compiler.extension)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "mju.android.application"
            implementationClass = "AndroidApplicationPlugin"
        }
        register("buildConfig") {
            id = "mju.android.build.config"
            implementationClass = "BuildConfigPlugin"
        }
        register("androidLibrary") {
            id = "mju.android.library"
            implementationClass = "AndroidLibraryPlugin"
        }
        register("androidComposeLibrary") {
            id = "mju.android.compose.library"
            implementationClass = "AndroidComposeLibraryPlugin"
        }
        register("javaLibrary") {
            id = "mju.android.java.library"
            implementationClass = "JavaLibraryPlugin"
        }
        register("androidTest") {
            id = "mju.android.test"
            implementationClass = "AndroidTestPlugin"
        }
        register("unitTest") {
            id = "mju.android.unittest"
            implementationClass = "UnitTestPlugin"
        }
        register("androidHilt") {
            id = "mju.android.hilt"
            implementationClass = "HiltPlugin"
        }
        register("mjuFeature") {
            id = "mju.feature"
            implementationClass = "MjuFeaturePlugin"
        }
        register("mjuData") {
            id = "mju.data"
            implementationClass = "MjuDataPlugin"
        }
    }
}