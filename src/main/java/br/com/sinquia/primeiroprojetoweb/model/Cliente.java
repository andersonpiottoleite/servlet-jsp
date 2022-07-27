package br.com.sinquia.primeiroprojetoweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(of={"nome", "cpf"})
public class Cliente {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private Integer idade;

    public Cliente(String nome, String cpf, String email, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }

    public Cliente(){

    }

    public static void main(String[] args) {
        System.out.println(new Cliente("Anderson", "35461848826", "piottok10@gmail.com", 37));
    }
}