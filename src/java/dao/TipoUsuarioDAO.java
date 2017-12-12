/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hbm.HibernateUtil;
import org.hibernate.Session;
import pojo.TipoUsuario;

/**
 *
 * @author zerep08
 */
public class TipoUsuarioDAO {
    Session session;

    public TipoUsuarioDAO(Session session) {
        this.session = session;
    }

    public TipoUsuarioDAO() {
    session = HibernateUtil.getLocalSession();
    }
    
    public void saveTipoUsuario (String nombre){
        TipoUsuario tipoUsuario = new TipoUsuario();
        tipoUsuario.setNombre(nombre);
    
    }
    
}
