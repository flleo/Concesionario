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
public class Tipo {
    private int idTipoCoche;
    private String nombre;
    
    public Tipo() {}

    public Tipo(int inTipoCoche, String nombre) {
        this.idTipoCoche = inTipoCoche;
        this.nombre = nombre;
    }

    public int getIdTipoCoche() {
        return idTipoCoche;
    }

    public void setIdTipoCoche(int idTipoCoche) {
        this.idTipoCoche = idTipoCoche;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
