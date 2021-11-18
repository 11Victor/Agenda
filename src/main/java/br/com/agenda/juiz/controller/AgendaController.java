package br.com.agenda.juiz.controller;


import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.juiz.model.Agenda;
import br.com.agenda.juiz.repository.AgendaRepository;

@RestController
@RequestMapping("/agenda")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AgendaController {

	@Autowired
	private AgendaRepository agendaRepository;

	// Consultar todos compromissos
	@GetMapping
	public ResponseEntity<List<Agenda>> getAll() {
		return ResponseEntity.ok(agendaRepository.findAll());
	}

	// Consultar compromissos por ID
	@GetMapping("/{id}")
	public ResponseEntity<Agenda> getById(@PathVariable long id) {
		return agendaRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	// Consultar compromissos por Nome
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Agenda>> getByNome(@PathVariable String nome) {
		return ResponseEntity.ok(agendaRepository.findAllByNomeContainingIgnoreCase(nome));
	}

	// Consultar compromissos pela data
	@GetMapping("/data")
	public ResponseEntity<List<Agenda>> getEntreDatas (@RequestParam Date startDate, @RequestParam Date endDate) {
		return new ResponseEntity<List<Agenda>>(agendaRepository.findByDataBetween(startDate, endDate), HttpStatus.OK);
	}
	
	// Consultar futuros compromissos pela data
	@GetMapping("/futuro/{data}")
	public ResponseEntity<List<Agenda>> getByDataFutura(@PathVariable Date data) {
		return ResponseEntity.ok(agendaRepository.findByDataAfter(data));
	}
	
	// Consultar antigos compromissos pela data
		@GetMapping("/passado/{data}")
		public ResponseEntity<List<Agenda>> getByDataPassado(@PathVariable Date data) {
			return ResponseEntity.ok(agendaRepository.findByDataBefore(data));
		}
	
	// Cadastrar compromisso
	@PostMapping
	public ResponseEntity<Agenda> postCompromisso(@RequestBody Agenda agenda) {
		return ResponseEntity.status(HttpStatus.CREATED).body(agendaRepository.save(agenda));
	}

	// Editar compromisso
	@PutMapping
	public ResponseEntity<Agenda> putCompromisso(@RequestBody Agenda agenda) {
		return ResponseEntity.status(HttpStatus.OK).body(agendaRepository.save(agenda));
	}

	// Deletar compromisso
	@DeleteMapping("/{id}")
	public void deleteCompromisso(@PathVariable long id) {
		agendaRepository.deleteById(id);
	}

}
