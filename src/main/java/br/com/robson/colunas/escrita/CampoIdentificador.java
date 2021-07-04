package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public class CampoIdentificador extends Campos {

    public CampoIdentificador(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        super(gravarArq, endereco, proximo);
    }

    @Override
    public void escrever() {

        if (endereco.getIdentificador() != null && (endereco.getTipoLogradouro() != null || endereco.getLogradouro() != null ||
                endereco.getBairro() != null || endereco.getNumero() != null || endereco.getCep() != null || endereco.getCidade() != null ||
                endereco.getComplemento() != null || endereco.getRegiaoAdministrativa() != null || endereco.getAreaRural() != null ||
                endereco.getRestricao() != null)) {
            gravarArq.print(", identificador = " + endereco.getIdentificador());
        } else if (endereco.getIdentificador() != null) {
            gravarArq.print("identificador = " + endereco.getIdentificador());
        }
        System.out.println("CampoIdentificador");
        proximo.escrever();
    }
}
