package com.lucas.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lucas.cursomc.domain.Cliente;

//esse obj vai ser capaz realizar operacoes de acessos a dados (busca,salvar,alterar, deletar.....)
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	
	@Transactional(readOnly=true)
	Cliente findByEmail(String email);
}
