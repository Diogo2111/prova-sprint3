package br.com.compass.avaliacao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.compass.avaliacao.modelo.Estado;
import br.com.compass.avaliacao.modelo.Regiao;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

	List<Estado> findBynome(String nome);

	List<Estado> findByRegiao(Regiao regiao);
	List<Estado> findByarea(int area);
	List<Estado> findBypopulacao(int populacao);

	List<Estado> findBypopulacao(Long populacao);

	List<Estado> findByarea(Long area);

	

}
