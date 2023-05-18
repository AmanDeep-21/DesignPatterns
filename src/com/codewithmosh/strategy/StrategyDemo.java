package com.codewithmosh.strategy;

public class StrategyDemo {

    public void execute() {
        var imageStorage = new ImageStorage(new PngCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a");
        var imageStorage2 = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage2.store("a");
    }
}
