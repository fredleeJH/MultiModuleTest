import com.mju.convention.extension.getBundle
import com.mju.convention.extension.getLibrary
import com.mju.convention.extension.implementation
import com.mju.convention.extension.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class MjuFeaturePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("mju.android.compose.library")
                apply("mju.android.hilt")
                apply("org.jetbrains.kotlin.plugin.serialization")
            }

            dependencies {
                implementation(libs.getLibrary("kotlinx.serialization.json"))
//                implementation(project(":core:ui"))
//                implementation(project(":core:designsystem"))
//                implementation(project(":core:model"))
//                implementation(project(":core:navigation"))
                implementation(libs.getBundle("compose"))
            }
        }
    }
}