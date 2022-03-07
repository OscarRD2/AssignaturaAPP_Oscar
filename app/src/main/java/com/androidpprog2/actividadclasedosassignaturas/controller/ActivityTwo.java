package com.androidpprog2.actividadclasedosassignaturas.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidpprog2.actividadclasedosassignaturas.R;
import com.androidpprog2.actividadclasedosassignaturas.model.Assignatura;

public class ActivityTwo extends Activity {

    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        bundle= getIntent().getExtras();

        Assignatura assignatura =(Assignatura) bundle.getSerializable("datos");
        TextView nameAssignatura =(TextView) findViewById(R.id.TituloAssignatura);
        TextView nombreProfesor =(TextView) findViewById(R.id.NombreProfesor);
        TextView descripcionAssignatura =(TextView) findViewById(R.id.DescripcionAssignatura);
        ImageView img = (ImageView) findViewById(R.id.imagen);


    if(assignatura.getId()==1){

        nameAssignatura.setText(assignatura.getNombreAssignatura());
        nombreProfesor.setText(assignatura.getNombreProfesor());
        descripcionAssignatura.setText(assignatura.getDescripcion());
        img.setImageResource(R.drawable.so_img);

    }else if(assignatura.getId()==2){
        nameAssignatura.setText(assignatura.getNombreAssignatura());
        nombreProfesor.setText(assignatura.getNombreProfesor());
        descripcionAssignatura.setText(assignatura.getDescripcion());
        img.setImageResource(R.drawable.ddm);


    }


    }





}
