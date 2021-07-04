package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public class CampoCep extends Campos {

    public CampoCep(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        super(gravarArq, endereco, proximo);
    }

    @Override
    public void escrever() {

        if (endereco.getCep() != null && (endereco.getTipoLogradouro() != null || endereco.getLogradouro() != null ||
                endereco.getBairro() != null || endereco.getNumero() != null)) {
            gravarArq.print(", cep = '" + endereco.getCep() + "'");
        } else if (endereco.getCep() != null) {
            gravarArq.print("cep = '" + endereco.getCep() + "'");
        }
        System.out.println("CampoCep");
        proximo.escrever();
    }
}
