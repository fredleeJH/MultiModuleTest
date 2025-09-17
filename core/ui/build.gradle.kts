plugins {
    alias(libs.plugins.mju.android.compose.library)
}

android {
    namespace = "com.mju.ui"
}

dependencies {
    androidTestImplementation(libs.bundles.coil)
}