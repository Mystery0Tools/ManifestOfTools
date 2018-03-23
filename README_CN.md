[![license](https://img.shields.io/github/license/Mystery00/Mystery0Tools.svg)](https://github.com/Mystery00/Mystery0Tools/blob/master/LICENSE) [![GitHub followers](https://img.shields.io/github/followers/Mystery00.svg?style=social&logo=github&label=Follow)](https://github.com/Mystery00)

## Mystery0Tools
一个针对Android开发者的工具库。
Mystery0Tools是来自于原[ToolsDemo](https://github.com/Mystery00/ToolsDemo "ToolsDemo")的仓库。

[README](https://github.com/Mystery0Tools/ManifestOfTools/blob/master/README.md "README")
## Download
通过Gradle集成：
将以下代码添加进您的项目级的Build.gradle最后：

    allprojects {
    	repositories {
    		...
    		maven { url 'https://jitpack.io' }
    	}
    }
然后添加依赖：

    dependencies {
    	compile 'com.github.Mystery0Tools:Tools:x.x.x'
		compile 'com.github.Mystery0Tools:CrashHandler:x.x.x'
		compile 'com.github.Mystery0Tools:DirManager:x.x.x'
		compile 'com.github.Mystery0Tools:Logs:x.x.x'
		compile 'com.github.Mystery0Tools:OkhttpCookie:x.x.x'
    }
或者通过Maven：
添Jitpack仓库到您的构建文件中：
```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```
添加依赖：
```xml
<dependencies>
	<dependency>
		<groupId>com.github.Mystery0Tools</groupId>
		<artifactId>Tools</artifactId>
		<version>x.x.x</version>
	</dependency>
	<dependency>
		<groupId>com.github.Mystery0Tools</groupId>
		<artifactId>CrashHandler</artifactId>
		<version>x.x.x</version>
	</dependency>
	<dependency>
		<groupId>com.github.Mystery0Tools</groupId>
		<artifactId>DirManager</artifactId>
		<version>x.x.x</version>
	</dependency>
	<dependency>
		<groupId>com.github.Mystery0Tools</groupId>
		<artifactId>Logs</artifactId>
		<version>x.x.x</version>
	</dependency>
	<dependency>
		<groupId>com.github.Mystery0Tools</groupId>
		<artifactId>OkhttpCookie</artifactId>
		<version>x.x.x</version>
	</dependency>
</dependencies>
```
**Mystery0Tools requires at minimum SDK 19 (maybe will be lower)**

## How To Use
### AutoVersion
[![API](https://img.shields.io/badge/API-19%2B-blue.svg)]() ![GitHub last commit](https://img.shields.io/github/last-commit/Mystery0Tools/AutoVersion.svg) [![JitPack](https://img.shields.io/jitpack/v/Mystery0Tools/AutoVersion.svg)](https://jitpack.io/#Mystery0Tools/AutoVersion) [![GitHub release](https://img.shields.io/github/release/Mystery0Tools/AutoVersion.svg)](https://github.com/Mystery0Tools/AutoVersion) ![GitHub Release Date](https://img.shields.io/github/release-date/Mystery0Tools/AutoVersion.svg) 

源码来自[https://github.com/nillith/AutoVersion](https://github.com/nillith/AutoVersion "https://github.com/nillith/AutoVersion")，我只是添加了beta和alpha字段，便于生成`1.2.3-beta4`或者`1.2.3-alpha5`这样的版本名称。版本号依旧来源于git提交次数。
#### How to use
将以下代码添加进您的项目级的build.gradle中：

	buildscript {
    	repositories {
        	……
        	maven { url 'https://jitpack.io' }
	}
    dependencies {
        ……
		classpath 'com.github.Mystery0Tools:AutoVersion:x.x.x'
	}

然后将以下代码添加进您的APP级的build.gradle中：

	apply plugin: 'vip.mystery0.autoversion'

   	autoVersion {
       	major 1
       	minor 2
    	patch 3
    	beta 4
    	alpha 5
   	}
现在你可以通过`autoVersion.name`或者`autoVersion.code`获取版本名称和版本号。
例如，这里生成的是`1.2.3-beta4`，如果`beta`字段是0，版本名称将是`1.2.3-alpha5`，如果`beta`和`alpha`同时为0。版本名称将会是`1.2.3`。**beta优先于alpha。**
### BaseActivity
[![API](https://img.shields.io/badge/API-19%2B-blue.svg)]() ![GitHub last commit](https://img.shields.io/github/last-commit/Mystery0Tools/Tools.svg) [![JitPack](https://img.shields.io/jitpack/v/Mystery0Tools/Tools.svg)](https://jitpack.io/#Mystery0Tools/Tools) [![GitHub release](https://img.shields.io/github/release/Mystery0Tools/Tools.svg)](https://github.com/Mystery0Tools/Tools) ![GitHub Release Date](https://img.shields.io/github/release-date/Mystery0Tools/Tools.svg) 

让您的activity继承于[BaseActivity](https://github.com/Mystery00/Mystery0Tools/blob/master/tools/src/main/java/vip/mystery0/tools/base/BaseActivity.kt "BaseActivity")，你就可以通过`toastMessage`方法来显示toast。

### cookie manager for okhttp
[![API](https://img.shields.io/badge/API-19%2B-blue.svg)]() ![GitHub last commit](https://img.shields.io/github/last-commit/Mystery0Tools/OkhttpCookie.svg) [![JitPack](https://img.shields.io/jitpack/v/Mystery0Tools/OkhttpCookie.svg)](https://jitpack.io/#Mystery0Tools/OkhttpCookie) [![GitHub release](https://img.shields.io/github/release/Mystery0Tools/OkhttpCookie.svg)](https://github.com/Mystery0Tools/OkhttpCookie) ![GitHub Release Date](https://img.shields.io/github/release-date/Mystery0Tools/OkhttpCookie.svg) 

如果你在使用okhttp进行网络请求，你可以通过设置拦截器来管理cookies。
只需要为您的`OkHttpClient`执行以下代码！
```java
OkHttpClient okHttpClient=new OkHttpClient.Builder()
		.addInterceptor(new LoadCookiesInterceptor(context))
		.addInterceptor(new SaveCookiesInterceptor(context))
		.build();
```
你也可以使用另一个构造方法来设置`sharedpreference`名称。

### CrashHandler
[![API](https://img.shields.io/badge/API-19%2B-blue.svg)]() ![GitHub last commit](https://img.shields.io/github/last-commit/Mystery0Tools/CrashHandler.svg) [![JitPack](https://img.shields.io/jitpack/v/Mystery0Tools/CrashHandler.svg)](https://jitpack.io/#Mystery0Tools/CrashHandler) [![GitHub release](https://img.shields.io/github/release/Mystery0Tools/CrashHandler.svg)](https://github.com/Mystery0Tools/CrashHandler) ![GitHub Release Date](https://img.shields.io/github/release-date/Mystery0Tools/CrashHandler.svg) 

只需要调用以下代码到您的Application实例中：
```java
CrashHandler.getInstance(this).init();
```
你也可以通过调用**setDir()**, **setPrefix()**, **setSuffix()**, **autoClean()**, **clean()**, **doOnCatch()**来自定义日志。
在[Simple](https://github.com/Mystery00/Mystery0Tools/blob/master/simple/src/main/java/vip/mystery0/mystery0tools/APP.java "Simple")中查看更多用法。

### Dir Manager
[![API](https://img.shields.io/badge/API-19%2B-blue.svg)]() ![GitHub last commit](https://img.shields.io/github/last-commit/Mystery0Tools/DirManager.svg) [![JitPack](https://img.shields.io/jitpack/v/Mystery0Tools/DirManager.svg)](https://jitpack.io/#Mystery0Tools/DirManager) [![GitHub release](https://img.shields.io/github/release/Mystery0Tools/DirManager.svg)](https://github.com/Mystery0Tools/DirManager) ![GitHub Release Date](https://img.shields.io/github/release-date/Mystery0Tools/DirManager.svg) 

你可以使用这个来选择文件夹，就像使用自定义View一样：
```xml
<vip.mystery0.tools.dirManager.DirManager
        android:id="@+id/dirManager"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```
默认情况下，你只需要将这个view放到layout.xml中。默认根目录是`/storage/emulated/0`（在不同设备上可能不同），如果你想自定义条目的布局，你可以继承`BaseDirManager`然后实现方法，就像下面这样：
```java
public class MyAdapter extends BaseDirAdapter<MyAdapter.ViewHolder> {
	private List<File> list;

	public MyAdapter(@NotNull ArrayList<File> list) {
		super(list);
		this.list = list;
	}

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dir_manager, parent, false));
	}

	@Override
	public void initViewHolder(@NotNull ViewHolder holder, int position) {
		File file = list.get(position);
		setTextViewText(file, holder.textView);
	}

	class ViewHolder extends RecyclerView.ViewHolder {
		TextView textView = itemView.findViewById(R.id.textView_title);

		ViewHolder(View itemView) {
			super(itemView);
		}
	}
}
```
然后在activity中调用如下方法：
```java
dirManager.setAdapter(new MyAdapter(fileList));
```
### Logs
[![API](https://img.shields.io/badge/API-19%2B-blue.svg)]() ![GitHub last commit](https://img.shields.io/github/last-commit/Mystery0Tools/Logs.svg) [![JitPack](https://img.shields.io/jitpack/v/Mystery0Tools/Logs.svg)](https://jitpack.io/#Mystery0Tools/Logs) [![GitHub release](https://img.shields.io/github/release/Mystery0Tools/Logs.svg)](https://github.com/Mystery0Tools/Logs) ![GitHub Release Date](https://img.shields.io/github/release-date/Mystery0Tools/Logs.svg) 

你可以像使用`android.util.Log`一样使用，但是你可以控制日志等级来决定是否显示。

### Utils
[![API](https://img.shields.io/badge/API-19%2B-blue.svg)]() ![GitHub last commit](https://img.shields.io/github/last-commit/Mystery0Tools/Tools.svg) [![JitPack](https://img.shields.io/jitpack/v/Mystery0Tools/Tools.svg)](https://jitpack.io/#Mystery0Tools/Tools) [![GitHub release](https://img.shields.io/github/release/Mystery0Tools/Tools.svg)](https://github.com/Mystery0Tools/Tools) ![GitHub Release Date](https://img.shields.io/github/release-date/Mystery0Tools/Tools.svg) 

#### ColorTools
你可以使用[这个工具](https://github.com/Mystery00/Mystery0Tools/blob/master/tools/src/main/java/vip/mystery0/tools/utils/ColorTools.kt)来解析颜色或者给现有颜色添加`alpha`。
#### DensityTools
你可以使用[这个工具](https://github.com/Mystery00/Mystery0Tools/blob/master/tools/src/main/java/vip/mystery0/tools/utils/DensityTools.kt)来进行`dp`和`px`中间的转换，或者通过方法获取屏幕高度和宽度。
#### FileTools
你可以使用[这个工具](https://github.com/Mystery00/Mystery0Tools/blob/master/tools/src/main/java/vip/mystery0/tools/utils/FileTools.kt)来格式化文件的大小为`x KB`或`x MB`的格式。

## LICENSE
    Copyright (C) 2018 Mystery0.
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.