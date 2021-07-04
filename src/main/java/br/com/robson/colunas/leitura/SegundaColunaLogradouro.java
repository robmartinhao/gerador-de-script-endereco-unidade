package br.com.robson.colunas.leitura;

import br.com.robson.Endereco;

public class SegundaColunaLogradouro implements Colunas {

    @Override
    public void aplicar(Endereco endereco, String valor) {
        if (valor == "") {
            endereco.setLogradouro(null);
        } else {
            endereco.setLogradouro(valor);
        }
    }
}
