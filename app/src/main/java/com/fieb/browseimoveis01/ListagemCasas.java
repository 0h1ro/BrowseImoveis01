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

        listaCasas.add(new Casa(null, "Casa na Praia", "6 cômodos,3 Quartos, 2 Banheiros, Cozinha,Sala de Estar." +
                " Agendado para o dia 14/05/2022"));
        listaCasas.add(new Casa(null, "Apartamento no Centro", "4 cômodos,2 Quarto,1 Banheiro, Cozinha e Sala, acompanhado de piscina." +
                " Agendado para o dia 18/05/2022"));
        listaCasas.add(new Casa(null, "Casa em Alphaville", "3 cômodos,Quarto,Banheiro ,Cozinha e Sala." +
                " Agendado para o dia 19/08/2022"));
        listaCasas.add(new Casa(null, "Casa no campo", "6 cômodos, 4 Quartos,3 Banheiro ,Cozinha, Sala de Estar, acompanhado de piscina. " +
                "Agendado para o dia 12/07/2022"));
        listaCasas.add(new Casa(null, "Casa em Residencial", "5 cômodos, 3 Quartos, Banheiro, Cozinha Americana e Sala de Estar, acompanhado de garagem e piscina. " +
                "Agendado para o dia 10/04/2022"));



        RecyclerView lista = findViewById(R.id.recyclerVew_produtos);
        adapterListagemCasas = new AdapterListagemCasas(listaCasas);
        lista.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        lista.setAdapter(adapterListagemCasas);

    }
}