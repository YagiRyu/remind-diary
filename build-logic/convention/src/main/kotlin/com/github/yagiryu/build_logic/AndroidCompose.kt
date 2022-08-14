internal fun Project.configureAndroidCompose(
  commonExtension: CommonExtension<*, *, *, *>
) {
  val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
  commonExtension.apply {
    buildFeatures {
      compose = true
    }
    commonOptions {
      kotlinCompilerExtensionVersion = libs.findVersion("compose").get().toString()
    }
  }
}
