package br.com.robson.colunas.leitura;

import br.com.robson.Endereco;

public class DecimaPrimeiraColunaIdentificador implements Colunas {

    @Override
    public void aplicar(Endereco endereco, String valor) {
        if (valor == "") {
            endereco.setIdentificador(null);
        } else {
            endereco.setIdentificador(valor);
        }
    }
}
