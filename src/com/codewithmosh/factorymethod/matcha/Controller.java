package com.codewithmosh.factorymethod.matcha;

import java.util.Map;

public class Controller {

    public void render(String viewName, Map<String, Object> context) {
//        var engine = new MatchaViewEngine();
        var engine = createViewEngine();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }

    /**
     * If we want to force subclasses to override the method in that case
     * we'll use below abstract method and convert this class into an abstract class
     * @return ViewEngine
     */
//    protected abstract ViewEngine createViewEngine();

    protected ViewEngine createViewEngine() {
        return new MatchaViewEngine();          // default View Engine
    }
}