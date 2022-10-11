package com.fieb.browseimoveis01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;

public class BrowseLogin<textView> extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_login);

        // vínculo objeto java com xml da janela
        EditText email = findViewById(R.id.edit_email);
        EditText senha = findViewById(R.id.edit_eye);

        Button botao = findViewById(R.id.bt_entrar);

        // acionamento do botão para logar
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    if(email.equals("") || email == null){
                        Snackbar.make(v, "Entrar com email!", Snackbar.LENGTH_LONG).show();
                    } else {
                        if(senha.equals("") || senha == null){
                            Snackbar.make(v, "Entrar com senha!", Snackbar.LENGTH_LONG).show();
                        } else {

                            Intent it = new Intent(BrowseLogin.this, MainActivity.class);
                            startActivity(it);
                        }
                    }


                }catch (Exception e){
                    Snackbar.make(v, "Erro: " + e.getMessage(), Snackbar.LENGTH_LONG).show();
                }

            }
        });

    }
}