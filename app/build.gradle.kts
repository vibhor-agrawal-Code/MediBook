plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.medibook"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.medibook"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.google.android.material:material:1.8.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("com.google.firebase:firebase-analytics-ktx:21.2.1")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")

    implementation (platform("com.google.firebase:firebase-bom:31.3.0"))
    implementation ("com.google.firebase:firebase-analytics")
    implementation ("com.hbb20:ccp:2.5.4")
    implementation ("com.google.firebase:firebase-auth:21.2.0")
    implementation ("com.google.firebase:firebase-database:20.1.0")
    implementation ("com.google.android.gms:play-services-auth:20.5.0")
}