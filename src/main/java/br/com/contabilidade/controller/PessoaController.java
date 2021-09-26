package br.com.contabilidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.contabilidade.model.Pessoa;
import br.com.contabilidade.repository.PessoaRepository;

@CrossOrigin(origins = "*")
@RequestMapping(value="/api")
@RestController
public class PessoaController {
	@Autowired
	PessoaRepository pessoaRepository;
	
	@GetMapping("/pessoa")
	public List<Pessoa> ListaPessoa(){
		return pessoaRepository.findAll();
	}
	
	@GetMapping("/pessoa/{id}")
	public Pessoa ListaPessoaUnico(@PathVariable(value = "id") long id){
		return pessoaRepository.findById(id);
	}
	
	@PostMapping("/pessoa")
	public Pessoa salvaPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@DeleteMapping("/pessoa")
	public void deleteProduto(@RequestBody Pessoa pessoa) {
		pessoaRepository.delete(pessoa);
	}
	
	@PutMapping("/pessoa")
	public Pessoa atualizaPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
}
