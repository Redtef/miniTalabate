/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author delll
 */

@Entity
public class LigneSupplement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Supplement supplement;
    @ManyToOne
    private LignePanier lignePanier;



    public LigneSupplement() {
    }

    public LigneSupplement(Long id) {
        this.id = id;
    }

    public Supplement getSupplement() {
        return supplement;
    }

    public void setSupplement(Supplement supplement) {
        this.supplement = supplement;
    }

    public LignePanier getLignePanier() {
        return lignePanier;
    }

    public void setLignePanier(LignePanier lignePanier) {
        this.lignePanier = lignePanier;
    }

    public LigneSupplement(Supplement supplement, LignePanier lignePanier) {
        this.supplement = supplement;
        this.lignePanier = lignePanier;
    }

    @Override
    public String toString() {
        return "LigneSupplement{" + "id=" + id + ", supplement=" + supplement + ", lignePanier=" + lignePanier + '}';
    }



    public Supplement getSupplements() {
        return supplement;
    }

    public void setSupplements(Supplement supplements) {
        this.supplement = supplements;
    }

   
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneSupplement)) {
            return false;
        }
        LigneSupplement other = (LigneSupplement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

     
}
