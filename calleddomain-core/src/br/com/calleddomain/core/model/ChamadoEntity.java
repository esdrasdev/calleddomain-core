/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calleddomain.core.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * Classe responsável por mapear a entidade "tb_chamado" do banco.
 *
 * @author Esdras França - <esdrasdev@gmail.com>
 * @since 30/04/2014 12:22:16
 */

@Entity
@Table(name = "tb_chamado")
public class ChamadoEntity extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cham_id")
    private Integer id;
    @Column(name = "cham_descricao")
    private String descricao;
    @Column(name = "cham_status")
    private String status;
    @Column(name = "cham_dataabertura")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataAbertura;
    @Column(name = "cham_datafechamento")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataFechamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    @Override
    public String toString() {
        return "Chamado{" + "id=" + id + ", descricao=" + descricao + ", status=" + status + ", dataAbertura=" + dataAbertura + ", dataFechamento=" + dataFechamento + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChamadoEntity other = (ChamadoEntity) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
