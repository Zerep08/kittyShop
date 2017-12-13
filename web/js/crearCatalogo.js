var plantillaMini = 
"<div class=\"col-md-4 agile_ecommerce_tab_left\">" +
    "<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal{id}\">" +
        "<img src=\"{imagen}\" class=\"img-fluid\" alt=\"Responsive image\">" +
    "</a>" +
    "<h5><a href=\"single.html\">{raza}</a></h5>" +
    "<div class=\"simpleCart_shelfItem\">" +
        "<p><i class=\"item_price\">${precio}</i></p>" +
    "</div>" +
"</div>";

var plantillaModal =
"<div class=\"modal video-modal fade\" id=\"myModal{id}\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModal{id}\">" +
    "<div class=\"modal-dialog\" role=\"document\">" +
        "<div class=\"modal-content\">" +
            "<div class=\"modal-header\">" +
                "<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>" +
            "</div>" +
            "<section>" +
                "<div class=\"modal-body\">" +
                    "<div class=\"col-md-5 modal_body_left\">" +
                        "<img src=\"{imagen}\" alt=\" \" class=\"img-responsive\"/>" +
                    "</div>" +
                    "<div class=\"col-md-7 modal_body_right\">" +
                            "<h4>{raza}</h4>" +
                            "<p>{descripcion}</p>" +
                            "<p><i class=\"item_price\">{edad}</i></p>" +
                            "<p><i class=\"item_price\">{genero}</i></p>" +
                            "<p><i class=\"item_price\">{stock}</i></p>" +
                            "<div class=\"modal_body_right_cart simpleCart_shelfItem\">" +
                                "<p><i class=\"item_price\">${precio}</i></p>" +
                                "<p><a class=\"item_add\" href=\"#\">Comprar</a></p>" +
                            "</div>" +
                        "</div>" +
                    "<div class=\"clearfix\"> </div>" +
                "</div>" +
            "</section>" +
        "</div>" +
    "</div>" +
"</div>";


function crearCatalogo() {    
        $.get("catalogo/mostrar.htm",
                function (productos) {
                var arre= JSON.parse(productos);
                    arre.forEach(function (producto) {
                        console.log(producto);
                        var auxMoldeMini = plantillaMini;
                        var auxMoldeModal = plantillaModal;
                        var raza = producto.raza.nombre;
                        var precio = producto.precio;
                        var descripcion = producto.descripcion;
                        var genero = producto.genero;
                        var edad = producto.edad;
                        var status = producto.status; 
                        var id = producto.id;
                        var imagen= producto.foto;
                        auxMoldeMini = auxMoldeMini.replace("{raza}", raza);
                        auxMoldeMini = auxMoldeMini.replace("{precio}", precio);
                        auxMoldeMini = auxMoldeMini.replace("{id}", id );
                        auxMoldeMini = auxMoldeMini.replace("{imagen}", imagen);
                        auxMoldeModal = auxMoldeModal.replace("{raza}", raza);
                        auxMoldeModal = auxMoldeModal.replace("{precio}", precio);
                        auxMoldeModal = auxMoldeModal.replace("{descripcion}", descripcion);
                        auxMoldeModal = auxMoldeModal.replace("{genero}", genero);
                        auxMoldeModal = auxMoldeModal.replace("{edad}", edad);
                        auxMoldeModal = auxMoldeModal.replace("{id}",id );
                        auxMoldeModal = auxMoldeModal.replace("{imagen}", imagen);
                        document.getElementById("aquiVanPeque").innerHTML = document.getElementById("aquiVanPeque").innerHTML + auxMoldeMini;
                        document.getElementById("aquiVanDetalles").innerHTML = document.getElementById("aquiVanDetalles").innerHTML + auxMoldeModal;
                    });
                }
        );
    }