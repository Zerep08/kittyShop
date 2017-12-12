/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hbm.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Raza;

/**
 *
 * @author zerep08
 */
public class RazaDAO {
    Session session;

    public RazaDAO() {
    session = HibernateUtil.getLocalSession();
    }

    public RazaDAO(Session session) {
        this.session = session;
    }
    
    
    public void saveRaza(String nombre){
        Raza raza = new Raza();
        
        raza.setNombre(nombre);
        
        try{
            Transaction transaccion=session.beginTransaction();
            session.save(raza); //Guardamos una nueva entrada en la tabla.
            transaccion.commit();
        }catch(Exception e){
            e.getMessage();
        }
    }
    
}
