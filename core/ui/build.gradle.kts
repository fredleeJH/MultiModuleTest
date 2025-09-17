plugins {
    alias(libs.plugins.mju.android.library)
}

android {
    namespace = "com.mju.ui"
}

dependencies {
    androidTestImplementation(libs.bundles.coil)
}