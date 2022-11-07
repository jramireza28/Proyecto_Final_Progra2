/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Info;


import DomiDao.LoginDTO;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Jairo Fernando
 */
public interface Login_Interface {
    public List<LoginDTO> Select() throws SQLException;
    public int Insert(LoginDTO usuario) throws SQLException;
    public int update(LoginDTO usuario) throws SQLException;
    public int Delete(LoginDTO usuario) throws SQLException; 
}
