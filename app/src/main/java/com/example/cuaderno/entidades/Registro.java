package com.example.cuaderno.entidades;

public class Registro {
    private String nombre;
    private String especie;
    private int imagenID;

    public  Registro(){

    }
    public Registro(String nombre, String especie, int imagenID) {
        this.nombre = nombre;
        this.especie = especie;
        this.imagenID = imagenID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public int getImagenID() {
        return imagenID;
    }

    public void setImagenID(int imagenID) {
        this.imagenID = imagenID;
    }
}
