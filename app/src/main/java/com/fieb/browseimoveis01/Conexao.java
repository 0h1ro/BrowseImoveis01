package com.fieb.browseimoveis01;

import android.os.StrictMode;

import java .sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {


    public static Connection conectar(){
        Connection conn = null;
        try{
           StrictMode.ThreadPolicy politica;
           politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);

            Class.forName("com.mysql.jbdc.Driver");

            conn = DriverManager.getConnection(
                    "jbdc:mysql://168.138.147.248/prap3mysql",
                    "paiva" ,"@220609Lu");

        }catch(SQLException e) {
            e.getMessage();
           }catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
        return conn;

    }

    public static void logar(String email, String senha){

        try{

            PreparedStatement pst = Conexao.conectar().prepareStatement("" +
                    "Select ");

        }catch(SQLException e) {
            e.getMessage();
        }

    }

}
