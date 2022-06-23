package br.com.EnventoNoSitio.usuarioservice.controller;

import br.com.EnventoNoSitio.usuarioservice.model.Evento;
import br.com.EnventoNoSitio.usuarioservice.model.Usuario;
import br.com.EnventoNoSitio.usuarioservice.repository.UsuarioRepository;
import br.com.EnventoNoSitio.usuarioservice.service.EventoService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    @Autowired
    EventoService eventoService;
    
    @GetMapping
    public List<Usuario> lista(){
        return usuarioRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Usuario listaPelaId(@PathVariable Long id){
        Optional<Usuario> usuarioResponse = usuarioRepository.findById(id);
        Usuario usuario = usuarioResponse.get();
//        for(Evento evento: eventoService.listaEvento(id)){
//            if(evento.getIdCliente() == usuario.getId()){
//                e.add(evento);
//            }
//        }
        usuario.setEvento(eventoService.listaEvento(id));
        return usuario;
    }
    
}
