plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
/*    id("kotlin-android-extensions")*/
    id("com.google.gms.google-services")



}

android {
    namespace = "com.example.foodhub"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.foodhub"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }



}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //view page indecator
    //implementation("com.google.android.material:1.2.0-alpa05")



    /*    implementation("com.romandanylyk:pageindicatorview:1.0.3")*/

    /*        implementation("androidx.viewpager2:viewpager2:1.0.0")
            implementation("com.google.android.material:material:1.4.0")*/
    /*    implementation("com.tbuonomo.andrui:viewpagerdotsindicator:3.0.3")*/
    /*    implementation("me.relex:circleindicator:2.1.6")*/


    implementation("com.tbuonomo:dotsindicator:4.2")
    implementation(platform("com.google.firebase:firebase-bom:32.4.0"))

    implementation("com.google.firebase:firebase-analytics-ktx")


}