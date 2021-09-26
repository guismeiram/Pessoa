package br.com.contabilidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.contabilidade.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	Pessoa findById(long id);
}
