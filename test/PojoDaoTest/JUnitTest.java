/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PojoDaoTest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.ProductoDAO;
import dao.RazaDAO;
import dao.TipoUsuarioDAO;
import dao.UsuarioDAO;
import dao.VentaDAO;
import java.util.List;
import org.json.JSONArray;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Producto;

/**
 *
 * @author zerep08
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         ProductoDAO producto = new ProductoDAO();
         Gson g = new GsonBuilder().disableHtmlEscaping()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
         List<Producto> list=producto.getAll();
         //System.out.println(g.toJson(producto.getAll()));
         
         JSONArray j=new JSONArray(list);
         System.out.println(j.toString());
         
         
         
         
         
         
     }
}
