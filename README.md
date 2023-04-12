# KotlinStudy

kotlin 语言的集成和学习

什么是Kotlin？

        Kotlin 是由 JetBrains 开发，一个基于 JVM 的新的编程语言。
        Kotlin可以编译成Java字节码，也可以编译成JavaScript，方便在没有JVM的设备上运行。
        谷歌 I/O 2017宣布将支持 Kotlin 作为Android开发的第一语言
        

        目前AndroiStudio 3.0预览版本已自带Kotlin插件，无需做任何的配置即可开始体验。但如果是之前的版本，则需要我们自行做些配置。
        通过 File | Settings | Plugins | Install JetBrains plugin… 搜索并安装 Kotlin 插件。   
        插件安装完成后（需要重启下AndroidStudio），就开始创建我们的第一个Kotlin项目了

Kotlin的特性

        Kotlin是一种兼容Java的语言；
        Kotlin比Java更安全，能够静态检测常见的陷阱。如：引用空指针；
        Kotlin比Java更简洁，通过支持variable type inference，higher-order functions (closures)，extension functions，mixins and first-class delegation等实现；
        Kotlin可与Java语言无缝通信。这意味着我们可以在Kotlin代码中使用任何已有的Java库；同样的Kotlin代码还可以为Java代码所用；
        Kotlin在代码中很少需要在代码中指定类型，因为编译器可以在绝大多数情况下推断出变量或是函数返回值的类型。这样就能获得两个好处：简洁与安全；

Kotlin官网 
    
    http://kotlinlang.org

Kotlin-github地址 

    https://github.com/JetBrains/kotlin

 1.集成
    
    使用Android Studio下载Kotlin相关插件
    执行 Settings -> plugins -> BrowseRepositories中搜索“Kotlin”

    gradle文件：
        apply plugin: 'kotlin-android'
        apply plugin: 'kotlin-android-extensions'
        
        compile "org.jetbrains.kotlin:kotlin-stdlib-jre7:$kotlin_version"
  
 具体的Module的 gradle文件
     
    apply plugin: 'com.android.application'
    apply plugin: 'kotlin-android'
    apply plugin: 'kotlin-android-extensions'
    
    android {
    
        compileSdkVersion 26
        buildToolsVersion "26.0.1"
    
        defaultConfig {
            applicationId "com.zhao.bill.kotlindemo"
    
            minSdkVersion 19
            targetSdkVersion 26
    
            versionCode 1
            versionName "1.0"
            testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
        }
    
        buildTypes {
    
            release {
                minifyEnabled false
                proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
            }
        }
    }
    
    dependencies {
        compile fileTree(dir: 'libs', include: ['*.jar'])
        androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
            exclude group: 'com.android.support', module: 'support-annotations'
        })
    
        compile "org.jetbrains.kotlin:kotlin-stdlib-jre7:$kotlin_version"
        compile 'com.android.support:appcompat-v7:26.+'
        compile 'com.android.support.constraint:constraint-layout:1.0.2'
        testCompile 'junit:junit:4.12'
    }
    
    repositories {
        mavenCentral()
    }


 项目的gradle文件(这样表示当前的module已经支持kotlin语言了)
 
    // Top-level build file where you can add configuration options common to all sub-projects/modules.
    
    buildscript {
        ext.kotlin_version = '1.1.51'
        repositories {
            jcenter()
        }
        
        dependencies {
            classpath 'com.android.tools.build:gradle:2.3.3'
            classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    
            // NOTE: Do not place your application dependencies here; they belong
            // in the individual module build.gradle files
        }
    }
    
    allprojects {
        repositories {
            jcenter()
        }
    }
    
    task clean(type: Delete) {
        delete rootProject.buildDir
    }
    
    
java文件转换为kotlin文件

    选中需要转换的Java文件, 如MainActivity.java,
    使用Command+Shift+A, 启动Action, 输入Convert, 找到命令, 即可转换
    
    或
    
    选择Code -> Convert Java File to Kotlin File, 也可以使用快捷键.
    把.kt的文件剪切到kotlin文件夹下, 即可使用.
    
    
具体使用  详见代码  谢谢