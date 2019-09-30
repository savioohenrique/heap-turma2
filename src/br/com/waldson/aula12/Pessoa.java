package br.com.waldson.aula12;

import java.util.Observable;

public class Pessoa extends Observable {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome  = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;

        setChanged();
        notifyObservers();
    }


}
