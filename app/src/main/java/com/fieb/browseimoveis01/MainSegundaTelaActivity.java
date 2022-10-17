package com.fieb.browseimoveis01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainSegundaTelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsegundatela);

        Button btnListagem = findViewById(R.id.btVisitas);

        btnListagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainSegundaTelaActivity.this, ListagemCasas.class);
                startActivity(it);
            }
        });
    }
}