/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author oabm77
 */
@Entity
@Table(name = "PACIENTES")
@NamedQueries({
    @NamedQuery(name = "Pacientes.findAll", query = "SELECT p FROM Pacientes p")})
public class Pacientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PACIDENTIFICACION")
    private String pacidentificacion;
    @Basic(optional = false)
    @Column(name = "PACNOMBRES")
    private String pacnombres;
    @Basic(optional = false)
    @Column(name = "PACAPELLIDOS")
    private String pacapellidos;
    @Column(name = "PACFECHANACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pacfechanacimiento;
    @Column(name = "PACSEXO")
    private Character pacsexo;

    public Pacientes() {
    }

    public Pacientes(String pacidentificacion) {
        this.pacidentificacion = pacidentificacion;
    }

    public Pacientes(String pacidentificacion, String pacnombres, String pacapellidos) {
        this.pacidentificacion = pacidentificacion;
        this.pacnombres = pacnombres;
        this.pacapellidos = pacapellidos;
    }

    public String getPacidentificacion() {
        return pacidentificacion;
    }

    public void setPacidentificacion(String pacidentificacion) {
        this.pacidentificacion = pacidentificacion;
    }

    public String getPacnombres() {
        return pacnombres;
    }

    public void setPacnombres(String pacnombres) {
        this.pacnombres = pacnombres;
    }

    public String getPacapellidos() {
        return pacapellidos;
    }

    public void setPacapellidos(String pacapellidos) {
        this.pacapellidos = pacapellidos;
    }

    public Date getPacfechanacimiento() {
        return pacfechanacimiento;
    }

    public void setPacfechanacimiento(Date pacfechanacimiento) {
        this.pacfechanacimiento = pacfechanacimiento;
    }

    public Character getPacsexo() {
        return pacsexo;
    }

    public void setPacsexo(Character pacsexo) {
        this.pacsexo = pacsexo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pacidentificacion != null ? pacidentificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacientes)) {
            return false;
        }
        Pacientes other = (Pacientes) object;
        if ((this.pacidentificacion == null && other.pacidentificacion != null) || (this.pacidentificacion != null && !this.pacidentificacion.equals(other.pacidentificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Pacientes[ pacidentificacion=" + pacidentificacion + " ]";
    }
    
}
