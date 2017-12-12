/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import dao.ProductoDAO;
import static java.util.Collections.list;
import java.util.List;
import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pojo.Producto;

/**
 *
 * @author zerep08
 */
@RestController
@RequestMapping("/catalogo")
public class catalogoController {

    @RequestMapping(value = "mostrar", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    String muestra() {
        ProductoDAO producto = new ProductoDAO();
        List<Producto> list = producto.getAll();

        JSONArray j = new JSONArray(list);
        return j.toString();
    }
}
