package com.dio.livecoding.model;

// CLASSE MODEL DA TABELA DO BANCO

import lombok.*;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

// Anototation do Lombook para aumentar a produtividade e definir, getters, setters, contrutores, etc... (Lombook pode ser colocado no build.grade)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Usuario {
    private Long id;
    private String nome;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;

    // Relacionamentos com outras classes
    // @ManyToOne -> Uma categoria pode ter vários usuários
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    // @ManyToOne -> Uma empresa pode ter vários usuários
    @ManyToOne
    private Empresa empresa;
    // @ManyToOne -> Um nivel de acesso pode ter vários usuários
    @ManyToOne
    private NivelAcesso nivelAcesso;
    // @ManyToOne -> Uma jornada de trabalho pode ter vários usuários
    @ManyToOne
    private JornandaTrabalho jornandaTrabalho;
}
