/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archapplication;

/*Data Connection*/
import java.sql.*;

/**
 *
 * @author sergi
 */

public class DBConnection
{
    private static final String URL = "jdbc:mysql://localhost:3306/tbd_pf"; // Cambia 'nombre_base_datos'
    private static final String USER = "adminSQL"; // Usuario de MySQL
    private static final String PASSWORD = ""; // Contraseña de MySQL
    
        /**
     * Método para validar el login de un usuario.
     * @param username Usuario ingresado.
     * @param password Contraseña ingresada.
     * @return true si el usuario y contraseña son correctos, false en caso contrario.
     */
    
    static boolean validateLogin(String user, String pass)
    {
        String query = "SELECT * FROM users WHERE user = ? AND password = ?";

        try (Connection connection = DriverManager.getConnection(URL);
            PreparedStatement statement = connection.prepareStatement(query)) {

            // Establecer los parámetros del query
            statement.setString(1, user);
            statement.setString(2, pass);

            // Ejecutar el query
            ResultSet resultSet = statement.executeQuery();

            // Si hay resultados, el login es válido
            return resultSet.next();

        } catch (SQLException e) {
            // Manejar errores de la base de datos
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            return false;
        }
    }   
}