package com.codewithmosh.adapter;

import com.codewithmosh.adapter.avaFilters.Caramel;

public class AdapterDemo {

    public void execute() {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());

        /**
         *  We can't directly use Caramel here as it is third party filter and
         *  it doesn't use Filter interface, hence the compilation error is showing up below
         */
//        imageView.apply(new Caramel());

        /**
         *  CaramelFilter is as an adapter class and Caramel is adaptee class here,
         *  we are using composition in this case, which is favoured over inheritance
         */

        imageView.apply(new CaramelFilter(new Caramel()));

        /**
         *  This is when we use inheritance instead of composition,
         *  this is not favoured generally
         */
        imageView.apply(new CaramelAdapter());
    }
}
