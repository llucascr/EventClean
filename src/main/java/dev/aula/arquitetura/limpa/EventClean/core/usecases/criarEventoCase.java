package dev.aula.arquitetura.limpa.EventClean.core.usecases;

import dev.aula.arquitetura.limpa.EventClean.core.entities.Evento;

public interface criarEventoCase {

    public Evento execute(Evento evento);
}
