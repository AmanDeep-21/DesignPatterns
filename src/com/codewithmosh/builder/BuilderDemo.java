package com.codewithmosh.builder;

public class BuilderDemo {

    public void execute() {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        var builder = new MovieBuilder();
        presentation.export(builder);
        var pdf = builder.getMovie();
    }
}
