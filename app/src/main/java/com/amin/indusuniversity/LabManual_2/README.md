/*
Lab Manual 2 Completed download this repository open on android studio and run on your personal computer.
Edit These Two lines and change colors of both lines like in mine color is ```holo_blue_dark``` and ```holo_red_dark``` and change colors in below lines

```tvHelloAndroid.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));```
```tvHelloAndroid.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));```

Delete current code of ```AndroidManifest.xml``` And copy below code and paste on ```AndroidManifest.xml``` file
```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.amin.indusuniversity">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        
        <activity android:name=".LabManual_2.LabManual_Two">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity android:name=".MainActivity"></activity>
        <activity android:name=".Test" />
    </application>

</manifest>
```

Output of Lab 2 is available on [this](https://drive.google.com/drive/folders/11Em5MU9ALn7valgCm4eg9eGUMhaovQHG?usp=sharing) link
*/