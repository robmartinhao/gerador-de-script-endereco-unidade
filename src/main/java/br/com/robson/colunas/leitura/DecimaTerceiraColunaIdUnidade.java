package br.com.robson.colunas.leitura;

import br.com.robson.Endereco;

public class DecimaTerceiraColunaIdUnidade implements Colunas {

    @Override
    public void aplicar(Endereco endereco, String valor) {
        if (valor == "") {
            endereco.setIdUnidade(null);
        } else {
            endereco.setIdUnidade(valor);
        }
    }
}
