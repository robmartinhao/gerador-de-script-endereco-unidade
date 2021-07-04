package br.com.robson;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Endereco {

    private String tipoLogradouro;
    private String logradouro;
    private String bairro;
    private String numero;
    private String cep;
    private String cidade;
    private String complemento;
    private String regiaoAdministrativa;
    private String areaRural;
    private String restricao;
    private String identificador;
    private String nome;
    private String idUnidade;
}
