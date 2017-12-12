/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hbm.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.TipoUsuario;
import pojo.Usuario;

/**
 *
 * @author zerep08
 */
public class UsuarioDAO {
    Session session;

    public UsuarioDAO(Session session) {
        this.session = session;
    }

    public UsuarioDAO() {
        session = HibernateUtil.getLocalSession();
    }
    
    public void saveUsuario(String nombre, String apeido, String telefono, String mail,String uid, int idtipoUsuario){
        Usuario usuario = new Usuario();
        TipoUsuario tipoUsuario = (TipoUsuario)session.load(TipoUsuario.class, idtipoUsuario);
        usuario.setNombre(nombre);
        usuario.setApeido(apeido);
        usuario.setMail(mail);
        usuario.setTelefono(telefono);
        usuario.setIdtipo(tipoUsuario);
        usuario.setUid(uid);
        
         try{
            Transaction transaccion=session.beginTransaction();
            session.save(usuario); //Guardamos una nueva entrada en la tabla.
            transaccion.commit();
        }catch(Exception e){
            e.getMessage();
        }
        
        
    }
    
    
    
}
