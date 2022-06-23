package br.com.EnventoNoSitio.eventoservice.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Data;

@Data
@Entity
public class Evento {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false,length = 40)
    private String nomeEvento;
    
    @Column(nullable = false,name="data_criacao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCriacao;
            
    @Column(nullable = true,length = 40)
    private Long idCliente;
}
