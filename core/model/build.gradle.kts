plugins {
    alias(libs.plugins.mju.android.library)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.mju.model"
}
dependencies {
    implementation(libs.kotlinx.serialization.json)
    implementation(projects.core.designsystem)
}