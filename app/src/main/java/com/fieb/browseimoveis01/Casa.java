package com.fieb.browseimoveis01;

public class Casa {

    byte[] imagem;
    String nome;
    String descricao;

    public Casa(byte[] imagem, String nome, String descricao) {
        this.imagem = imagem;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Casa() {
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
