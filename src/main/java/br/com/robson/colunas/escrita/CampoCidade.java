package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public class CampoCidade extends Campos {

    public CampoCidade(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        super(gravarArq, endereco, proximo);
    }

    @Override
    public void escrever() {

        if (endereco.getCidade() != null && (endereco.getTipoLogradouro() != null || endereco.getLogradouro() != null ||
                endereco.getBairro() != null || endereco.getNumero() != null || endereco.getCep() != null)) {
            gravarArq.print(", cidade = '" + endereco.getCidade() + "'");
        } else if (endereco.getCidade() != null) {
            gravarArq.print("cidade = '" + endereco.getCidade() + "'");
        }
        System.out.println("CampoCidade");
        proximo.escrever();
    }
}
