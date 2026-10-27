/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

    private static final String URL =
            "jdbc:mysql://localhost:3306/bdhotel";

    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection conectar() {
        try {
            Connection conexao =
                    DriverManager.getConnection(URL, USUARIO, SENHA);

            System.out.println("Conexão realizada com sucesso!");
            return conexao;

        } catch (SQLException erro) {
            System.out.println("Erro ao conectar com o banco:");
            System.out.println(erro.getMessage());
            return null;
        }
    }

}
