plugins {
    alias(libs.plugins.mju.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.mju.android.hilt)
}

android {
    namespace = "com.multi.module.template"

    signingConfigs {
        getByName("debug") {
            keyAlias = "androiddebugkey"
            keyPassword = "android"
            storeFile = file("debug.keystore")
        }
    }

    buildTypes {
        debug {
            signingConfig = signingConfigs.getByName("debug")
        }
        release {
            signingConfig = signingConfigs.getByName("debug")
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(projects.feature.home)
    implementation(projects.feature.main)
    implementation(projects.feature.mypage)
    implementation(projects.domain.home)
    implementation(projects.core.ui)
    implementation(projects.core.network)
    implementation(projects.core.model)
    implementation(projects.core.designsystem)
    implementation(projects.core.common)
    implementation(projects.core.buildconfig)
    implementation(projects.core.navigation)
    implementation(projects.data.home)
}