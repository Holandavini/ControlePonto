package com.dio.livecoding.model;

// CLASSE MODEL DA TABELA DO BANCO

import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

// Anototation do Lombook para aumentar a produtividade e definir, getters, setters, contrutores, etc... (Lombook deve ser colocado no build.grade)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private Long id;
    private String descricao;

    // Relacionamento com a classe NivelAcesso | @ManyToOne é pra desmonstrar a relação entre as entidades do banco (Diretor(nivel de acesso) pode ter acesso a varias localidades)
    @ManyToOne
    private NivelAcesso nivelAcesso;
}
