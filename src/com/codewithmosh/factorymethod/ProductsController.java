package com.codewithmosh.factorymethod;

import com.codewithmosh.factorymethod.matcha.Controller;
import com.codewithmosh.factorymethod.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

/**
 * Depending upon which class we extend, the createViewEngine method of
 * that class will be picked at runtime due to polymorphism.
 * Try changing SharpController with Controller class,
 * and it'll print "View rendered by Matcha" which is Default Engine in this case
 */
public class ProductsController extends Controller {

    public void listProducts() {
        // Get products from a database
        Map<String, Object> context = new HashMap<>();
        // context.put(products)
        render("products.html", context);
    }

}
