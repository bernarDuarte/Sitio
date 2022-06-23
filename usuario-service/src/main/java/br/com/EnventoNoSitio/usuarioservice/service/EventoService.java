package br.com.EnventoNoSitio.usuarioservice.service;

import br.com.EnventoNoSitio.usuarioservice.model.Evento;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "evento-service")
public interface EventoService {
    @GetMapping(value = "/evento/{id}")
    Evento listaEvento(@PathVariable("id") Long id);
}
