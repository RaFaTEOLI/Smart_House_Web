package model;

import java.io.Serializable;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@ManagedBean (name="aparelho")
@SessionScoped
@Entity
public class Aparelho implements Serializable {
   
    @Id
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Integer aparelhoId;
    
    @ManyToOne
    @JoinColumn(name="comodoId")
    private Comodo comodoId;
    
    private String nome;
    private String descricao;
    private boolean status;
    
    public Aparelho() {
    }
    
    /**
     * @return the aparelhoId
     */
    public Integer getAparelhoId() {
        return aparelhoId;
    }

    /**
     * @param aparelhoId the aparelhoId to set
     */
    public void setAparelhoId(Integer aparelhoId) {
        this.aparelhoId = aparelhoId;
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the comodoId
     */
    public Comodo getComodoId() {
        return comodoId;
    }

    /**
     * @param comodoId the comodoId to set
    */
    public void setComodoId(Comodo comodoId) {
        this.comodoId = comodoId;
    }
    
    public String getStatus() {
        String sStatus = "";
        if (status == true) {
            sStatus = "Ligado";
        } else {
            sStatus = "Desligado";
        }
        return sStatus;
    }

    public void setStatus(String sStatus) {
        if ("Ligado".equals(sStatus)) {
            status = true;
        } else if ("Desligado".equals(sStatus)) {
            status = false;
        }
        this.status = status;
    }
    
    @Override
    public String toString() {
        return this.getAparelhoId() + " - " + this.getNome();
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (this.getAparelhoId().equals(((Aparelho)obj).getAparelhoId())) {
            result = true;
        }
        return result;
    }
}
