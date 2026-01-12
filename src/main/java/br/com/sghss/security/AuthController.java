package br.com.sghss.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import br.com.sghss.model.Usuario;

@RestController
public class AuthController {

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Usuario usuario) {

        Map<String, String> resposta = new HashMap<>();
        resposta.put("token", "token-simulado-jwt");

        return resposta;
    }
}

