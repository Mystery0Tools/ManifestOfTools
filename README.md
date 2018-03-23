[![license](https://img.shields.io/github/license/Mystery0Tools/ManifestOfTools.svg)](https://github.com/Mystery00/Mystery0Tools/blob/master/LICENSE) [![GitHub followers](https://img.shields.io/github/followers/Mystery00.svg?style=social&logo=github&label=Follow)](https://github.com/Mystery00)

## Mystery0Tools
Some tools for Android developer.
Mystery0Tools is a new library from [ToolsDemo](https://github.com/Mystery00/ToolsDemo "ToolsDemo")

[中文文档](https://github.com/Mystery0Tools/ManifestOfTools/blob/master/README_CN.md "中文文档")
## Download
Grab via Gradle:
Add it in your root build.gradle at the end of repositories:

    allprojects {
    	repositories {
    		...
    		maven { url 'https://jitpack.io' }
    	}
    }
Then add the dependency:

    dependencies {
    	implementation 'com.github.Mystery0Tools:Tools:x.x.x'
		implementation 'com.github.Mystery0Tools:CrashHandler:x.x.x'
		implementation 'com.github.Mystery0Tools:DirManager:x.x.x'
		implementation 'com.github.Mystery0Tools:Logs:x.x.x'
		implementation 'com.github.Mystery0Tools:OkhttpCookie:x.x.x'
    }
or Maven:
Add the JitPack repository to your build file:
```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```
Add the dependency:
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

The source code of this module is from [https://github.com/nillith/AutoVersion](https://github.com/nillith/AutoVersion "https://github.com/nillith/AutoVersion"), I just added the beta and Alpha fields. It will generating version name such as `1.2.3-beta4` or `1.2.3-alpha5`. The version code is still from git commits.
#### How to use
Put the following code to your `build.gradle` of project:

	buildscript {
    	repositories {
        	……
        	maven { url 'https://jitpack.io' }
	}
    dependencies {
        ……
		classpath 'com.github.Mystery0Tools:AutoVersion:x.x.x'
	}

Then put the code to your `build.gradle` of app:

	apply plugin: 'vip.mystery0.autoversion'

   	autoVersion {
       	major 1
       	minor 2
    	patch 3
    	beta 4
    	alpha 5
   	}
Now you can get the generate `version name` or `version code` by called `autoVersion.name` or `autoVersion.code`.
For example, a `1.2.3-beta4` is generated here, and if the `beta` value is 0, the name is `1.2.3-alpha5`, and if both `beta` and `alpha` are 0, the version number `1.2.3`. **Beta precedence over alpha**.
### BaseActivity
[![API](https://img.shields.io/badge/API-19%2B-blue.svg)]() ![GitHub last commit](https://img.shields.io/github/last-commit/Mystery0Tools/Tools.svg) [![JitPack](https://img.shields.io/jitpack/v/Mystery0Tools/Tools.svg)](https://jitpack.io/#Mystery0Tools/Tools) [![GitHub release](https://img.shields.io/github/release/Mystery0Tools/Tools.svg)](https://github.com/Mystery0Tools/Tools) ![GitHub Release Date](https://img.shields.io/github/release-date/Mystery0Tools/Tools.svg) 

Make your activity extends [BaseActivity](https://github.com/Mystery00/Mystery0Tools/blob/master/tools/src/main/java/vip/mystery0/tools/base/BaseActivity.kt "BaseActivity"), you can use `toastMessage` function to make toast

### cookie manager for okhttp
[![API](https://img.shields.io/badge/API-19%2B-blue.svg)]() ![GitHub last commit](https://img.shields.io/github/last-commit/Mystery0Tools/OkhttpCookie.svg) [![JitPack](https://img.shields.io/jitpack/v/Mystery0Tools/OkhttpCookie.svg)](https://jitpack.io/#Mystery0Tools/OkhttpCookie) [![GitHub release](https://img.shields.io/github/release/Mystery0Tools/OkhttpCookie.svg)](https://github.com/Mystery0Tools/OkhttpCookie) ![GitHub Release Date](https://img.shields.io/github/release-date/Mystery0Tools/OkhttpCookie.svg) 

If you use okhttp to request remote resource, you can set interceptor to manager cookies.
Just do the following code for you `OkHttpClient`! 
```java
OkHttpClient okHttpClient=new OkHttpClient.Builder()
		.addInterceptor(new LoadCookiesInterceptor(context))
		.addInterceptor(new SaveCookiesInterceptor(context))
		.build();
```
You can also call another constructor to set the `sharedprefence` name.

### CrashHandler
[![API](https://img.shields.io/badge/API-19%2B-blue.svg)]() ![GitHub last commit](https://img.shields.io/github/last-commit/Mystery0Tools/CrashHandler.svg) [![JitPack](https://img.shields.io/jitpack/v/Mystery0Tools/CrashHandler.svg)](https://jitpack.io/#Mystery0Tools/CrashHandler) [![GitHub release](https://img.shields.io/github/release/Mystery0Tools/CrashHandler.svg)](https://github.com/Mystery0Tools/CrashHandler) ![GitHub Release Date](https://img.shields.io/github/release-date/Mystery0Tools/CrashHandler.svg) 

Just call the following code to your Application.
```java
CrashHandler.getInstance(this).init();
```
You can also call **setDir()**, **setPrefix()**, **setSuffix()**, **autoClean()**, **clean()**, **doOnCatch()** to custom the log.
More use see in [simple](https://github.com/Mystery00/Mystery0Tools/blob/master/simple/src/main/java/vip/mystery0/mystery0tools/APP.java "Simple").

### Dir Manager
[![API](https://img.shields.io/badge/API-19%2B-blue.svg)]() ![GitHub last commit](https://img.shields.io/github/last-commit/Mystery0Tools/DirManager.svg) [![JitPack](https://img.shields.io/jitpack/v/Mystery0Tools/DirManager.svg)](https://jitpack.io/#Mystery0Tools/DirManager) [![GitHub release](https://img.shields.io/github/release/Mystery0Tools/DirManager.svg)](https://github.com/Mystery0Tools/DirManager) ![GitHub Release Date](https://img.shields.io/github/release-date/Mystery0Tools/DirManager.svg) 

You can use this to select directory. Use it like custom view.
```xml
<vip.mystery0.tools.dirManager.DirManager
        android:id="@+id/dirManager"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```
Default, you just put this view to your layout.xml. The default root is `/storage/emulated/0`(it's different in different devices).
If you want to custom item layout, you can extends `BaseDirManager` just like following code.
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
Then called this code in your activity:
```java
dirManager.setAdapter(new MyAdapter(fileList));
```
### Logs
[![API](https://img.shields.io/badge/API-19%2B-blue.svg)]() ![GitHub last commit](https://img.shields.io/github/last-commit/Mystery0Tools/Logs.svg) [![JitPack](https://img.shields.io/jitpack/v/Mystery0Tools/Logs.svg)](https://jitpack.io/#Mystery0Tools/Logs) [![GitHub release](https://img.shields.io/github/release/Mystery0Tools/Logs.svg)](https://github.com/Mystery0Tools/Logs) ![GitHub Release Date](https://img.shields.io/github/release-date/Mystery0Tools/Logs.svg) 

You can just use it like `android.util.Log`, but you can set level for log to control which should show.

### Utils
[![API](https://img.shields.io/badge/API-19%2B-blue.svg)]() ![GitHub last commit](https://img.shields.io/github/last-commit/Mystery0Tools/Tools.svg) [![JitPack](https://img.shields.io/jitpack/v/Mystery0Tools/Tools.svg)](https://jitpack.io/#Mystery0Tools/Tools) [![GitHub release](https://img.shields.io/github/release/Mystery0Tools/Tools.svg)](https://github.com/Mystery0Tools/Tools) ![GitHub Release Date](https://img.shields.io/github/release-date/Mystery0Tools/Tools.svg) 

#### ColorTools
You can use [this tool](https://github.com/Mystery00/Mystery0Tools/blob/master/tools/src/main/java/vip/mystery0/tools/utils/ColorTools.kt) to parse color or add `alpha` to local color.
#### DensityTools
You can use [this tool](https://github.com/Mystery00/Mystery0Tools/blob/master/tools/src/main/java/vip/mystery0/tools/utils/DensityTools.kt) to convert simplely betwen `dp` and `px`, or get screen width and height.
#### FileTools
You can use [this tools](https://github.com/Mystery00/Mystery0Tools/blob/master/tools/src/main/java/vip/mystery0/tools/utils/FileTools.kt) to format file size with `x KB` or `x MB`.

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