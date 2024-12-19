package org.example.TestMemoria;

/*
* Heap: Foco em objetos e dados de longo prazo, gerenciado pelo Garbage Collector.
* Stack: Foco em variáveis temporárias e execução de métodos, gerenciado automaticamente.
* */

public class TestMemoria {
    public static void main(String[] args) {
        int numero = 10; // Armazenado no stack
        String texto = "Texto";

        Pessoa pessoa = new Pessoa("Maria");
    }
}

class Pessoa {
    private String nome; // "nome" é uma referência na Heap

    public Pessoa(String nome) {
        this.nome = nome; // String "Maria" armazenada na Heap
    }
}
