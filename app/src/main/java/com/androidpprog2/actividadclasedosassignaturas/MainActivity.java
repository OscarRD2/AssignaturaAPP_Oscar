package com.androidpprog2.actividadclasedosassignaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void infoAssignatura1(View v){
        Intent i = new Intent(this, infoAssignatura.class);
        startActivity(i);
    }
}