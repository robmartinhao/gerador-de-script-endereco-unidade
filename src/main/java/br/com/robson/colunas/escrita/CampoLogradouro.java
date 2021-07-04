package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public class CampoLogradouro extends Campos {

    public CampoLogradouro(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        super(gravarArq, endereco, proximo);
    }

    @Override
    public void escrever() {

        if (endereco.getLogradouro() != null && endereco.getTipoLogradouro() != null) {
            gravarArq.print(", logradouro = '" + endereco.getLogradouro() + "'");
        } else if (endereco.getLogradouro() != null) {
            gravarArq.print("logradouro = '" + endereco.getLogradouro() + "'");
        }
        System.out.println("CampoLogradouro");
        proximo.escrever();
    }
}
