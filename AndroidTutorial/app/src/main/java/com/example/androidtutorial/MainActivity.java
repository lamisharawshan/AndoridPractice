package com.example.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textview;
    Button DialPhone, Toast, Showmelocation,gotowebpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DialPhone= findViewById(R.id.DialPhone);
        Toast= findViewById(R.id.Toast);
        Showmelocation= findViewById(R.id.Showmelocation);
        gotowebpage= findViewById(R.id.gotowebpage);
        textview=findViewById(R.id.textbox);
        DialPhone.setOnClickListener(this);
        Toast.setOnClickListener(this);
        Showmelocation.setOnClickListener(this);
        gotowebpage.setOnClickListener(this);
       /* push_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag", "some body push me");
                textview.setText("hello edureka push me");
            }
        });
        push_me1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag", "some body push me");
                textview.setText("hello edureka push me1");
            }
        });*/

    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {

            case R.id.DialPhone:
                Log.d("tag", "some body push me");
                textview.setText("hello edureka push me");
                break;
            case R.id.Toast:
                Log.d("tag", "some body push me 2");
                textview.setText("hello edureka push me1");
                break;
            case R.id.Showmelocation:

                break;
            case R.id.gotowebpage:
                Log.d("tag", "some body push me 2");
                textview.setText("hello edureka push me1");
                break;



        }
    }



   /* @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","in on start");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","in on pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","in resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }*/
}