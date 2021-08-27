package com.dio.livecoding.model;

// CLASSE MODEL DA TABELA DO BANCO

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

// Anototation do Lombook para aumentar a produtividade e definir, getters, setters, contrutores, etc... (Lombook pode ser colocado no build.grade)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class JornandaTrabalho {
    @Id
    private Long id;
    private String descricao;

}
