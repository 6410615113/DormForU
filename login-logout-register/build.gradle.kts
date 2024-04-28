buildscript {
    dependencies {
       classpath(libs.google.services)

    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
   // alias(com.android.application)  apply false
   // alias(com.android.library)  apply false
}