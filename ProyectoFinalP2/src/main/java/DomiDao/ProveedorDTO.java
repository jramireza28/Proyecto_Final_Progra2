/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomiDao;

/**
 *
 * @author Jairo Fernando
 */
public class ProveedorDTO {
     private int Id_Artista;
    private String Nombre_s;
    private String Idioma;
  

    @Override
    public String toString() {
        return "ArtistaDTO{" + "Id_Artista=" + getId_Artista() + ", Nombre_s=" + getNombre_s() + ", Idioma=" + getIdioma() + '}';
    }

    public ProveedorDTO(int Id_Artista, String Nombre_s, String Idioma) {
        this.Id_Artista = Id_Artista;
        this.Nombre_s = Nombre_s;
        this.Idioma= Idioma;
     
    }
    public ProveedorDTO() {
        
    }

    /**
     * @return the Id_Artista
     */
    public int getId_Artista() {
        return Id_Artista;
    }

    /**
     * @param Id_Artista the Id_Artista to set
     */
    public void setId_Artista(int Id_Artista) {
        this.Id_Artista = Id_Artista;
    }

    /**
     * @return the Nombre_s
     */
    public String getNombre_s() {
        return Nombre_s;
    }

    /**
     * @param Nombre_s the Nombre_s to set
     */
    public void setNombre_s(String Nombre_s) {
        this.Nombre_s = Nombre_s;
    }

    /**
     * @return the Idioma
     */
    public String getIdioma() {
        return Idioma;
    }

    /**
     * @param Idioma the Idioma to set
     */
    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }
}
