/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.actrec_jstl_lleomiranda_pojos;

import java.sql.Date;

/**
 *
 * @author l
 */
public class Modelo {
    private int idModelo;
    private int idMarca;
    private int idTipoCoche;
    private String logo;
    private String marca;
    private String tipo;
    private String modelo;
    private Date fecha;
    
    public Modelo(){}

    public Modelo( int idMarca, int idTipoCoche, String modelo, Date fecha) {
        this.idMarca = idMarca;
        this.idTipoCoche = idTipoCoche;
        this.modelo = modelo;
        this.fecha = fecha;
    }

    public Modelo(String logo, String marca, String tipo, String modelo, Date fecha) {    
        this.logo = logo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.fecha = fecha;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdTipoCoche() {
        return idTipoCoche;
    }

    public void setIdTipoCoche(int idTipoCoche) {
        this.idTipoCoche = idTipoCoche;
    }

    
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

  
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
