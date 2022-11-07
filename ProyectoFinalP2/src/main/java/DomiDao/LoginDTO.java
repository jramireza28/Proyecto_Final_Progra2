/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomiDao;

/**
 *
 * @author Jairo Fernando
 */
public class LoginDTO {
     private int Id_Usuario;
    private String Username;
    private String Password;

    public LoginDTO(int Id_Usuario, String Username, String Password) {
        this.Id_Usuario = Id_Usuario;
        this.Username = Username;
        this.Password = Password;
    }

    public LoginDTO() {
        
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "Id_usuario=" + getId_Usuario() + ", Username=" + getUsername() + ", Password=" + getPassword() + '}';
    }

    /**
     * @return the Id_Usuario
     */
    public int getId_Usuario() {
        return Id_Usuario;
    }

    /**
     * @param Id_Usuario the Id_Usuario to set
     */
    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
}
