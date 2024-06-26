plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.nasza.myselfapps"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.nasza.myselfapps"
        minSdk = 24
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}


dependencies {
    // AndroidX Libraries
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // CircleImageView
    implementation("de.hdodenhof:circleimageview:3.1.0")

    // RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.3.1")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")

    // Material Design
    implementation("com.google.android.material:material:1.4.0")

    // Google Maps
    implementation("com.google.android.gms:play-services-maps:18.0.0")

    // Fragment KTX
    implementation("androidx.fragment:fragment-ktx:1.3.6")

    // YouTube
    implementation("com.pierfrancescosoffritti.androidyoutubeplayer:core:11.0.1")

    // Map
    implementation ("org.osmdroid:osmdroid-android:6.1.10")

    implementation ("androidx.fragment:fragment-ktx:1.3.6")
    implementation ("androidx.viewpager2:viewpager2:1.0.0")



}
