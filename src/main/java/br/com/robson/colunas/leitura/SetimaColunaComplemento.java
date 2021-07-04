package br.com.robson.colunas.leitura;

import br.com.robson.Endereco;

public class SetimaColunaComplemento implements Colunas {

    @Override
    public void aplicar(Endereco endereco, String valor) {
        if (valor == "") {
            endereco.setComplemento(null);
        } else {
            endereco.setComplemento(valor);
        }
    }
}
