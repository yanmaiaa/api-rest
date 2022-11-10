package com.ydm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity //Aqui é uma entidade que está sendo mapeada para uma tabela no BD
public class Cliente {
	
	@Id //Aqui será a chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Estratégia para geração de valores de um ID
	//A maioria dos BD's tem autoincremento à medida que criamos um novo usuário, logo, seria 1, 2 etc.
	//Assim delegamos ao usar o IDENTITY essa responsabilidade de incrementar o id para o BD
	private Long id;
	
	private String nome;
	
	

}
