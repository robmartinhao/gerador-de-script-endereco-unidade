package br.com.robson.colunas.leitura;

import br.com.robson.Endereco;

public class DecimaColunaRestricao implements Colunas {

    @Override
    public void aplicar(Endereco endereco, String valor) {
        if (valor == "") {
            endereco.setRestricao(null);
        } else {
            endereco.setRestricao(valor);
        }
    }
}
