package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public abstract class Campos {

    protected PrintWriter gravarArq;
    protected Endereco endereco;
    protected Campos proximo;

    public Campos(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        this.gravarArq = gravarArq;
        this.endereco = endereco;
        this.proximo = proximo;
    }

    public abstract void escrever();
}
