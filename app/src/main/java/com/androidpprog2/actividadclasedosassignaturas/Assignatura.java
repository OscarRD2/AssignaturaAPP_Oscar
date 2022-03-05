package com.androidpprog2.actividadclasedosassignaturas;

import java.io.Serializable;

public class Assignatura implements Serializable {

    int id;
    String nombreAssignatura;
    String descripcion;
    //String img;

    public Assignatura(int id, String nombreAssignatura, String descripcion) {
        this.id = id;
        this.nombreAssignatura = nombreAssignatura;
        this.descripcion = descripcion;
    }


    public int getId() {
        return id;
    }

    public String getNombreAssignatura() {
        return nombreAssignatura;
    }

    public String getDescripcion() {
        return descripcion;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setNombreAssignatura(String nombreAssignatura) {
        this.nombreAssignatura = nombreAssignatura;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
