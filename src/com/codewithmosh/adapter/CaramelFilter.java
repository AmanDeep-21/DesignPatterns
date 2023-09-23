package com.codewithmosh.adapter;

import com.codewithmosh.adapter.avaFilters.Caramel;

public class CaramelFilter implements Filter {

    // We are using composition here, composition should be favoured over inheritance generally
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
