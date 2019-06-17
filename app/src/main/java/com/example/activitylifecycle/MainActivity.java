package com.example.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    final String TAG1 = "Activity 1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG1 , "Status : onCreate");
    }
    public void goToActivity1(View view) {
        Intent intent =  new Intent(getApplicationContext(), Activity2.class);
        startActivity(intent);

    }



    protected void onStart(){
        super.onStart();
        Log.d(TAG1 , "Status : onStart");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG1 , "Status : onRestart");
    }
    protected void onResume(){
        super.onResume();
        Log.d(TAG1 , "Status : onResume");
    }
    protected void onPause(){
        super.onPause();
        Log.d(TAG1 , "Status : onPause");
    }
    protected void onStop(){
        super.onStop();
        Log.d(TAG1 , "Status : onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG1 , "Status : onDestroy");
    }

}
