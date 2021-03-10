/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.actrec_jstl_lleomiranda_datasource;

import es.cifpcm.actrec_jstl_lleomiranda_pojos.Marca;
import es.cifpcm.actrec_jstl_lleomiranda_pojos.Modelo;
import es.cifpcm.actrec_jstl_lleomiranda_pojos.Tipo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author l
 */
public class DbManager {
    
    static Connection conn = null;
    
    
    public static Connection getConnection() {
         try  {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Concesionario", "root", "");
            return conn;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static List<Tipo> tipos() throws SQLException {
        List<Tipo> lista = new ArrayList<>();
        try {
            conn = getConnection();          
            String query = "SELECT * FROM TiposCoche";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rset = pstmt.executeQuery();
            while (rset.next()) 
                lista.add(new Tipo(rset.getInt("idTipoCoche"), rset.getString("nombre")));                
            conn.close();
            conn = null;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlex) {
                    // ignore, as we can't do anything about it here
                }
                conn = null;
            }
        }
        return lista;
    }
    
    public static List<Marca> marcas() throws SQLException {
        List<Marca> lista = new ArrayList<>();
        try {
            conn = getConnection();          
            String query = "SELECT * FROM Marcas";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rset = pstmt.executeQuery();
            while (rset.next()) 
                lista.add(new Marca(rset.getInt("idMarca"), rset.getString("nombre"),rset.getString("logo")));                
            conn.close();
            conn = null;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlex) {
                    // ignore, as we can't do anything about it here
                }
                conn = null;
            }
        }
        return lista;
    }
    
    public static List<Modelo> lista() throws SQLException {
        List<Modelo> lista = new ArrayList<>();
        try {
            conn = getConnection();          
            String query = "SELECT ma.logo as 'logo', mo.nombre as 'modelo',ma.nombre as 'marca',t.nombre as 'tipo',mo.fechaLanzamiento as 'fecha' FROM Modelos as mo INNER JOIN Marcas as ma ON mo.IdMarca=ma.IdMarca INNER JOIN TiposCoche as t on t.IdTipoCoche=mo.IdTipoCoche";
            PreparedStatement pstmt = conn.prepareStatement(query);       
            ResultSet rset = pstmt.executeQuery();
            while (rset.next()) 
                lista.add(new Modelo(rset.getString("logo"), rset.getString("marca"), rset.getString("tipo"),rset.getString("modelo"),rset.getDate("fecha")));                
            conn.close();
            conn = null;
        } finally {

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlex) {
                    // ignore, as we can't do anything about it here
                }

                conn = null;
            }
        }
        return lista;
    }

    public static int insert(Modelo modelo) throws SQLException {
        int result = 0;
        try {
            conn = getConnection();          
            String query = "INSERT INTO `Modelos`(`IdModelo`, `IdMarca`, `IdTipoCoche`, `Nombre`, `FechaLanzamiento`) VALUES (null,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, modelo.getIdMarca());
            pstmt.setInt(2, modelo.getIdTipoCoche());
            pstmt.setString(3, modelo.getModelo());
            pstmt.setDate(4, modelo.getFecha());
            result = pstmt.executeUpdate();
            conn.close();
            conn = null;
        } finally {

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlex) {
                    // ignore, as we can't do anything about it here
                }

                conn = null;
            }
        }
        return result;
    }

    
    
}