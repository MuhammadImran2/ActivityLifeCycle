package com.example.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    final String TAG2 = "Activity 2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_2);
        Log.d(TAG2 , "Status : OnCreate ");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
                default:return false;
        }
    }

    public void goToActivity2(View view){
        finish();
    }



    protected void onStart(){
        super.onStart();
        Log.d(TAG2, "Status : onStart");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG2 , "Status : onRestart");
    }
    protected void onResume(){
        super.onResume();
        Log.d(TAG2 , "Status : onResume");
    }
    protected void onPause(){
        super.onPause();
        Log.d(TAG2 , "Status : onPause");
    }
    protected void onStop(){
        super.onStop();
        Log.d(TAG2 , "Status : onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG2 , "Status : onDestroy");
    }


}
