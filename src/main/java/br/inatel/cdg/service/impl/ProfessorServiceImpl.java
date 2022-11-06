package br.inatel.cdg.service.impl;

import br.inatel.cdg.entity.Professor;
import br.inatel.cdg.service.ProfessorService;

import java.util.List;

public class ProfessorServiceImpl implements ProfessorService {

    @Override
    public Professor cadastraProfessor(Professor professor) {
        Professor professorCadastrado = new Professor();
        professorCadastrado.setId(professor.getId());
        professorCadastrado.setNome(professor.getNome());
        professorCadastrado.setHorario(professor.getHorario());
        professorCadastrado.setPeriodo(professor.getPeriodo());
        return professorCadastrado;
    }

    @Override
    public Professor buscaProfessorId(Long id, List<Professor> professores) {
        var professor = professores.stream().filter(prof -> prof.getId().equals(id)).findFirst();
        return professor.orElse(null);
    }

    @Override
    public Professor buscaProfessorNome(String nome, List<Professor> professores) {
        var professor = professores.stream().filter(prof -> prof.getNome().equals(nome)).findFirst();
        return professor.orElse(null);
    }
}
