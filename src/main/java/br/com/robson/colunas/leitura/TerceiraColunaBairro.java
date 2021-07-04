package br.com.robson.colunas.leitura;

import br.com.robson.Endereco;

public class TerceiraColunaBairro implements Colunas {

    @Override
    public void aplicar(Endereco endereco, String valor) {
        if (valor == "") {
            endereco.setBairro(null);
        } else {
            endereco.setBairro(valor);
        }
    }
}
