/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2025_act2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HOME
 */
public class ConexionBD {
     public Connection getConnection() {
        Connection conectar = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String urlConexion = "jdbc:sqlserver://DESKTOP-VV30AGH\\SQLEXPRESS:1433;databaseName=BdCajeroAct1;\"encrypt=true;trustServerCertificate=true\"";

            conectar = DriverManager.getConnection(urlConexion);
            System.out.println("Conexion exitosa a la BD");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar a la BD: " + e.getMessage());
        }
        return conectar;
    }
}
