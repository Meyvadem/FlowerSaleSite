/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlowerSaleSite;

import java.security.CodeSigner;

/**
 *
 * @author Merve
 */
public class Test {

    public static void main(String[] args) {
        
        //Flowers objects
        Flowers flower1 = new Flowers("Red Rose", 200, 18);
        Flowers flower2 = new Flowers("Blue Rose", 250, 12);
        Flowers flower3 = new Flowers("White Rose", 180, 16);
        Flowers flower4 = new Flowers("White Orchid", 350, 14);
        Flowers flower5 = new Flowers("Purple Orchid", 335, 13);
        Flowers flower6 = new Flowers("Rose Bouquet", 450, 15);
        Flowers flower7 = new Flowers("Bride's Bouquet", 500, 22);
        Flowers flower8 = new Flowers("Daisy Bouquet", 400, 17);
        Flowers flower9 = new Flowers("Cactus", 150, 25);
        Flowers flower10 = new Flowers("Money Flower (Pilea)", 180, 15);
        Flowers flower11 = new Flowers("Peace Flower (Spathiphyllum)", 240, 14);

        
        //Costumer objects
        Costumer cost1 = new Costumer("Kübra", "Demir", "523", "mepveli", "kbrdmr7@gmail.com", "8263 7392 0034 0266", "828", "10/24", "Üsküdar");
        Costumer cost2 = new Costumer("Samet", "Kaya", "377", "skaya", "skaya@gmail.com", "8263 7392 7890 0266", "768", "12/24", "Zeytinburnu");
        Costumer cost3 = new Costumer("Ali", "Nizam", "655", "aliniz", "alinz@gmail.com", "8263 7392 2635 0266", "747", "8/24", "Fatih");

        //Admin objects
        Admin admin1 = new Admin("Feride", "Demir", "123456", "Maho", "feride.dem@gmail.com");
        Admin admin2 = new Admin("Abdullah", "Demir", "123458", "Apo", "alpemo.dem@gmail.com");
        Admin admin3 = new Admin("Yavuz", "Demir", "123459", "ters", "yvz.dem@gmail.com");

        admin1.addAdmin(admin2);
        admin1.addAdmin(admin3);
        admin1.removeAdmin(admin3);

        admin1.addCostumer(cost1);
        admin1.addCostumer(cost2);
        admin1.addCostumer(cost3);
        admin1.removeCostumer(cost1);
        
        admin1.addFlower(flower1);
        admin1.addFlower(flower2);
        admin1.addFlower(flower3);
        admin1.addFlower(flower4);
        admin1.addFlower(flower5);
        admin1.addFlower(flower6);
        admin1.addFlower(flower7);
        admin1.addFlower(flower8);
        admin1.addFlower(flower9);
        admin1.addFlower(flower10);
        admin1.addFlower(flower11);
        admin1.removeFlower(flower11);
        
        Category c = new Category("Roses", 0);   // Category objects
        admin1.addCategory(c);

        c.addFlowerType(flower1);
        c.addFlowerType(flower2);
        c.addFlowerType(flower3);

        Category b = new Category("Orchids", 0);   // Category objects
        admin1.addCategory(b);

        b.addFlowerType(flower4);
        b.addFlowerType(flower5);

        Category d = new Category("Bouquets", 0);   // Category objects
        admin1.addCategory(d);

        d.addFlowerType(flower6);
        d.addFlowerType(flower7);
        d.addFlowerType(flower8);
        d.removeFlowerType(flower8);

        Category f = new Category("Potted Flowers", 0);  // Category objects
        admin1.addCategory(f);
        
        f.addFlowerType(flower9);
        f.addFlowerType(flower10);
        f.addFlowerType(flower11);
        
        admin1.removeCategory(f);
        flower1.displayFlowers();
        f.displayFlowersList();
        
        System.out.println(c.totalNumberOfFlowers());

        c.displayFlowersList();
        b.displayFlowersList();
        b.calculateFlowerPrice("Red Rose", 10);
        
        cost1.showFunctions();
        admin1.showFunctions();
        
        admin1.enterTheSite();
        admin1.showCostumer();

        cost1.createAnOrder();
        cost1.createAnOrder();
        cost1.showOrdersHistory(cost1);
        cost1.showOrdersHistory(cost2);
        cost1.showOrdersHistory(cost3);
               
               
    }
}
