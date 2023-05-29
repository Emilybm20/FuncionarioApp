package tech.learn.appfuncionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.learn.appfuncionario.model.Funcionario;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    void deleteFuncionarioById(Long id);
    Optional<Funcionario> findFuncionarioById(Long id);
}
