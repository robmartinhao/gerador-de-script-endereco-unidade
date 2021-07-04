package br.com.robson;

import br.com.robson.colunas.leitura.Colunas;

public class CalculadorDeColuna {

    public void calcular(Endereco endereco, String valor, Colunas colunas) {
        colunas.aplicar(endereco, valor);
    }
}
