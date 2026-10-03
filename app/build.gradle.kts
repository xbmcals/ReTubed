plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }
android {
    namespace = "app.retubed"
    compileSdk = 34
    defaultConfig {
        applicationId = "app.retubed"
        minSdk = 24            // Android 7.0
        targetSdk = 34
        versionCode = 1
        versionName = "0.1"
    }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
    kotlinOptions { jvmTarget = "17" }
}
dependencies {
    // TODO: pin the ReVanced patcher + patches versions you build on, e.g.
    // implementation("app.revanced:revanced-patcher:<version>")
    // and bundle the patches file in assets/. Split-APK merging needs a merger (e.g. APKEditor).
}
