/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author walte
 */


public class Conexion {
    private final String Driver = "oracle.jdbc.OracleDriver";
    private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private final String User = "usr_aplicacion_url";
    private final String Password = "url123";
    
    private Connection conexion;

    public Conexion() {
        this.conexion = null;
    }

    public Connection conectar(){
        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.conexion = DriverManager.getConnection(URL, User, Password);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    
    public void desconectar(){
        try {
            this.conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
