package com.mju.convention

import com.android.build.api.dsl.CommonExtension
import com.mju.convention.extension.getBundle
import com.mju.convention.extension.implementation
import com.mju.convention.extension.libs
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureKotlinCoroutine(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    commonExtension.apply {
        dependencies {
            implementation(libs.getBundle("coroutine"))
        }
    }
}