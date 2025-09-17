plugins {
    alias(libs.plugins.mju.android.library)
    alias(libs.plugins.mju.android.build.config)
    alias(libs.plugins.mju.android.hilt)
    alias(libs.plugins.mju.android.test)
}

android {
    namespace = "com.mju.buildconfig"
}
dependencies {
    implementation(projects.core.common)
}