package com.ite.itea.ecommerce.domain.retail;

public final class Picture extends Product {

    private final EuroPrice price;

    public Picture(ProductId id, String name, EuroPrice price) {
        super(id, name);
        this.price = price;
    }

    @Override
    public EuroPrice price() {
        return price;
    }
}
