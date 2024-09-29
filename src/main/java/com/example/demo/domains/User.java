package com.example.demo.domains;

import java.util.List;
import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

/*
-Como a base de dados será em MongoDB
-Esta classe será definida como um documento, pois o MongoDB é NoSql,
ou seja, é baseada em documentos
*/
@Document(collection = "user")
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String nick;
    private String nome;
    private String email;
    private String password;
    private String bio;
    private List<String> imgUrlPerfil;

    public User(){
    }

    public User(String id, String nick, String nome, String email, String password, String bio,
            List<String> imgUrlPerfil) {
        this.id = id;
        this.nick = nick;
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.bio = bio;
        this.imgUrlPerfil = imgUrlPerfil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<String> getImgUrlPerfil() {
        return imgUrlPerfil;
    }

    public void setImgUrlPerfil(List<String> imgUrlPerfil) {
        this.imgUrlPerfil = imgUrlPerfil;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", nick=" + nick + ", nome=" + nome + ", email=" + email + ", password=" + password
                + ", bio=" + bio + ", imgUrlPerfil=" + imgUrlPerfil + "]";
    }

}
