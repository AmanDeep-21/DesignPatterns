package com.codewithmosh.factorymethod;

/**
 * Defer the creation of an object to subclasses
 * through inheritance and polymorphism
 */
public class FactoryMethodDemo {

    public void execute() {
        new ProductsController().listProducts();
    }
}
