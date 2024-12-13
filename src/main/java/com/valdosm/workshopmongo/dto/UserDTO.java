package com.valdosm.workshopmongo.dto;

import java.io.Serializable;

import com.valdosm.workshopmongo.domain.User;

public class UserDTO implements Serializable {
    
    private String id;
    private String nome;

    public UserDTO(){

    }
    public UserDTO(User obj){
        id = obj.getId();
        nome = obj.getNome();
        
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
