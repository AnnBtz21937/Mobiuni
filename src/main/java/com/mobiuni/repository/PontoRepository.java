package com.mobiuni.repository;

import com.mobiuni.model.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PontoRepository extends JpaRepository<Ponto, Long> {
    List<Ponto> findByBairro(String bairro);
}
