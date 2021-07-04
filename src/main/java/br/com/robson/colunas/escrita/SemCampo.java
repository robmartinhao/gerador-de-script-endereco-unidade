package br.com.robson.colunas.escrita;

import java.io.PrintWriter;

public class SemCampo extends Campos {

    public SemCampo() {
        super(null, null, null);
    }

    @Override
    public void escrever() {
        System.out.println("Sem Campo");
    }
}
