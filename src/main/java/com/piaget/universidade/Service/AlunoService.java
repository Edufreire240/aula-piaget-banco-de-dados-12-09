package com.piaget.universidade.Service;

import com.piaget.universidade.Interface.AlunoRepository;
import com.piaget.universidade.Models.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;
    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<Aluno> alunoList(){
        return repository.findAll();
    }

    public Aluno cadastrarNovoAluno(Aluno aluno){
        return repository.save(aluno);
    }

    public void excluirAluno(Long id){
        repository.deleteById(id);
    }

    public Aluno bucarAlunoId(Long id){
        return repository.findById(id).orElse(null);
    }
}
