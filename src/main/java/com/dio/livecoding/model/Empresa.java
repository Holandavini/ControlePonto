package com.dio.livecoding.model;

// CLASSE MODEL DA TABELA DO BANCO

import lombok.*;

// Anototation do Lombook para aumentar a produtividade e definir, getters, setters, contrutores, etc... (Lombook pode ser colocado no build.grade)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Empresa {
    private Long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String numero;

}
