package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public class CampoNumero extends Campos {

    public CampoNumero(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        super(gravarArq, endereco, proximo);
    }

    @Override
    public void escrever() {

        if (endereco.getNumero() != null && (endereco.getTipoLogradouro() != null || endereco.getLogradouro() != null ||
                endereco.getBairro() != null)) {
            gravarArq.print(", numero = '" + endereco.getNumero() + "'");
        } else if (endereco.getNumero() != null) {
            gravarArq.print("numero = '" + endereco.getNumero() + "'");
        }
        System.out.println("CampoNumero");
        proximo.escrever();
    }
}
