/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author jilssa
 */
public class Car {
    private String carPLate;
    private String model;
    private String brand;
    private int cylinderCapacity;
    private String color;

    public Car(String carPLate, String model, String brand, int cylinderCapacity, String color) {
        this.carPLate = carPLate;
        this.model = model;
        this.brand = brand;
        this.cylinderCapacity = cylinderCapacity;
        this.color = color;
    }

    public String getCarPLate() {
        return carPLate;
    }

    public void setCarPLate(String carPLate) {
        this.carPLate = carPLate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
