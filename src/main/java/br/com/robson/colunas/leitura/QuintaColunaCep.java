package br.com.robson.colunas.leitura;

import br.com.robson.Endereco;

public class QuintaColunaCep implements Colunas {

    @Override
    public void aplicar(Endereco endereco, String valor) {
        if (valor == "") {
            endereco.setCep(null);
        } else {
            endereco.setCep(valor);
        }
    }
}
