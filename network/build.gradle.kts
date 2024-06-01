//# Refs
// https://android-developers.googleblog.com/2024/05/android-support-for-kotlin-multiplatform-to-share-business-logic-across-mobile-web-server-desktop.html?m=1


plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

kotlin {
    applyDefaultHierarchyTemplate()

    /**
     * Target is a part of the build responsible for compiling, testing, and packaging a piece of software aimed at one of the supported platforms.
    */
    androidTarget {
        publishLibraryVariants("release")
        compilations.all {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }
}

android {
    namespace = "dev.rafaz.network"
    compileSdk = 34
    defaultConfig {
        minSdk = 23
    }
}
