/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;
import com.sun.istack.Nullable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author zerep08
 */
@Entity
@Table(name = "usuario", catalog = "kittyDB")
public class Usuario {
    @Id @GeneratedValue
    @Column(name = "idusuario")
    private int idUsuario;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apeido")
    private String apeido;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "mail")
    private String mail;

    @Column(name = "uid")
    private String uid;
    
    
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
    


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeido() {
        return apeido;
    }

    public void setApeido(String apeido) {
        this.apeido = apeido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public TipoUsuario getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(TipoUsuario idtipo) {
        this.idtipo = idtipo;
    }
    
    @ManyToOne
    @JoinColumn(name = "idtipo")
    private TipoUsuario idtipo;
    
}
