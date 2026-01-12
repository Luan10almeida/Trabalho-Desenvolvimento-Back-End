package br.com.sghss.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import br.com.sghss.model.Consulta;
import br.com.sghss.service.ConsultaService;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    private final ConsultaService service;

    public ConsultaController(ConsultaService service) {
        this.service = service;
    }

    @PostMapping
    public Consulta agendar(@RequestBody Consulta consulta) {
        return service.agendar(consulta);
    }

    @GetMapping
    public List<Consulta> listar() {
        return service.listar();
    }

    @PutMapping("/{id}/cancelar")
    public Consulta cancelar(@PathVariable Long id) {
        return service.cancelar(id);
    }
}
