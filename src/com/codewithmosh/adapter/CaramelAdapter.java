package com.codewithmosh.adapter;

import com.codewithmosh.adapter.avaFilters.Caramel;

/**
 * This approach is not as flexible as using composition because multiple inheritance
 * is not allowed in java, let's say if filter is an abstract class,
 * we couldn't have used inheritance in that case
 */
public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
