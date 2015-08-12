package com.medio;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE) ;

        setContentView(R.layout.activity_main);
        Intent i = new Intent(Intent.ACTION_VIEW);
        String filePath = "/sdcard/11.apk";
        i.setDataAndType(Uri.parse("file://" + filePath), "application/vnd.android.package-archive");
        this.startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
