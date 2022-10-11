package com.fieb.browseimoveis01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class BrowseLogin<textView> extends AppCompatActivity {

    Button botaoLogin;
    Button botaoCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_login);

        getSupportActionBar().hide();

        IniciarComponents();

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(BrowseLogin.this, MainSegundaTelaActivity.class);
                startActivity(it);
            }
        });

        botaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(BrowseLogin.this, CadastroActivity.class);
                startActivity(it);
            }
        });

    }

    private void IniciarComponents(){
        botaoLogin = findViewById(R.id.bt_entrar);

        botaoCadastro = findViewById(R.id.bt_cadastro);


    }

}