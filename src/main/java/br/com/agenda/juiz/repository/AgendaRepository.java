package br.com.agenda.juiz.repository;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agenda.juiz.model.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {
	
	public List<Agenda> findAllByNomeContainingIgnoreCase(String nome);
	
	public List<Agenda> findByDataBetween(Date startDate, Date endDate);
	
	public List<Agenda> findByDataAfter(Date data);
	
	public List<Agenda> findByDataBefore(Date data);
	
}
