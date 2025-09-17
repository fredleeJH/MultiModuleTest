plugins {
    alias(libs.plugins.mju.feature)
}
android {
    namespace = "com.mju.main"
}

dependencies {
    implementation(projects.feature.home)
    implementation(projects.feature.mypage)
    implementation(libs.androidx.splashscreen)
    implementation(libs.lottie)
    implementation(libs.lottie.compose)
    implementation(libs.material3.compose)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.google.material)
}