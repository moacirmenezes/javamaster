package org.example;

public class Processo {
    private String nome;
    private int numeroProcesso;

    // Construtor
    public Processo(String nome, int numeroProcesso) {
        this.nome = nome;
        this.numeroProcesso = numeroProcesso;
    }

    // Getter e Setter para o nome do processo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para o número do processo
    public int getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(int numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }
}