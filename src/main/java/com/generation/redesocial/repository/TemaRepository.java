package com.generation.redesocial.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.redesocial.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	
	public List<Tema> findByAssuntoContainingIgnoreCase(@Param ("assunto")String assunto);

}
