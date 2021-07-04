package br.com.robson.colunas.leitura;

import br.com.robson.Endereco;

public class SextaColunaCidade implements Colunas {

    @Override
    public void aplicar(Endereco endereco, String valor) {
        if (valor == "") {
            endereco.setCidade(null);
        } else {
            endereco.setCidade(valor);
        }
    }
}
