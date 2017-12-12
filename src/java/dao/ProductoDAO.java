/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hbm.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Producto;
import pojo.Raza;

/**
 *
 * @author zerep08
 */
public class ProductoDAO {
    Session session;
    
    public ProductoDAO() {
    session = HibernateUtil.getLocalSession();
    }

    public ProductoDAO(Session session) {
        this.session = session;
    }
    
    public void saveProducto(float precio, int idraza, int edad, String genero, String descripcion, String foto, boolean status){
        Producto producto = new Producto();
        Raza raza = (Raza)session.load(Raza.class, idraza);
        producto.setPrecio(precio);
        producto.setRaza(raza);
        producto.setEdad(edad);
        producto.setGenero(genero);
        producto.setDescripcion(descripcion);
        producto.setDescripcion(descripcion);
        producto.setFoto(foto);
        producto.setStatus(status);
        try{
            Transaction transaccion=session.beginTransaction();
            session.save(producto); //Guardamos una nueva entrada en la tabla.
            transaccion.commit();
        }catch(Exception e){
            e.getMessage();
        }
        
    }
    
    public List<Producto> getAll(){
        return (List<Producto>) session.createCriteria(Producto.class).list();
    }
    
    
}
