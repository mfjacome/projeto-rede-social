package com.generation.redesocial.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.generation.redesocial.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	
	
}
