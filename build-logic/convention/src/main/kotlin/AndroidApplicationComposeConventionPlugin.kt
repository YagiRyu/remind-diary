class AndroidApplicationComposeConventionPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    with(target) {
      pluginManger.apply("com.android.application")
      val extension = extension.getByType<BaseAppModuleExtension>()
      configureAndroidCompose(extension)
    }
  }
}