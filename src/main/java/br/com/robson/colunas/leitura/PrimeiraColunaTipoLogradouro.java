package br.com.robson.colunas.leitura;

import br.com.robson.Endereco;

public class PrimeiraColunaTipoLogradouro implements Colunas {

    @Override
    public void aplicar(Endereco endereco, String valor) {
        if (valor == "") {
            endereco.setTipoLogradouro(null);
        } else {
            endereco.setTipoLogradouro(valor);
        }
    }
}
