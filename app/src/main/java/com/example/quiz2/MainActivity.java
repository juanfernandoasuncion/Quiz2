package com.example.quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("message", "onCreate() has executed...");
    }

    public void showCancel(View v){
        Toast toast = Toast.makeText(this, "This is a Toast...", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showProceed(View snack){
        Snackbar sbar = Snackbar.make(snack, "This is a Snackbar..", Snackbar.LENGTH_LONG);
        sbar.show();
    }
}