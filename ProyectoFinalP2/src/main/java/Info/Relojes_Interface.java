/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Info;

import DomiDao.RelojDTO;
import java.sql.*;
import java.util.List;
/**
 *
 * @author Jairo Fernando
 */
public interface Relojes_Interface {
     public List<RelojDTO> Select() throws SQLException;
    public int Insert(RelojDTO album) throws SQLException;
    public int update(RelojDTO album) throws SQLException;
    public int Delete(RelojDTO album) throws SQLException;
}
