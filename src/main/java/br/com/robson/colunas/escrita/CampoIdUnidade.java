package br.com.robson.colunas.escrita;

import br.com.robson.Endereco;

import java.io.PrintWriter;

public class CampoIdUnidade extends Campos {

    public CampoIdUnidade(PrintWriter gravarArq, Endereco endereco, Campos proximo) {
        super(gravarArq, endereco, proximo);
    }

    @Override
    public void escrever() {

        gravarArq.print(" where informacao_instalacao_id = (select id from tb_informacao_instalacao where unidade = (select id from tb_unidade_intragov where id_unidade = '");
        if (endereco.getIdUnidade() != null) {
            gravarArq.print(endereco.getIdUnidade());
        }
        gravarArq.println("'));");
        System.out.println("CampoIdUnidade");
        proximo.escrever();
    }
}
