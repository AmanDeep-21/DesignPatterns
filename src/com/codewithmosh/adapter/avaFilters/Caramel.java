package com.codewithmosh.adapter.avaFilters;

import com.codewithmosh.adapter.Image;

/**
 * Let's say it's a third party filter which we are incorporating for filtering purpose
 */
public class Caramel {

    public void init() {

    }

    public void render(Image image) {
        System.out.println("Applying caramel filter");
    }
}
