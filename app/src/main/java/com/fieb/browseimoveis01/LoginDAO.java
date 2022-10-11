package com.fieb.browseimoveis01;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDAO {


    // LOGIN COM BANCO MYSQL
    public static void logar(String email, String senha){

        try{

            PreparedStatement pst = Conexao.conectar().prepareStatement("" +
                    "Select * from ");

        }catch(SQLException e) {
            e.getMessage();
        }

    }

}
