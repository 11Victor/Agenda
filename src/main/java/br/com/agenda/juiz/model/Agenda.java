package br.com.agenda.juiz.model;

import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_agenda")
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private String participantes;
	
	private String descricao;
	
	private String local;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date data;
	
	@JsonFormat(pattern = "HH:mm:ss")
	private LocalTime hora;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getParticipantes() {
		return participantes;
	}

	public void setParticipantes(String participantes) {
		this.participantes = participantes;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	

	

	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
