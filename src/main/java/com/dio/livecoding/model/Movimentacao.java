package com.dio.livecoding.model;

// CLASSE MODEL DA TABELA DO BANCO

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

// Anototation do Lombook para aumentar a produtividade e definir, getters, setters, contrutores, etc... (Lombook pode ser colocado no build.grade)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Movimentacao {

    // Classe que irá ajudar com os ids compostos
    // Serializable -> para ajudar com a transferencia serializada de dados
    // @Embeddable -> Anotação para embutir classes
    // É necessário utilizar os construtores
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentacaoId implements Serializable{
        private long idMovimento;
        private long idUsuario;
    }
    // @EmbeddedId -> demostra que o id está sendo criado pela classe auxiliar
    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;

    // Relacionamentos
    private Ocorrencia ocorrencia;
    private Calendario calendario;
}
