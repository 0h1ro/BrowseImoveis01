package com.fieb.browseimoveis01;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

public class AdapterListagemCasas extends RecyclerView.Adapter<AdapterListagemCasas.CasasViewHolder> {

    private final List<Casa> mListagem;

    AdapterListagemCasas(List<Casa> casas){
        mListagem = casas;
    };

    @NonNull
    @Override
    public CasasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_listagem_casas_item, parent,
                false);
        return new CasasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CasasViewHolder holder, int position) {
        holder.mItem = mListagem.get(position);

        if(position==0){
            holder.imagemCasa.setImageResource(R.drawable.logo);
        } else if (position == 1){
            holder.imagemCasa.setImageResource(R.drawable.mikey);
        }

        holder.nomeCasa.setText(mListagem.get(position).nome);
        holder.descricaoCasa.setText(mListagem.get(position).descricao);
    }

    @Override
    public int getItemCount() {
        return mListagem.size();
    }

    public class CasasViewHolder extends RecyclerView.ViewHolder{

        public final View mView;
        public final AppCompatImageView imagemCasa;
        public final AppCompatTextView nomeCasa;
        public final AppCompatTextView descricaoCasa;
        public Casa mItem;

        public CasasViewHolder(View view){
            super(view);
            mView = view;
            imagemCasa = (AppCompatImageView) view.findViewById(R.id.imagem_casa);
            nomeCasa = (AppCompatTextView) view.findViewById(R.id.nome_casa);
            descricaoCasa = (AppCompatTextView) view.findViewById(R.id.descricao_casa);
        }
    }
}
