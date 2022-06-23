package br.com.EnventoNoSitio.eventoservice.repository;

import br.com.EnventoNoSitio.eventoservice.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long>{
    
}
