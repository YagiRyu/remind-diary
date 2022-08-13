plugins {
  `kotlin-dsl`
}

group = "com.github.yagiryu.remind_diary.buildlogic"

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
  implementation(libs.android.gradlePlugin)
  implementation(libs.kotlin.gradlePlugin)
}

gradlePlugin {
  plugins {
    register("androidApplicationCompose") {
      id = "reminddiary.android.application.compose"
      implementationClass = "AndroidApplicationComposeConventionPlugin"
    }
    register("androidApplication") {
      id = "reminddiary.android.application"
      implementationClass = "AndroidApplicationConventionPlugin"
    }
    register("androidLibraryCompose") {
      id = "reminddiary.android.library.compose"
      implementationClass = "AndroidLibraryComposeConventionPlugin"
    }
    register("androidLibrary") {
      id = "reminddiary.android.library"
      implementationClass = "AndroidLibraryConventionPlugin"
    }
    register("androidFeature") {
      id = "reminddiary.android.feature"
      implementationClass = "AndroidFeatureConventionPlugin"
    }
    reigster("androidTest") {
      id = "reminddiary.android.text"
      implementationClass = "AndroidTestConventionPlugin"
    }
  }
}
