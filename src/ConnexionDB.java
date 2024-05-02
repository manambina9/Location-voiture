
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manambina
 */
public class ConnexionDB {
     Connection con = null;
    public static Connection conexion(){
        try{
            Class.forName("com.sql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/auto_plus","root","");
            if(con != null){
                System.out.println("La connexion a la base de données a été établi avec success ");
            }else{
                System.out.println("Erreur lors de la connexion a la base de donnnées");
            }
            return con;
            
        }catch(Exception e){
            System.out.println("--> SQLException : " +e );
            return null;
        }
    }   
}
