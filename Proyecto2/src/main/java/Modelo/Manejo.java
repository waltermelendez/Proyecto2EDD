/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author walte
 */
public class Manejo {
     public Manejo() {
    }
    public String TrabajarDatos(String dato1, String dato2){
        return dato1 + " - " + dato2;
    }
    
    public String ValidaUsuario(String usuario, String pass){
        if(usuario.equals("kenneth.zea@gmail.com")&&pass.equals("123123123")){
            return "ok";
        }
        else{
            return "no";
        }
    }
    
    public String ValidaUsuario1(String usuario, String pass){
        String consulta;
        Conexion conexion = new Conexion();
        
        consulta = "select * from usuarios where usuario = '" + usuario + 
                "' and password = '" + pass + "'";
        System.out.println(consulta);
        Connection con = conexion.conectar();
        try {
            Statement cn = con.createStatement();
            try {
                ResultSet rs = cn.executeQuery(consulta);
                while(rs.next()){
                    return "ok";
                }
            } catch (SQLException ex) {
                Logger.getLogger(Manejo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manejo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "no";
    }
    
    public void AgregarDatos(String usuario, String password){
        String instruccion;
        Conexion conexion = new Conexion();
        Connection con = conexion.conectar();
        instruccion="insert into usuarios (usuario, password) values('" +
                usuario + "','" + password + "')";
        try {
            Statement cn = con.createStatement();
            try {
                System.out.println("Insert2->" + instruccion);
                cn.executeUpdate(instruccion);
            } catch (SQLException ex) {
                Logger.getLogger(Manejo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manejo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Usuario> ListaUsuarios(){
        ArrayList<Usuario> ListaUsuarios = new ArrayList();
        Usuario u;
        String consulta;
        Conexion conexion = new Conexion();
        
        consulta = "select * from usuarios order by usuario";
        System.out.println(consulta);
        Connection con = conexion.conectar();
        try {
            Statement cn = con.createStatement();
            try {
                ResultSet rs = cn.executeQuery(consulta);
                while(rs.next()){
                    u = new Usuario(rs.getString("usuario"),rs.getString("password"));
                    System.out.println("usuario->" + u.toString());
                    ListaUsuarios.add(u);                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Manejo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manejo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ListaUsuarios;
    }
}
