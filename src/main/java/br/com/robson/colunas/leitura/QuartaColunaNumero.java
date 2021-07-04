package br.com.robson.colunas.leitura;

import br.com.robson.Endereco;

public class QuartaColunaNumero implements Colunas {

    @Override
    public void aplicar(Endereco endereco, String valor) {
        if (valor == "") {
            endereco.setNumero(null);
        } else {
            endereco.setNumero(valor);
        }
    }
}
