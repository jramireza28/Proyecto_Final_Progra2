/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomiDao;

/**
 *
 * @author Jairo Fernando
 */
public class RelojDTO {
     private int Id_Album;
    private String Cancion_p;
    private String F_Genero_Musical;
   

    public RelojDTO(int Id_Album, String Cancion_p, String Relojes) {
        this.Id_Album = Id_Album;
        this.Cancion_p = Cancion_p;
        this.F_Genero_Musical = F_Genero_Musical;
       
    }

    public RelojDTO() {
        
    }

    /**
     * @return the Relojes
     */
    public int getId_Album() {
        return Id_Album;
    }

    /**
     * @param Relojes the Relojes to set
     */
    public void setId_Album(int Relojes) {
        this.Id_Album = Id_Album;
    }

    /**
     * @return the Relojes
     */
    public String getRelojes() {
        return Cancion_p;
    }

    /**
     * @param Cancion_p the Cancion_p to set
     */
    public void setCancion_p(String Cancion_p) {
        this.Cancion_p = Cancion_p;
    }

    /**
     * @return the F_Genero_Musical
     */
    public String getF_Genero_Musical() {
        return F_Genero_Musical;
    }

    /**
     * @param F_Genero_Musical the F_Genero_Musical to set
     */
    public void setF_Genero_Musical(String F_Genero_Musical) {
        this.F_Genero_Musical = F_Genero_Musical;
    }
    @Override
    public String toString() {
        return "AlbumDTO{" + "Id_Album=" + Id_Album + ", Cancion_p=" + Cancion_p + ", F_Genero_Musical=" + F_Genero_Musical  + '}';
    }
}
