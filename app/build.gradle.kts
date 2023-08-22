plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
    id ("kotlin-parcelize")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.layfones.composewanandroid"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.layfones.composewanandroid"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    val compose_ui_version = "1.5.0"

    implementation ("androidx.core:core-ktx:1.10.1")
    implementation ("com.google.android.material:material:1.9.0")
    implementation ("androidx.compose.ui:ui:$compose_ui_version")
    implementation ("androidx.compose.ui:ui-tooling-preview:$compose_ui_version")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation ("androidx.activity:activity-compose:1.7.2")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:$compose_ui_version")
    debugImplementation ("androidx.compose.ui:ui-tooling:$compose_ui_version")
    debugImplementation ("androidx.compose.ui:ui-test-manifest:$compose_ui_version")

    // Coil 图片加载
    implementation ("io.coil-kt:coil-compose:2.4.0")
    // Webkit
    implementation ("androidx.webkit:webkit:1.7.0")
    // Compose WebView
    implementation ("com.google.accompanist:accompanist-webview:0.30.0")
    // 系统 ui 控制器
     implementation ("com.google.accompanist:accompanist-systemuicontroller:0.30.0")
    // ViewPager
    implementation ("com.google.accompanist:accompanist-pager:0.30.0")
    implementation ("com.google.accompanist:accompanist-pager-indicators:0.30.0")
    // 导航动画
    implementation ("com.google.accompanist:accompanist-navigation-animation:0.30.0")
    // 流式布局
    implementation ("com.google.accompanist:accompanist-flowlayout:0.30.0")
    //Hilt inject framework
    implementation ("com.google.dagger:hilt-android:2.45")
    kapt ("com.google.dagger:hilt-compiler:2.45")
    implementation ("androidx.hilt:hilt-navigation-compose:1.0.0")
    implementation ("androidx.navigation:navigation-compose:2.7.0")
    // Paging
    implementation ("androidx.paging:paging-runtime-ktx:3.2.0")
    implementation ("androidx.paging:paging-compose:3.2.0")
    // Material3
    implementation("androidx.compose.material3:material3:1.2.0-alpha05")
//    implementation("com.google.accompanist:accompanist-adaptive:0.26.2-beta")

    implementation ("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
    // Datastore
    implementation ("androidx.datastore:datastore-preferences:1.0.0")
    implementation ("androidx.preference:preference-ktx:1.2.1")
    // OkHttp
    implementation ("com.squareup.okhttp3:okhttp:4.11.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.10.0")
    // Retrofit2
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    //room数据库
    val room_version = "2.5.2"
    implementation ("androidx.room:room-runtime:$room_version")
    ksp  ("androidx.room:room-compiler:$room_version")
    // optional - Kotlin Extensions and Coroutines support for Room
    implementation ("androidx.room:room-ktx:$room_version")
    // optional - Paging 3 Integration
    implementation ("androidx.room:room-paging:$room_version")
    // Test helpers
    testImplementation ("androidx.room:room-testing:$room_version")

    // For instrumentation tests
    androidTestImplementation  ("com.google.dagger:hilt-android-testing:2.45")
    androidTestAnnotationProcessor ("com.google.dagger:hilt-compiler:2.45")

    // For local unit tests
    testImplementation ("com.google.dagger:hilt-android-testing:2.45")
    testAnnotationProcessor ("com.google.dagger:hilt-compiler:2.45")
}