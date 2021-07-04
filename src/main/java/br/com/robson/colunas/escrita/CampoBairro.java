package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public class CampoBairro extends Campos {

    public CampoBairro(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        super(gravarArq, endereco, proximo);
    }

    @Override
    public void escrever() {

        if (endereco.getBairro() != null && (endereco.getTipoLogradouro() != null || endereco.getLogradouro() != null)) {
            gravarArq.print(", bairro = '" + endereco.getBairro() + "'");
        } else if (endereco.getBairro() != null) {
            gravarArq.print("bairro = '" + endereco.getBairro() + "'");
        }
        System.out.println("CampoBairro");
        proximo.escrever();
    }
}
