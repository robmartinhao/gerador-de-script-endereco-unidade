package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public class CampoRegiaoAdministrativa extends Campos {

    public CampoRegiaoAdministrativa(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        super(gravarArq, endereco, proximo);
    }

    @Override
    public void escrever() {

        if (endereco.getRegiaoAdministrativa() != null && (endereco.getTipoLogradouro() != null || endereco.getLogradouro() != null ||
                endereco.getBairro() != null || endereco.getNumero() != null || endereco.getCep() != null || endereco.getCidade() != null ||
                endereco.getComplemento() != null)) {
            gravarArq.print(", regiao_administrativa = '" + endereco.getRegiaoAdministrativa() + "'");
        } else if (endereco.getRegiaoAdministrativa() != null) {
            gravarArq.print("regiao_administrativa = '" + endereco.getRegiaoAdministrativa() + "'");
        }
        System.out.println("CampoRegiaoAdministrativa");
        proximo.escrever();
    }
}
