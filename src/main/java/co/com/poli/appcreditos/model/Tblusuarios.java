/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dmons
 */
@Entity
@Table(name = "TBLUSUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblusuarios.findAll", query = "SELECT t FROM Tblusuarios t")
    , @NamedQuery(name = "Tblusuarios.findByNcredito", query = "SELECT t FROM Tblusuarios t WHERE t.ncredito = :ncredito")
    , @NamedQuery(name = "Tblusuarios.findByDocumento", query = "SELECT t FROM Tblusuarios t WHERE t.documento = :documento")
    , @NamedQuery(name = "Tblusuarios.findByNombres", query = "SELECT t FROM Tblusuarios t WHERE t.nombres = :nombres")
    , @NamedQuery(name = "Tblusuarios.findByApellidos", query = "SELECT t FROM Tblusuarios t WHERE t.apellidos = :apellidos")
    , @NamedQuery(name = "Tblusuarios.findByMonto", query = "SELECT t FROM Tblusuarios t WHERE t.monto = :monto")
    , @NamedQuery(name = "Tblusuarios.findByTipotrabajador", query = "SELECT t FROM Tblusuarios t WHERE t.tipotrabajador = :tipotrabajador")
    , @NamedQuery(name = "Tblusuarios.findByTipocredito", query = "SELECT t FROM Tblusuarios t WHERE t.tipocredito = :tipocredito")
    , @NamedQuery(name = "Tblusuarios.findByTcomp", query = "SELECT t FROM Tblusuarios t WHERE t.tcomp = :tcomp")})
public class Tblusuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NCREDITO")
    private String ncredito;
    @Size(max = 20)
    @Column(name = "DOCUMENTO")
    private String documento;
    @Size(max = 50)
    @Column(name = "NOMBRES")
    private String nombres;
    @Size(max = 50)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Size(max = 10)
    @Column(name = "MONTO")
    private String monto;
    @Size(max = 13)
    @Column(name = "TIPOTRABAJADOR")
    private String tipotrabajador;
    @Size(max = 20)
    @Column(name = "TIPOCREDITO")
    private String tipocredito;
    @Size(max = 2)
    @Column(name = "TCOMP")
    private String tcomp;

    public Tblusuarios() {
    }

    public Tblusuarios(String ncredito) {
        this.ncredito = ncredito;
    }

    public String getNcredito() {
        return ncredito;
    }

    public void setNcredito(String ncredito) {
        this.ncredito = ncredito;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getTipotrabajador() {
        return tipotrabajador;
    }

    public void setTipotrabajador(String tipotrabajador) {
        this.tipotrabajador = tipotrabajador;
    }

    public String getTipocredito() {
        return tipocredito;
    }

    public void setTipocredito(String tipocredito) {
        this.tipocredito = tipocredito;
    }

    public String getTcomp() {
        return tcomp;
    }

    public void setTcomp(String tcomp) {
        this.tcomp = tcomp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ncredito != null ? ncredito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblusuarios)) {
            return false;
        }
        Tblusuarios other = (Tblusuarios) object;
        if ((this.ncredito == null && other.ncredito != null) || (this.ncredito != null && !this.ncredito.equals(other.ncredito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.poli.appcreditos.model.Tblusuarios[ ncredito=" + ncredito + " ]";
    }
    
}
