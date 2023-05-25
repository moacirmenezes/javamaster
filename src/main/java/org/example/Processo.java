package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
public class Processo {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Size
	(min=1,message = "O nome precisa ser válido.")
	private String nome;
    private int numeroProcesso;
    }