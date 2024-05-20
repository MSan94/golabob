import org.jetbrains.kotlin.konan.properties.Properties
import java.io.FileInputStream

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    namespace = "com.ms.golabob"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ms.golabob"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        val localProperties = Properties()
        localProperties.load(rootProject.file("local.properties").inputStream())
        debug {
            buildConfigField("String","FOOD_API_KEY", "\"${localProperties["FOOD_API_KEY"].toString()}\"")
        }
        release {
            isMinifyEnabled = false
            buildConfigField("String","FOOD_API_KEY", "\"${localProperties["FOOD_API_KEY"].toString()}\"")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        dataBinding = true
        buildConfig = true
    }
}

dependencies {

    implementation(project(":domain"))
    implementation(project(":data"))

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.testext)
    androidTestImplementation(libs.espresso)

    // hilt
    implementation(libs.hilt.android)
    implementation(libs.hilt.plugin)
    kapt(libs.hilt.compiler)

    // retrofit2 & okhttp3
    implementation(libs.retrofit)
    implementation(libs.okhttp3)
    implementation(libs.okhttp3.interceptor)
    implementation(libs.gson)

    //viewmodel
    implementation(libs.lifecycle.viewmodel)
    implementation(libs.lifecycle.livedata)
}