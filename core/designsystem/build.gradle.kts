plugins {
    alias(libs.plugins.mju.android.compose.library)
}

android {
    namespace = "com.mju.designsystem"
}
dependencies {
    implementation(libs.flexible.bottomsheet)
}