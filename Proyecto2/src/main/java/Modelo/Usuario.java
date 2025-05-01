/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author walte
 */
public class Usuario {
    private int Carnet;
    private String Nombre;
    private int Telefono;
    private String Correo;
    private boolean Estado;
    private String[][] tab = new String[20][7];
    private int contadornota;

    public Usuario(int Carnet, String Nombre, int Telefono, String Correo, String[][] TAB) {
        this.Carnet = Carnet;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Correo = Correo;
        Estado = true;
        this.tab = new String[TAB.length][TAB[0].length];
        for (int i = 0; i < TAB.length; i++) {
            for (int j = 0; j < TAB[0].length; j++) {
                this.tab[i][j] = TAB[i][j];
            }
        }
    }

    public void setTab(String[][] tab) {
        this.tab = tab;
    }

    public Usuario() {
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public int getCarnet() {
        return Carnet;
    }

    public void setCarnet(int Carnet) {
        this.Carnet = Carnet;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
}
