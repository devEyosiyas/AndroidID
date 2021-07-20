# AndroidID
[![](https://jitpack.io/v/devEyosiyas/AndroidID.svg)](https://jitpack.io/#devEyosiyas/AndroidID)

Java and Kotlin Android library.
Uniquely identify an Android device without any permissions and API restrictions.
The [recommended](https://developer.android.com/training/articles/user-data-ids) approach using DRM API.

Implementation
-------------------

Gradle:

Add it in your root build.gradle at the end of repositories:

Step 1. Add the JitPack repository to your build file

```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
    }
}
```
Step 2. Add the dependency

```gradle
dependencies {
    implementation 'com.github.devEyosiyas:AndroidID:1.0.1'
}
```

Or Maven:

```xml
<repositories>
<repository>
<id>jitpack.io</id>
<url>https://jitpack.io</url>
</repository>
</repositories>
  
<dependency>groupId>com.github.devEyosiyas</groupId>
<artifactId>AndroidID</artifactId>
<version>1.0.1</version>
</dependency>
```

How do I use Android ID?
-------------------
Java
```java
  String widevine = JavaAndroidID.widevine; // The most reliable way
  String commonPSSH = JavaAndroidID.commonPSSH;
  String clearKey = JavaAndroidID.clearKey;
  String playReady = JavaAndroidID.playReady;
```
Kotlin
```kotlin
  val widevine: String = KotlinAndroidID.widevine() // The most reliable way
  val commonPSSH: String = KotlinAndroidID.commonPSSH()
  val clearKey: String = KotlinAndroidID.clearKey()
  val playReady: String = KotlinAndroidID.playReady()
```

Author
------
Eyosiyas Bereketab - @devEyosiyas on GitHub, and @devEyosi on Twitter

