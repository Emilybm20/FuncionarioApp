package tech.learn.appfuncionario.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Funcionario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nome;
    private String email;
    private String postoTrabalho;
    private String telefone;
    private String imagemUrl;
    @Column(nullable = false, updatable = false)
    private String codigoFuncionario;

    public Funcionario(){}
    public Funcionario(String nome, String email, String postoTrabalho, String telefone, String imagemUrl, String codigoFuncionario) {
        this.nome = nome;
        this.email = email;
        this.postoTrabalho = postoTrabalho;
        this.telefone = telefone;
        this.imagemUrl = imagemUrl;
        this.codigoFuncionario = codigoFuncionario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostoTrabalho() {
        return postoTrabalho;
    }

    public void setPostoTrabalho(String postoTrabalho) {
        this.postoTrabalho = postoTrabalho;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", postoTrabalho='" + postoTrabalho + '\'' +
                ", telefone='" + telefone + '\'' +
                ", imagemUrl='" + imagemUrl + '\'' +
                ", codigoFuncionario='" + codigoFuncionario + '\'' +
                '}';
    }
}
