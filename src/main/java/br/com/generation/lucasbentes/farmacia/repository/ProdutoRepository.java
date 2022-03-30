package br.com.generation.lucasbentes.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.generation.lucasbentes.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	public List<Produto> findAllByValorContainingIgnoreCase(String valor);
	
}
