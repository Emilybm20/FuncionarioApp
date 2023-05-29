package tech.learn.appfuncionario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.learn.appfuncionario.exception.UserNotFoundException;
import tech.learn.appfuncionario.model.Funcionario;
import tech.learn.appfuncionario.repository.FuncionarioRepository;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioService(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    public Funcionario adicionarFuncionario(Funcionario funcionario){
        funcionario.setCodigoFuncionario(UUID.randomUUID().toString());
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> findAllFuncionarios(){
        return funcionarioRepository.findAll();
    }

    public Funcionario updateFuncionario(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario findFuncionarioById(Long id){
        return funcionarioRepository.findFuncionarioById(id)
                .orElseThrow(()-> new UserNotFoundException("Usuário por id" + id + "não encontrado"));
    }

    public void deleteFuncionario(Long id){
        funcionarioRepository.deleteFuncionarioById(id);
    }
}
