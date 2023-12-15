import com.blueguard.pilltime.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidRoomConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target)
        {
            pluginManager.apply("com.google.devtools.ksp")
            dependencies {
                "implementation"(libs.findLibrary("room.ktx").get())
                "implementation"(libs.findLibrary("room.runtime").get())
                "ksp"(libs.findLibrary("room.compiler").get())
            }
        }
    }
}
