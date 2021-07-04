package br.com.robson.colunas.leitura;

import br.com.robson.Endereco;

public class NonaColunaAreaRural implements Colunas {

    @Override
    public void aplicar(Endereco endereco, String valor) {
        if (valor == "") {
            endereco.setAreaRural(null);
        } else {
            endereco.setAreaRural(valor);
        }
    }
}
