/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
public class TestaConexao {
   
    public static void main(String[] args) {

        Connection conexao = Conexao.conectar();

        if (conexao != null) {
            System.out.println("MYSQL CONECTADO!");
        } else {
            System.out.println("FALHA NA CONEXÃO!");
        }
    }
 
}
