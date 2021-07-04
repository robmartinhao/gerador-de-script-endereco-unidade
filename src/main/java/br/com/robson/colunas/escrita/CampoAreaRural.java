package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public class CampoAreaRural extends Campos {

    public CampoAreaRural(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        super(gravarArq, endereco, proximo);
    }

    @Override
    public void escrever() {

        if (endereco.getAreaRural() != null && (endereco.getTipoLogradouro() != null || endereco.getLogradouro() != null ||
                endereco.getBairro() != null || endereco.getNumero() != null || endereco.getCep() != null || endereco.getCidade() != null ||
                endereco.getComplemento() != null || endereco.getRegiaoAdministrativa() != null)) {
            gravarArq.print(", area_rural = " + endereco.getAreaRural());
        } else if (endereco.getAreaRural() != null) {
            gravarArq.print("area_rural = " + endereco.getAreaRural());
        }
        System.out.println("CampoAreaRural");
        proximo.escrever();
    }
}
