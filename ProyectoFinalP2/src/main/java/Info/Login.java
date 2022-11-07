/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Info;

import DomiDao.LoginDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jairo Fernando
 */
public class Login implements Login_Interface {
     private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT Id_Usuario, Username, password FROM Usuario";
    private static final String SQL_INSERT = "INSERT INTO Usuario (Username, Password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE Usuario SET Username=?, Password=? WHERE Id_Usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM Usuario WHERE Id_Usuario=?";

    public Login() {

    }

    public Login(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    @Override
    public List<LoginDTO> Select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        LoginDTO usu = null;
        List<LoginDTO> usuarios = new ArrayList<LoginDTO>();
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_Usuario = rs.getInt("Id_Usuario");
                String Username = rs.getString("username");
                String password = rs.getString("password");

                usu = new LoginDTO();
                usu.setId_Usuario(id_Usuario);
                usu.setUsername(Username);
                usu.setPassword(password);

                usuarios.add(usu);
            }
        } catch(SQLException ex) {
            System.out.println("Hay un error en Select "+ex);
        } catch (Exception ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
         }
        return usuarios; 
    }

    @Override
    public int Insert(LoginDTO usuario) throws SQLException {
     Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());

            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
            
        }catch(SQLException ex){
            System.out.println("Hay un error en Insert "+ex);
        } catch (Exception ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
         }
        return rows;    
    
    }

    @Override
    public int update(LoginDTO usuario) throws SQLException {
         Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId_Usuario());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);
            
        } catch(SQLException ex){
            System.out.println("Hay un erro en Update "+ex);
        } catch (Exception ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
         }
        return rows;  
    
    }

    @Override
    public int Delete(LoginDTO usuario) throws SQLException {
         Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            
            stmt.setInt(1, usuario.getId_Usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch(SQLException ex){
            System.out.println("Hay un erro en Delete "+ex);
        } catch (Exception ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
         }
        return rows;
    }
}
