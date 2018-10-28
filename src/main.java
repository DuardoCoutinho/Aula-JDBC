

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;



public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Connection mysql = DriverManager.getConnection(
                    "jdbc:mysql://localhost/agenda",
                    "root",
                    "");
            System.out.println("Conectado!");
        }catch(SQLException e){
            System.out.println("Ocorreu um erro!");
            throw new RuntimeException(e.getMessage());

        }
    }
}
