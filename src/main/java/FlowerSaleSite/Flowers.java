/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlowerSaleSite;

import java.util.ArrayList;

/**
 *
 * @author Merve
 */
public class Flowers {

    private String name;
    private int price;
    private int number;

    public Flowers(String name, int price, int number) {
        this.name = name;
        this.number = number;
        this.price = price;
    }

    static ArrayList<Flowers> flowers = new ArrayList<>();

    
    

    int totalNumberOfFlowers() {
        int totalNumberOfFlowers = 0;
        for (Flowers flower : flowers) {
            totalNumberOfFlowers += flower.getNumber();

        }
        return totalNumberOfFlowers;
    }

    void displayFlowers() {
        int i = 1;
        System.out.println("FLOWER LİST");
        for (Flowers flower : Flowers.flowers) {
            System.out.println(i + ")" + flower.getName());
            i++;
        }

    }

    // BELİRLİ BİR ÇİÇEK TÜRÜNDEKİ ÇİÇEK SAYISI ARTTIRMA  
    void increaseAmountOfFlower(String flowName, int increaseAmount) {
        int lastAmount = 0;
        for (Flowers flower : Flowers.flowers) {
            if (flowName.equals(flower.getName())) {
                flower.setNumber(flower.getNumber() + increaseAmount);
                lastAmount = flower.getNumber();
                System.out.println("The current amount of " + flower.getName() + " is " + flower.getNumber());
                break;
            }
        }

    }

    // BELİRLİ BİR ÇİÇEK TÜRÜNDEKİ ÇİÇEK SAYISINI BELİRLİ BİR MİKTARDA AZALTMA  
    void decreaseAmountOfFlower(String flowName, int decreaseAmount) {
        int lastAmount = 0;
        for (Flowers flower : Flowers.flowers) {
            if (flowName.equals(flower.getName())) {
                flower.setNumber(flower.getNumber() - decreaseAmount);
                lastAmount = flower.getNumber();
                System.out.println("The current amount of " + flower.getName() + " is " + flower.getNumber());
                break;
            }
        }

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

}
