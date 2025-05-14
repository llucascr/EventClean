package dev.aula.arquitetura.limpa.EventClean.core.entities;

import dev.aula.arquitetura.limpa.EventClean.core.enums.TipoEvento;

import java.time.LocalDateTime;

public record Evento(
        Long id,
        String nome,
        String descricao,
        String identificador,
        LocalDateTime dataInicio,
        LocalDateTime dataFim,
        String localEvento,
        Integer capacidade,
        String organizador,
        TipoEvento tipo
) {}
