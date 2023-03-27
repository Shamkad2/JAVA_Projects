package Lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Notebook {
    private String name;
    private int amountRAM;
    private String operatingSystem;
    private int price;
    private String model;
    private Double diagonal;


    Notebook(String name, int amountRAM, String operatingSystem, int price, String model, double diagonal) {
        this.name = name;
        this.amountRAM = amountRAM;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.model = model;
        this.diagonal = diagonal;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество опeретивной памяти: " + amountRAM +
                ", операционная система: " + operatingSystem + '\'' +
                ", цена: " + price +
                ", модель: " + model +
                ", диагональ: " + diagonal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Double diagonal) {
        this.diagonal = diagonal;
    }
    
}
