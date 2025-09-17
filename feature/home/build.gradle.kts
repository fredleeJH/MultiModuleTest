plugins {
    alias(libs.plugins.mju.feature)
}
android {
    namespace = "com.mju.home"
}

dependencies {
   implementation(projects.domain.home)
}