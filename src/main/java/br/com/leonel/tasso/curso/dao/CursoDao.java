package br.com.leonel.tasso.curso.dao;

import br.com.leonel.tasso.curso.domain.Curso;

import java.util.List;

public interface CursoDao {

    void save(Curso curso);

    void update(Curso curso);

    void delete(Long id);

    Curso findById(Long id);

    List<Curso> findAll();

}
