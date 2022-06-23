package br.com.EnventoNoSitio.toDoservice.model;


import javax.persistence.Column;

import lombok.Data;


@Data
public class ToDo {

    @Column(nullable = false, length = 50)
    private String tarefa;
    
    @Column(nullable = false, unique = true, length = 200)
    private String descricao;
    
    @Column(nullable = false, length = 15)
    private Long idAdm;  
}
