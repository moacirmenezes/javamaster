package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Processo processo1 = new Processo("Processo 1", 123);
        System.out.println("Nome do processo 1: " + processo1.getNome());
        System.out.println("Número do processo 1: " + processo1.getNumeroProcesso());

        processo1.setNome("Novo Processo 1");
        processo1.setNumeroProcesso(456);
        System.out.println("Nome atualizado do processo 1: " + processo1.getNome());
        System.out.println("Número atualizado do processo 1: " + processo1.getNumeroProcesso());


    }
}