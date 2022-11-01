package com.carteira.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.carteira.model.entity.Lancamento;
import com.carteira.model.enums.TipoLancamento;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

			 @Query(value = "SELECT SUM(l.valor) from Lancamento l JOIN l.usuario u WHERE"
			 		+ " u.id = :idUsuario AND l.tipo = :tipo GROUP BY u")
	/* 1º */ BigDecimal obterSaldoPorTipoLancamentoUsuario(@Param("idUsuario") Long idUsuario,
			@Param("tipo") TipoLancamento tipo);

}

// declare 1º a variável, em seguida a notação "@Query" com o comando SQL na linha acima da variável.