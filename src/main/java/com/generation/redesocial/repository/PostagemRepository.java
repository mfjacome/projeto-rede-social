package com.generation.redesocial.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.redesocial.model.Postagem;

import java.util.List;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

    public List<Postagem>findAllByCaixatextoContainingIgnoreCase(@Param("caixatexto") String texto);



}