package br.com.sghss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.sghss.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
