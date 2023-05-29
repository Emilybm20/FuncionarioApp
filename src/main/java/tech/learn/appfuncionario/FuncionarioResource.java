package tech.learn.appfuncionario;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.learn.appfuncionario.model.Funcionario;
import tech.learn.appfuncionario.service.FuncionarioService;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioResource {
    private final FuncionarioService funcionarioService;

    public FuncionarioResource(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Funcionario>> getAllFuncionarios (){
            List<Funcionario> funcionarios = funcionarioService.findAllFuncionarios();
            return new ResponseEntity<>(funcionarios, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Funcionario> getFuncionariosById (@PathVariable("id") Long id){
        Funcionario funcionario = funcionarioService.findFuncionarioById(id);
        return new ResponseEntity<>(funcionario, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Funcionario> addFuncionario(@RequestBody Funcionario funcionario){
        Funcionario newFuncionario = funcionarioService.adicionarFuncionario(funcionario);
        return new ResponseEntity<>(newFuncionario, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Funcionario> updateFuncionario(@RequestBody Funcionario funcionario){
        Funcionario updatefuncionario  =  funcionarioService.updateFuncionario(funcionario);
        return new ResponseEntity<>(updatefuncionario, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Funcionario> deleteFuncionario(@PathVariable("id")Long id) {
        funcionarioService.deleteFuncionario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
