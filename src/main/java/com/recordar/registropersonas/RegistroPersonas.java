
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
           System.out.println("Hello World! "+ connection.isClosed());
           
       } catch(Exception e) {
           System.out.println("hubo un error");
       }        
    }
}
