/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hbm.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Producto;
import pojo.Usuario;
import pojo.Venta;

/**
 *
 * @author zerep08
 */
public class VentaDAO {
    Session session;

    public VentaDAO() {
        session = HibernateUtil.getLocalSession();
    }

    public VentaDAO(Session session) {
        this.session = session;
    }
    
    public void saveVenta(String fecha, int idUsuario, int idProducto){
        Venta venta = new Venta();
        Usuario user = (Usuario)session.load(Usuario.class, idUsuario);
        Producto producto = (Producto)session.load(Producto.class, idProducto);
        
        venta.setFecha(fecha);
        venta.setProducto(producto);
        venta.setUsuario(user);
        
             try{
            Transaction transaccion=session.beginTransaction();
            session.save(venta); //Guardamos una nueva entrada en la tabla.
            transaccion.commit();
        }catch(Exception e){
            e.getMessage();
        }
        
        
        
        
    }
    
    
}
