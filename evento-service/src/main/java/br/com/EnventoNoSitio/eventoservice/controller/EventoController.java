package br.com.EnventoNoSitio.eventoservice.controller;


import br.com.EnventoNoSitio.eventoservice.model.Evento;
import br.com.EnventoNoSitio.eventoservice.repository.EventoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/evento")
public class EventoController {
    
    
    @Autowired
    EventoRepository eventoRepository;
    
    @GetMapping
    public List<Evento> lista(){
        return eventoRepository.findAll();
    }
    @GetMapping("/{id}")
    public Evento lista(@PathVariable Long id){
        Optional<Evento> eventoResponse = eventoRepository.findById(id);
        Evento evento = eventoResponse.get();
        return evento;
    }
    
}
