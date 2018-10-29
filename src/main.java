

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;



public class main {
    private static Connection mysql;

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        
        try{
            mysql = DriverManager.getConnection(
                    "jdbc:mysql://localhost/agenda",
                    "root",
                    "");
            System.out.println("Conectado!");

            inserir();
        }catch(SQLException e){
            System.out.println("Ocorreu um erro!");
            throw new RuntimeException(e.getMessage());

        }}
    public static void inserir(){


            String sql = "insert into contato (nome, endereco, data, email) values(?, ?, ?, ?)";
            PreparedStatement instrucao = mysql.prepareStatement(sql);

            instrucao.setString(1, "José Eduardo");
            instrucao.setString(2, "Rua rua");
            instrucao.setString(3, "28/06");
            instrucao.setString(4, "eduardcoutinho2@gmail.com");

            instrucao.execute();






    }




}
