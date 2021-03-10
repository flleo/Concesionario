/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.actrec_jstl_lleomiranda_pojos;

/**
 *
 * @author l
 */
public class Marca {
    private int idMarca;
    private String nombre;
    private String logo;
    
    public Marca() {}

    public Marca(int idMarca, String nombre, String logo) {
        this.idMarca = idMarca;
        this.nombre = nombre;
        this.logo = logo;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
}
