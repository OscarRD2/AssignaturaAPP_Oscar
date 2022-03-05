package com.androidpprog2.actividadclasedosassignaturas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTwo extends Activity {

    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        bundle= getIntent().getExtras();

        Assignatura assignatura =(Assignatura) bundle.getSerializable("datos");
        TextView nameAssignatura =(TextView) findViewById(R.id.TituloAssignatura);
        TextView descripcionAssignatura =(TextView) findViewById(R.id.DescripcionAssignatura);



    if(assignatura.getId()==1){

        nameAssignatura.setText(assignatura.getNombreAssignatura());
        descripcionAssignatura.setText(assignatura.getDescripcion());

    }else if(assignatura.getId()==2){
        nameAssignatura.setText(assignatura.getNombreAssignatura());
        descripcionAssignatura.setText(assignatura.getDescripcion());

    }


    }





}
