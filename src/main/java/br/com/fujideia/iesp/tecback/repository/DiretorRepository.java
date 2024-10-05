package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Diretor;
import br.com.fujideia.iesp.tecback.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiretorRepository extends JpaRepository<Diretor, Long> {

    @Query("SELECT d FROM Diretor d WHERE d.nome LIKE %:nome%")
    List<Diretor> buscarPorNome(@Param("nome") String nome);

    @Query("SELECT d FROM Diretor d JOIN d.filmesDirigidos f WHERE f IN :filmesDirigidos")
    List<Diretor> buscarPorFilme(@Param("filmesDirigidos") List<Filme> filmesDirigidos);

}