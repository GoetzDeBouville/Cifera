import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.android.application)
}

kotlin {

    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    jvm()

    sourceSets {

        sourceSets {
            commonMain.dependencies {
                api(libs.koin.core)
                implementation(libs.essenty.lifecycle.coroutines)
                implementation(libs.koin.compose)
                implementation(libs.kotlinx.datetime)
            }


            androidMain.dependencies {
                implementation(libs.kotlinx.coroutines.android)
                implementation(libs.sqlDelight.driver.android)
            }

            jvmMain.dependencies {
                implementation(libs.kotlinx.coroutines.swing)
                implementation(libs.sqlDelight.driver.sqlite)
            }

            iosMain.dependencies {
                implementation(libs.sqlDelight.driver.native)
            }
        }
    }
}

android {
    namespace = "com.example.network"
    compileSdk = libs.versions.android.compile.sdk.get().toInt()
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig {
        minSdk = libs.versions.android.min.sdk.get().toInt()
    }
}
