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
public class Category {

    String nameCategory;
    public int numberOfFlowersTypes;
    ArrayList<Flowers> flowersType = new ArrayList<>();

    public Category(String nameCategory, int numberOfFlowersTypes) {
        this.nameCategory = nameCategory;
        this.numberOfFlowersTypes = numberOfFlowersTypes;
    }

    //KATEGORİLERİN ÇİÇEK LİSTESİNE ÇİÇEK EKLEME
    void addFlowerType(Flowers flower) {
        flowersType.add(flower);

    }

    //KATEGORİLERİN ÇİÇEK LİSTESİNDEN ÇİÇEK ÇIKARMA
    void removeFlowerType(Flowers flower1) {
        flowersType.remove(flower1);

    }

    // TOPLAM ÇİÇEK SAYISI
    int totalNumberOfFlowers() {
        int totalNumberOfFlowers = 0;
        for (Flowers flower : Flowers.flowers) {
            totalNumberOfFlowers += flower.getNumber();

        }
        return totalNumberOfFlowers;
    }

    // KATEGORİLERİN SAHİP OLDUĞU ÇİÇEKLERİ GÖSTERME
    void displayFlowersList() {

        for (Flowers flower : flowersType) {
            System.out.println(nameCategory + " --> " + flower.getName());
        }

    }

    //BELİRLİ BİR ÇİÇEK TÜRÜNÜN BELİRLİ SAYIDAKİ FİYATINI HESAPLAMA
    int calculateFlowerPrice(String nameFlower, int takenAmountFlower) {
        int totalPrice = 0;
        for (Flowers flower : Flowers.flowers) {
            if (flower.getName().equals(nameFlower)) {
                totalPrice = takenAmountFlower * flower.getPrice();
            }
        }
        return totalPrice;
    }

}
