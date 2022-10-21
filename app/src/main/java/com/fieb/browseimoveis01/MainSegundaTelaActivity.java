package com.fieb.browseimoveis01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainSegundaTelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsegundatela);

        Button btnListagem = findViewById(R.id.btVisitas);

        Intent it = getIntent();
        String emailLogado = it.getStringExtra("email");

        if(emailLogado != null || !emailLogado.isEmpty()){
            Snackbar.make(btnListagem, "SEJA BEM-VINDO " + emailLogado + " !!! ",
                    Snackbar.LENGTH_LONG).show();
        }

        btnListagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainSegundaTelaActivity.this, ListagemCasas.class);
                startActivity(it);
            }
        });
    }
}