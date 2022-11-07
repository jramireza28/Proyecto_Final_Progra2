/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Info;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Jairo Fernando
 */
public class Conexion {

    private static final String JDBC_URL = "jdbc:sqlite:C:\\Users\\Jairo Fernando\\AppData\\Roaming\\DBeaverData\\workspace6\\.metadata\\sample-database-sqlite-1\\Chinook.db";
    
    public static Connection getConnection() throws Exception {
    
        return DriverManager.getConnection(JDBC_URL);
    
       
    }
}
