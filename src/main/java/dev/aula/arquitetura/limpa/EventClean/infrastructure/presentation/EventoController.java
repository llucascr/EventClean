package dev.aula.arquitetura.limpa.EventClean.infrastructure.presentation;

import dev.aula.arquitetura.limpa.EventClean.core.entities.Evento;
import dev.aula.arquitetura.limpa.EventClean.infrastructure.dtos.EventoDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/")
public class EventoController {

    @PostMapping("criarEvento")
    public String criarEvento(@RequestBody EventoDto dto) {
        return "Evento criado";
    }

}
