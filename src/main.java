

import com.mysql.cj.protocol.Resultset;

import java.sql.*;


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


            update();

        }catch(SQLException e){
            System.out.println("Ocorreu um erro!");
            throw new RuntimeException(e.getMessage());

        }}
    public static void inserir(){

        try {


            String sql = "insert into contato (nome, endereco, data, email) values(?, ?, ?, ?)";

            PreparedStatement instrucao = mysql.prepareStatement(sql);

            instrucao.setString(1, "José Eduardo");
            instrucao.setString(2, "Rua rua");
            instrucao.setString(3, "28/06");
            instrucao.setString(4, "eduardcoutinho2@gmail.com");
            instrucao.execute();

        }catch (SQLException e){

            System.out.println("Ocorreu um erro!");
            throw new RuntimeException(e.getMessage());

    }
        }

        public static void select(){
        try{
            String sql = "SELECT * FROM contato";
            Statement instrucao = mysql.createStatement();

            Resultset resul = (Resultset) instrucao.executeQuery(sql);

            while (((ResultSet) resul).next()){
                String nome = ((ResultSet) resul).getString("nome");
                String endereco = ((ResultSet) resul).getString("endereco");
                String data = ((ResultSet) resul).getString("data");
                String email = ((ResultSet) resul).getString("email");
                System.out.println(nome + " ");
                System.out.print(endereco+ " ");
                System.out.print(data+ " ");
                System.out.print(email+ " ");

            }

        }catch (SQLException e){
            System.out.println("Ocorreu um Erro!");
            throw new RuntimeException(e.getMessage());
        }

        }

        public static void update(){
            try {

                String sql = "UPDATE contato SET nome = ? WHERE id_contato = 1";

                PreparedStatement instrucao = mysql.prepareStatement(sql);

                instrucao.setString(1, "Joana LELE");

                instrucao.execute();


            }catch (SQLException e){
                System.out.println("Ocorreu um Erro!");
                throw new RuntimeException(e.getMessage());
            }


        }









    }







