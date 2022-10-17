package com.fieb.browseimoveis01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListagemCasas extends AppCompatActivity {

    AdapterListagemCasas adapterListagemCasas;

    List<Casa> listaCasas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_casas);

        listaCasas = new ArrayList<Casa>();

        listaCasas.add(new Casa(null, "Casa na Praia", "2 cômodos, e garagem"));
        listaCasas.add(new Casa(null, "Apartamento na Praia", "3 cômodos, e piscina"));
        listaCasas.add(new Casa(null, "Casa no campo", "2 cômodos, piscina e garagem"));

        RecyclerView lista = findViewById(R.id.recyclerVew_produtos);
        adapterListagemCasas = new AdapterListagemCasas(listaCasas);
        lista.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        lista.setAdapter(adapterListagemCasas);

    }
}