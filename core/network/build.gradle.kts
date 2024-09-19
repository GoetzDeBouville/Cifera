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
                implementation(libs.bundles.ktor)
                implementation(libs.napier)
                implementation(libs.kotlinx.datetime)

                implementation(libs.essenty.lifecycle.coroutines)
                implementation(libs.kotlinx.serialization)
                api(libs.koin.core)
                implementation(libs.koin.compose)
            }


            androidMain.dependencies {
                implementation(libs.kotlinx.coroutines.android)
                implementation(libs.ktor.client.okhttp)
            }

            jvmMain.dependencies {
                implementation(libs.kotlinx.coroutines.swing)
                implementation(libs.ktor.client.okhttp)
            }

            iosMain.dependencies {
                implementation(libs.ktor.client.darwin)
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
