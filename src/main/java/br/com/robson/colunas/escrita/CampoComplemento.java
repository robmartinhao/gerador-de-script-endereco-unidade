package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public class CampoComplemento extends Campos {

    public CampoComplemento(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        super(gravarArq, endereco, proximo);
    }

    @Override
    public void escrever() {

        if (endereco.getComplemento() != null && (endereco.getTipoLogradouro() != null || endereco.getLogradouro() != null ||
                endereco.getBairro() != null || endereco.getNumero() != null || endereco.getCep() != null || endereco.getCidade() != null)) {
            gravarArq.print(", complemento = '" + endereco.getComplemento() + "'");
        } else if (endereco.getComplemento() != null) {
            gravarArq.print("complemento = '" + endereco.getComplemento() + "'");
        }
        System.out.println("CampoComplemento");
        proximo.escrever();
    }
}
