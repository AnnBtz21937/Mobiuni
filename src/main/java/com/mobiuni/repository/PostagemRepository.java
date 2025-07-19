package com.mobiuni.repository;

import com.mobiuni.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

    List<Postagem> findByTipoDeficiencia_Id(Long tipoId);
    List<Postagem> findByBairroContainingIgnoreCase(String bairro);
    List<Postagem> findByTipoDeficiencia_IdAndBairroContainingIgnoreCase(Long tipoId, String bairro);
}

