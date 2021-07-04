package br.com.robson.colunas.leitura;

import br.com.robson.Endereco;

public class DecimaSegundaColunaNome implements Colunas {

    @Override
    public void aplicar(Endereco endereco, String valor) {
        if (valor == "") {
            endereco.setNome(null);
        } else {
            endereco.setNome(valor);
        }
    }
}
