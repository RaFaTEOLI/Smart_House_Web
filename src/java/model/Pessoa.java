package model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ManagedBean (name="pessoa")
@SessionScoped
@Entity
public class Pessoa implements Serializable {
    @Id
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Integer pessoaid;
    
    private String nome;
    private String sobrenome;
    protected String usuario;
    protected String senha;
    
    public Pessoa() {
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return pessoaid;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.pessoaid = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    /*public String toString() {
        return this.getNome() + " " + this.getSobrenome();
    }*/
    
    public String toString() {
        String idPessoa = String.valueOf(this.pessoaid);
        return idPessoa;
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
            if (this.getId().equals(((Pessoa)obj).getId())) {
                result = true;
            }
        return result;
    }

   
}
