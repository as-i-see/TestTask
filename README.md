# TestTask by Yevhenii Karlov

## Configuration options

**Several configuration options and features can be set up in the Android project.**

In `app/build.gradle.kts` you can configure:
 - **Minimum SDK** Version: `minSdk = 24`
 - **Compile SDK** Version: `compileSdk = 34`
 - **Target SDK** Version: `targetSdk = 34`
 - **Compose Compiler Version**: `kotlinCompilerExtensionVersion = "1.5.14"`

To change **versions** of libraries used in the project go to `gradle/libs.versions.toml`

To change the app **strings** go to `app/src/main/res/values/strings.xml`

To change the **splash** appearance go to `app/src/main/res/values/themes.xml`

**Colors** used in the app can be changed in `app/src/main/java/com/assisee/testtask/presentation/theme/Color.kt`

To edit the colour **theme** of the app go to
`app/src/main/java/com/assisee/testtask/presentation/theme/Theme.kt`

To edit the **typography** preferences go to `app/src/main/java/com/assisee/testtask/presentation/theme/Type.kt`

**API root** can be changed in `app/src/main/java/com/assisee/testtask/di/DataModule.kt`

## Dependencies

### **Dependencies used:**

 - Jetpack Compose - build UI
 - Material 3 - design system
 - Jetpack Paging - display paged data
 - Jetpack Room - store data locally
 - SplashScreen - customise splash screen
 - Jetpack Navigation - navigate between composables

### **External dependencies:**

 - [Retrofit](https://square.github.io/retrofit/) - perform remote API calls
 - [Koin](https://insert-koin.io) - dependency injection
 - [Coil](https://github.com/coil-kt/coil) - image loading
 - [ImageCropView](https://github.com/rroohit/ImageCropView) - crop picked images

## Troubleshooting tips and common issues

### 0. Use the [latest](https://developer.android.com/studio/) stable Android Studio version

### 1.  **Android Gradle Plugin Versions**

-   The Kotlin version must be compatible with the Android Gradle Plugin (AGP). You can check the  [Kotlin Android Compatibility table](https://developer.android.com/studio/releases/gradle-plugin#updating-gradle)  to ensure compatibility between different versions of AGP and Kotlin.

### 2.  **Gradle Wrapper Versions**
- Keep the Gradle wrapper [up to date](https://services.gradle.org/distributions/) (in`gradle/wrapper/gradle-wrapper.properties`) to ensure compatibility with the latest Gradle plugin and Kotlin versions.

### 3.  **Compose Version Compatibility**
- Make sure the Kotlin version and Compose library versions are [compatible](https://developer.android.com/jetpack/androidx/releases/compose-kotlin). Check Jetpack Compose release notes for version compatibility, ensure the  `kotlinCompilerExtensionVersion`  in  `composeOptions`  matches the Compose version you're using.

