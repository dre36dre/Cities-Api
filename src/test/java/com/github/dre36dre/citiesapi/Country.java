package com.github.dre36dre.citiesapi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="pais")
public class Country {
	@Id
	private Long id;
	
	@Column(name= "nome_pt")
	private String portugueseName;
	
	@Column(name= "sigla")
	private String code;
	
	private Integer bacen;
	
	public Country(){
		
	}
	
}
