/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlowerSaleSite;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Merve
 */
public class Costumer extends Users {

    private String cardNumber;
    private String cvcNumber;
    private String expMonth_Year;
    String address;

    ArrayList<Order> ordersHistory = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Costumer(String firstName, String lastName, String password, String userName, String gmail, String cardNumber, String cvcNumber, String expMonth_Year, String address) {
        super(firstName, lastName, password, userName, gmail);
        this.address = address;
        this.cardNumber = cardNumber;
        this.cvcNumber = cvcNumber;
        this.expMonth_Year = expMonth_Year;

    }

    @Override
    void showFunctions() {
        System.out.println("The costumer can show the fonctions she/he has.");
        System.out.println("The costumer can show the informations she/he has.");
        System.out.println("The costumer can create an order.");
        System.out.println("The costumer can access their own order history. ");
    }

    @Override
    void showInformations() {
        super.showInformations();
        System.out.println("User's address : " + this.address);
        System.out.println("User's card number : " + this.cardNumber);
        System.out.println("User's cvc number : " + this.cvcNumber);
        System.out.println("User's exp. month and year : " + this.expMonth_Year);

    }

    void addOrder(Order order) {
        for (Costumer costumer : Admin.costumers) {
            if (costumer.getFirstName().equals(order.getOrderHolderFirstName()) && costumer.getLastName().equals(order.getOrderHolderLastName())) {
                costumer.ordersHistory.add(order);

            }
        }
    }

    void showOrdersHistory(Costumer costumer) {
        for (Order order : costumer.ordersHistory) {
            System.out.println("ORDERS RECEİVED");
            System.out.println("No : "+order.getOrderId() + " has been received.");
            break;
        } 

    }

    // ÇİÇEK SİPARİŞ ETME
    void createAnOrder() {
        System.out.println("Enter random order Id.");
        int orderId = scan.nextInt();

        System.out.println("Pleas enter your first name.");
        scan.nextLine();
        String firstName = scan.nextLine();
        System.out.println("Pleas enter your last name.");
        String lastName = scan.nextLine();
        System.out.println("Pleas enter your card number.");
        String cardNumber = scan.nextLine();
        System.out.println("Please enter your cvc number.");
        String cvcNumber = scan.nextLine();
        System.out.println("Please enter your exp. month and year number.");
        String expMonthYear = scan.nextLine();
        boolean isCard = true;
        for (Costumer costumer : Admin.costumers) {
            if (costumer.getCardNumber().equals(cardNumber) && costumer.getCvcNumber().equals(cvcNumber) && costumer.getExpMonth_Year().equals(expMonthYear)) {
                isCard = false;

                
                for (Flowers flower : Flowers.flowers) 
                {
                    flower.displayFlowers();
                    System.out.println("Please write the name of the flower you want first and then the amount you want from this flower.");
                    String flowerName = scan.nextLine();
                    int flowerAmount = scan.nextInt();
                    scan.nextLine();
                    
                    if (flowerAmount < flower.getNumber()) 
                    {
                        // Show Order Info
                        System.out.println(flowerAmount + " " + flowerName + " orders were created.");
                        System.out.println("Order Address : " + costumer.address);
                        
                        // Update Flower Amount on Databse
                        flower.decreaseAmountOfFlower(flowerName, flowerAmount);
                        
                        // Create New Order+
                        Order order = new Order(firstName, lastName, orderId);
                        costumer.addOrder(order);
                        costumer.showOrdersHistory(costumer);
                    }

                    break;
                }
            }
        }
        if (isCard) {
            System.out.println("You entered your card information incorrectly, please try again.");
        }

    }

    /**
     * @return the cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * @return the cvcNumber
     */
    public String getCvcNumber() {
        return cvcNumber;
    }

    /**
     * @param cvcNumber the cvcNumber to set
     */
    public void setCvcNumber(String cvcNumber) {
        this.cvcNumber = cvcNumber;
    }

    /**
     * @return the expMonth_Year
     */
    public String getExpMonth_Year() {
        return expMonth_Year;
    }

    /**
     * @param expMonth_Year the expMonth_Year to set
     */
    public void setExpMonth_Year(String expMonth_Year) {
        this.expMonth_Year = expMonth_Year;
    }

}
