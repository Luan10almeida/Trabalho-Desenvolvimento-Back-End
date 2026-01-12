package br.com.sghss.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sghss.model.Consulta;
import br.com.sghss.model.Paciente;
import br.com.sghss.repository.ConsultaRepository;
import br.com.sghss.repository.PacienteRepository;

@Service
public class ConsultaService {

    private final ConsultaRepository consultaRepository;
    private final PacienteRepository pacienteRepository;

    public ConsultaService(ConsultaRepository consultaRepository,
                           PacienteRepository pacienteRepository) {
        this.consultaRepository = consultaRepository;
        this.pacienteRepository = pacienteRepository;
    }

    public Consulta agendar(Consulta consulta) {

        Long pacienteId = consulta.getPaciente().getId();

        Paciente paciente = pacienteRepository
                .findById(pacienteId)
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));

        consulta.setPaciente(paciente);
        consulta.setStatus("AGENDADA");

        return consultaRepository.save(consulta);
    }

    public List<Consulta> listar() {
        return consultaRepository.findAll();
    }

    public Consulta cancelar(Long id) {
        Consulta consulta = consultaRepository.findById(id).orElseThrow();
        consulta.setStatus("CANCELADA");
        return consultaRepository.save(consulta);
    }
}
