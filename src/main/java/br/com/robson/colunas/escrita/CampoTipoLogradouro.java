package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public class CampoTipoLogradouro extends Campos {

    public CampoTipoLogradouro(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        super(gravarArq, endereco, proximo);
    }

    @Override
    public void escrever() {

        gravarArq.print("update dbo.tb_endereco_instalacao set ");
        if (endereco.getTipoLogradouro() != null) {
            gravarArq.print("tipo_logradouro = '" + endereco.getTipoLogradouro() + "'");
        }
        System.out.println("CampoTipoLogradouro");
        proximo.escrever();
    }
}
