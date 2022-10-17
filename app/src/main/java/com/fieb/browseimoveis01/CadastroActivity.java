package com.fieb.browseimoveis01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class CadastroActivity extends AppCompatActivity {

    WebView site;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        site = findViewById(R.id.webView);

        site.loadUrl("http://www.browseimoveis.mytcc.com.br");
    }
}