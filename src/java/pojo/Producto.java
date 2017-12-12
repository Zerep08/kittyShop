/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.google.gson.annotations.Expose;


/**
 *
 * @author zerep08
 */
@Entity
@Table(name = "producto", catalog = "kittyDB")
public class Producto {
    @Expose
    @Id@GeneratedValue
    @Column(name = "idproducto")
    private int id;
    
    @Expose
    @Column(name = "precio")
    private float precio;
    
    @Expose
    @ManyToOne
    @JoinColumn(name = "raza")
    private Raza raza;
    
    @Expose
    @Column(name = "edad")
    private int edad;
    
    @Expose
    @Column(name = "genero")
    private String genero;
    
    @Expose
    @Column(name = "descripcion")
    private String descripcion;
    
    @Expose
    @Column(name = "foto")
    private String foto;
    
    @Expose
    @Column(name = "status")
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
