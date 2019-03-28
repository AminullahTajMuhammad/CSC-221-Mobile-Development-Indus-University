Nothing to change just change below code. 

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
        <activity android:name=".LabManual_3.LabManual_Three">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity android:name=".LabManual_2.LabManual_Two"></activity>
        <activity android:name=".MainActivity"></activity>
        <activity android:name=".Test" />
    </application>

</manifest>
```

Output of Lab 3 is available on [this](https://drive.google.com/file/d/1mKpre6wIeqxXesksp_eP29aSlMGfwbYv/view?usp=sharing) link
