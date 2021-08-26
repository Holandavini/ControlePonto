package com.dio.livecoding.model;

// CLASSE MODEL DA TABELA DO BANCO

import lombok.*;

import java.time.LocalDateTime;

// Anototation do Lombook para aumentar a produtividade e definir, getters, setters, contrutores, etc... (Lombook pode ser colocado no build.grade)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario {
    private Long id;
    private String descricao;
    private LocalDateTime dataEspecial;

    // Relacionamentos
    private TipoData tipoData;
}
