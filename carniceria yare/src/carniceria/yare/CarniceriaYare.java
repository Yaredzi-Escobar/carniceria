/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carniceria.yare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CarniceriaYare {

    public static void main(String[] args) {
        // TODO code application logic here
    }

    private static final String URL = "jdbc:mysql://localhost:3306/carniceria";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";

    public static Connection conexionBaseDatos() {
        try {
            Connection conn = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión exitosa");
            return conn;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public static boolean guardarUsuario(String nombre, String apellido, String rol, String teléfono, String estado, String documento, String contrasena) {
        String sql = "INSERT INTO usuarios (nombre, apellido, rol, teléfono, estado, documento, contrasena) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = conexionBaseDatos(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, rol);
            ps.setString(4, teléfono);
            ps.setString(5, estado);
            ps.setString(6, documento);
            ps.setString(7, contrasena);

            int filas = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "el usuario se guardo correctamente");

            return filas > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar usuario: " + e.getMessage());
            return false;
        }
    }
}
