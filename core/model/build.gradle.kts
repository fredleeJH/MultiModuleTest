plugins {
    alias(libs.plugins.mju.android.java.library)
    alias(libs.plugins.kotlin.serialization)
}
dependencies {
    implementation(libs.kotlinx.serialization.json)
}