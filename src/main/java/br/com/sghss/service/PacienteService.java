package br.com.sghss.service;

import java.util.List;
import org.springframework.stereotype.Service;
import br.com.sghss.model.Paciente;
import br.com.sghss.repository.PacienteRepository;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }

    public List<Paciente> listar() {
        return repository.findAll();
    }
}

