package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public class CampoNome extends Campos {

    public CampoNome(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        super(gravarArq, endereco, proximo);
    }

    @Override
    public void escrever() {

        if (endereco.getNome() != null && (endereco.getTipoLogradouro() != null || endereco.getLogradouro() != null ||
                endereco.getBairro() != null || endereco.getNumero() != null || endereco.getCep() != null || endereco.getCidade() != null ||
                endereco.getComplemento() != null || endereco.getRegiaoAdministrativa() != null || endereco.getAreaRural() != null ||
                endereco.getRestricao() != null || endereco.getIdentificador() != null)) {
            gravarArq.print(", nome = '" + endereco.getNome() + "'");
        } else if (endereco.getNome() != null) {
            gravarArq.print("nome = '" + endereco.getNome() + "'");
        }
        System.out.println("CampoNome");
        proximo.escrever();
    }
}
