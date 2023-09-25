package com.codewithmosh.factorymethod.sharp;

import com.codewithmosh.factorymethod.matcha.Controller;
import com.codewithmosh.factorymethod.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
