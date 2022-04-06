package org.humanBooster.model;

public class House extends SpacialElement {
    public int price;
    public Ematerial ematerial;

    public House(String name, int x, int y, int price, Ematerial ematerial) {
        super(name, x, y);
        this.price = price;
        this.ematerial = ematerial;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Ematerial getEmaterial() {
        return ematerial;
    }

    public void setEmaterial(Ematerial ematerial) {
        this.ematerial = ematerial;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", ematerial=" + ematerial +
                '}';
    }
}
