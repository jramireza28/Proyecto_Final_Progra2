/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Info;

import DomiDao.ProveedorDTO;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Jairo Fernando
 */
public interface Proveedor_Interface {
    public List<ProveedorDTO> Select() throws SQLException;
    public int Insert(ProveedorDTO serie) throws SQLException;
    public int update(ProveedorDTO serie) throws SQLException;
    public int Delete(ProveedorDTO serie) throws SQLException;
}
