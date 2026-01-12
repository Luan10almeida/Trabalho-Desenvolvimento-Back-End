package br.com.sghss.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import br.com.sghss.model.Paciente;
import br.com.sghss.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @PostMapping
    public Paciente cadastrar(@RequestBody Paciente paciente) {
        return service.salvar(paciente);
    }

    @GetMapping
    public List<Paciente> listar() {
        return service.listar();
    }
}

