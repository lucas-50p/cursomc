package com.lucas.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.cursomc.domain.Endereco;

//esse obj vai ser capaz realizar operacoes de acessos a dados (busca,salvar,alterar, deletar.....)
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}
