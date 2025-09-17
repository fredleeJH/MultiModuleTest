plugins {
    alias(libs.plugins.mju.data)
}

android {
    namespace = "com.mju.home"
}
dependencies {
    implementation(projects.domain.home)
}