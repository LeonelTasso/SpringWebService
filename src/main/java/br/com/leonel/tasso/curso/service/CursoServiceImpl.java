package br.com.leonel.tasso.curso.service;

import br.com.leonel.tasso.curso.dao.CursoDao;
import br.com.leonel.tasso.curso.domain.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoDao dao;

    @Override
    public void save(Curso curso) {
        dao.save(curso);
    }

    @Override
    public void update(Long id, Curso curso) {
        curso.setId(id);
        dao.update(curso);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Curso findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Curso> findAll() {
        return dao.findAll();
    }

    @Override
    public Curso updateDataInicio(Long id, Date dataInicio) {
        Curso curso = dao.findById(id);
        curso.setDataInicio(dataInicio);
        return curso;
    }
}
