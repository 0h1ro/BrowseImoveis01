package com.fieb.browseimoveis01;

import android.os.StrictMode;

import java .sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {


    public static connection conectar(){
        Connection conn = null;
        try{
            StrictMode.ThreadPolicy politica;
            politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);
            Class.forName(className:"net.sourceforge.jtds.jdbc.Driver");


            conn = DriverManager.getConnection(url: "jdbc:jtds:sqlserver://172.19.2.204; " +
                    "databaseName= "PRA3;user=sa;password = 123456; );
        }catch(SQLException e) {
            e.getMessage();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
        return conn;

    }


}
