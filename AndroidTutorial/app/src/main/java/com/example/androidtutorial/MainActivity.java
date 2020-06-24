package com.example.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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
                Intent intent1=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:'0219323923"));
                startActivity(intent1);
                break;
            case R.id.Toast:
                Intent intent=new Intent(MainActivity.this,OtherActivity.class);
                startActivity(intent);
                break;
            case R.id.Showmelocation:
                Intent intent2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                startActivity(intent2);
                break;
            case R.id.gotowebpage:
                Intent intent3=new Intent(Intent.ACTION_VIEW);
                intent3.putExtra("KEY","this is extra");
                startActivity(intent3);
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