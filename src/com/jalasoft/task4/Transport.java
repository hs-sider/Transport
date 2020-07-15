package com.jalasoft.task4;

public class Transport {

    private String name;
    public int price;

    public Transport(String name, int price) { // Modificador cambiado a publico para poder acceder desde clases hijas
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() { // NO es realmente necesario, ya que el atributo price es publico
        return price;
    }
}
