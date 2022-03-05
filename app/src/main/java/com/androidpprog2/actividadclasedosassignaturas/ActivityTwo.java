package com.androidpprog2.actividadclasedosassignaturas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class ActivityTwo extends Activity {

    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        bundle= getIntent().getExtras();

        Assignatura assignatura =(Assignatura) bundle.getSerializable("datos");

    if(assignatura.getId()==1){

        Toast.makeText(this, "La assignatura es:"+assignatura.getNombreAssignatura(),Toast.LENGTH_SHORT).show();
    }else if(assignatura.getId()==2){
        Toast.makeText(this, "La assignatura es:"+assignatura.getNombreAssignatura(),Toast.LENGTH_SHORT).show();


    }


    }





}
