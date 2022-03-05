package com.androidpprog2.actividadclasedosassignaturas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    Assignatura assignatura1 = new Assignatura(1, R.string.Assignatura1, R.string.descripcionAssignatura1);
    Assignatura assignatura2 = new Assignatura(2, R.string.Assignatura2, R.string.descripcionAssignatura2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.Assignatura1:
                startActivity(new Intent(this, ActivityTwo.class).putExtra("datos", assignatura1));
                break;
            case R.id.Assignatura2:
                startActivity(new Intent(this, ActivityTwo.class).putExtra("datos", assignatura2));
                break;
        }


    }


}