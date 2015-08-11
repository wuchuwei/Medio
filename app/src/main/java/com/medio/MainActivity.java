package com.medio;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.Toast;

import java.lang.ref.SoftReference;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
        int a[] = {1,4,3,7,34,556,22,44,222,553,124,13,3,54};
        int i ;
        int tmp;
        for (i=0;i<a.length-1;i++){
            if (a[i]>a[i+1]){
                tmp = a[i];
                a[i]=a[i+1];
                a[i+1] = tmp;
                Log.d("i",String.valueOf(i));
            }
        }
        Toast.makeText(this,new String(a, 0, a.length),Toast.LENGTH_LONG).show();
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
