package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public class CampoRestricao extends Campos {

    public CampoRestricao(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        super(gravarArq, endereco, proximo);
    }

    @Override
    public void escrever() {

        if (endereco.getRestricao() != null && (endereco.getTipoLogradouro() != null || endereco.getLogradouro() != null ||
                endereco.getBairro() != null || endereco.getNumero() != null || endereco.getCep() != null || endereco.getCidade() != null ||
                endereco.getComplemento() != null || endereco.getRegiaoAdministrativa() != null || endereco.getAreaRural() != null)) {
            gravarArq.print(", restricao = '" + endereco.getRestricao() + "'");
        } else if (endereco.getRestricao() != null) {
            gravarArq.print("restricao = '" + endereco.getRestricao() + "'");
        }
        System.out.println("CampoRestricao");
        proximo.escrever();
    }
}
