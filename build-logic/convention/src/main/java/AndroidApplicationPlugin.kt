import com.android.build.api.dsl.ApplicationExtension
import com.mju.convention.configureAndroidCompose
import com.mju.convention.configureKotlinAndroid
import com.mju.convention.extension.getVersion
import com.mju.convention.extension.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationPlugin: Plugin<Project> {
    override fun apply(target: Project) {
       with(target){
           with(pluginManager) {
               apply("com.android.application")
           }
           extensions.configure<ApplicationExtension> {
               configureKotlinAndroid(this)
               configureAndroidCompose(this)
               with(defaultConfig) {
                   targetSdk = libs.getVersion("targetSdk").requiredVersion.toInt()
                   versionCode = libs.getVersion("versionCode").requiredVersion.toInt()
                   versionName = libs.getVersion("versionName").requiredVersion
               }
           }
       }
    }
}