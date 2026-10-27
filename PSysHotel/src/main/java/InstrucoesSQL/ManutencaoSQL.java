/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InstrucoesSQL;

import java.sql.*;
import Conexao.*;
import Dados.*;


public class ManutencaoSQL {

    public void cadastrarUsuario(String cpf, String senha)
            throws SQLException {
 
       Connection conexao = Conexao.conectar();
       
       if (conexao==null)
       {
           throw new SQLException(
                   "Não foi possível conectar"
           );
       }
       String sql="insert into usuario(cpf,senha) values (?,?)";
       try (Connection  conn = conexao;
               PreparedStatement stmt =conn.prepareStatement(sql))
       {
         stmt.setString(1, cpf);
         stmt.setString(2, senha);
         stmt.executeUpdate();
       }
 
    }   
}