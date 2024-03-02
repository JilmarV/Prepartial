/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Connection.ConnectionMySQL;
import Models.Car;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jilssa
 */
public class CarController {
    // Creamos un objeto de la clase ConexionMySQL
    ConnectionMySQL conexion;

    public CarController() {
        this.conexion = new ConnectionMySQL();
    }

    public void insert(Car car) {
        // Establecemos la conexión con la base de datos
        try (Connection conn = conexion.conectarMySQL()) {
            // Verificamos si la conexión fue exitosa
            if (conn != null) {
                // Preparamos la consulta SQL para insertar datos
                String insertSQL = "INSERT INTO car (carPlate, model, brand, cylinderCapacity, color) VALUES (?,?,?,?,?)";
                try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                    pstmt.setString(1, car.getCarPLate());
                    pstmt.setString(2, car.getModel());
                    pstmt.setString(3, car.getBrand());
                    pstmt.setInt(4, car.getCylinderCapacity());
                    pstmt.setString(5, car.getColor());

                    // Ejecutamos la consulta
                    int rowsAffected = pstmt.executeUpdate();

                    // Verificamos si la inserción fue exitosa
                    if (rowsAffected > 0) {
                        System.out.println("Inserción exitosa");
                        JOptionPane.showMessageDialog(null, "Se ha registrado con exito ");
                    } else {
                        System.out.println("No se pudo insertar los datos");
                    }
                }
            } else {
                System.out.println("No se pudo establecer la conexión con la base de datos");
            }
        } catch (SQLException e) {
            System.out.println("Ocurrió un error al realizar la inserción en la base de datos");
            e.printStackTrace();
        }
    }

}
