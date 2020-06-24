package com.example.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        /*Bundle bundle=getIntent().getExtras();
        String str=bundle.getString("KEY");*/
        Toast.makeText(this, "in Other Activity", Toast.LENGTH_SHORT).show();
    }
}