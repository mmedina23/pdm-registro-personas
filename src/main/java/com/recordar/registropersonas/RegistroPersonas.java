package com.recordar.registropersonas;

import com.recordar.registropersonas.dao.ConexionBBDD;
import java.sql.Connection;

/**
 *
 * @author mmedina
 */
public class RegistroPersonas {

    public static void main(String[] args) {
        //        RegistroController controller =  new RegistroController();
        try (Connection connection = ConexionBBDD.getConnection()) {     
          
           ConexionBBDD.executeUpdate(connection, "INSERT INTO registro_personas.mitabla (id, nombre, edad)values('1','Prueba1','23');");
           
           System.out.println("cerrar conexion "+ connection.isClosed());
           
       } catch(Exception e) {
          e.printStackTrace();
       }     

    }
}
