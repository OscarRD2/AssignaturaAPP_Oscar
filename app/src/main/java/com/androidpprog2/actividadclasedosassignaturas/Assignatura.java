package com.androidpprog2.actividadclasedosassignaturas;

public class Assignatura {

    int id;
    String nombreAssignatura;
    String descripcion;
    String img;

    public Assignatura(int id, String nombreAssignatura, String descripcion, String img) {
        this.id = id;
        this.nombreAssignatura = nombreAssignatura;
        this.descripcion = descripcion;
        this.img = img;
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

    public String getImg() {
        return img;
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

    public void setImg(String img) {
        this.img = img;
    }
}
