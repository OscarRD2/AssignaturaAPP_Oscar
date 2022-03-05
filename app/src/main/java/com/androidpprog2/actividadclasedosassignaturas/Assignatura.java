package com.androidpprog2.actividadclasedosassignaturas;

import java.io.Serializable;

public class Assignatura implements Serializable {

    int id;
    int nombreAssignatura;
    int nombreProfesor;
    int descripcion;
    int img;

    public Assignatura(int id, int nombreAssignatura, int descripcion, int nombreProfesor, int img) {
        this.id = id;
        this.nombreAssignatura = nombreAssignatura;
        this.descripcion = descripcion;
        this.nombreProfesor = nombreProfesor;
        this.img=img;
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

    public int getNombreProfesor() {
        return nombreProfesor;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setNombreProfesor(int nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }
}
