package com.lucas.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.cursomc.domain.Pagamento;

//esse obj vai ser capaz realizar operacoes de acessos a dados (busca,salvar,alterar, deletar.....)
//no precisa criar da sub classes, super class abrange todas 

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
