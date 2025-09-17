plugins {
    alias(libs.plugins.mju.android.compose.library)
}

android {
    namespace = "com.mju.designsystem"
}
dependencies {
    implementation(projects.core.ui)
    implementation(libs.flexible.bottomsheet)
}