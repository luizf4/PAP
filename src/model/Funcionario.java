
package model;

public class Funcionario {
    
    private Long id_Registro_Emp;
    private String nome;
    private String cpf;

    public Long getId_Registro_Emp() {
        return id_Registro_Emp;
    }

    public void setId_Registro_Emp(Long id_Registro_Emp) {
        this.id_Registro_Emp = id_Registro_Emp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
