package com.androidpprog2.actividadclasedosassignaturas;

import java.io.Serializable;

public class Assignatura implements Serializable {

    int id;
    int nombreAssignatura;
    int descripcion;
    //String img;

    public Assignatura(int id, int nombreAssignatura, int descripcion) {
        this.id = id;
        this.nombreAssignatura = nombreAssignatura;
        this.descripcion = descripcion;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombreAssignatura() {
        return nombreAssignatura;
    }

    public void setNombreAssignatura(int nombreAssignatura) {
        this.nombreAssignatura = nombreAssignatura;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }
}
