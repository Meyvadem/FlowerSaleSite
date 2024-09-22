/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlowerSaleSite;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * cc
 *
 * @author Merve
 */
public class Admin extends Users {

    static ArrayList<Admin> admins = new ArrayList<>();
    static ArrayList<Category> categorys = new ArrayList<Category>();
    static ArrayList<Costumer> costumers = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Admin(String firstName, String lastName, String password, String userName, String gmail) {
        super(firstName, lastName, password, userName, gmail);
    }

    public Admin() {
    }

    @Override
    void showFunctions() {
        System.out.println("The admin can add a new admin or remove an admin.");
        System.out.println("The admin can add a new customer or remove an costumer.");
        System.out.println("The admin can show costumers.");
        System.out.println("The admin can add a new category or remove a category. ");
        System.out.println("The admin can control registration and login. ");

    }

    void showCostumer() {
        for (Costumer costumer : costumers) {
            costumer.showInformations();
            System.out.println(" ");
        }
    }

    @Override
    void enterTheSite() {

        System.out.println("Log in --> 1");
        System.out.println("Creating a new account --> 2");
        int seçim = scan.nextInt();
        scan.nextLine();
        switch (seçim) {
            case 1:

                System.out.println("Please enter user name.");
                String username1 = scan.nextLine();
                System.out.println("Please enter password.");
                String password = scan.nextLine();
                boolean isLogIn = false;
                Costumer loginCostumer = null;
                // Bütün cusotumerları dön
                for (Costumer costumer : costumers) 
                {
                    if (costumer.userName.equals(username1) && costumer.password.equals(password)) 
                    {
                        loginCostumer = costumer;
                        isLogIn = true;
                        break;
                    } else 
                    {
                        System.out.println("You entered the wrong username or wrong password, please try again.");

                    }
                }
                
                if(isLogIn)
                    System.out.println("Welcome to the city of flowers, " + loginCostumer.firstName);
                else
                    System.out.println("You entered the wrong username or wrong password, please try again.");

                break;
            case 2:
                Costumer costumer;
                System.out.println("Please enter your first name.");
                String name = scan.nextLine();

                System.out.println("Please enter your last name.");
                String surname = scan.nextLine();
                System.out.println("Please enter your gmail.");
                String gmail = scan.nextLine();
                System.out.println("Please create a username.");
                String userName2 = scan.nextLine();
                System.out.println("Please create a password.");
                String password2 = scan.nextLine();
                System.out.println("Please enter your card number.");
                String cardnumber = scan.nextLine();
                System.out.println("Please enter your cvc code.");
                String cvcNumber = scan.nextLine();
                System.out.println("Please enter your expiration date.");
                String expMonth_Year = scan.nextLine();
                System.out.println("Please enter your address.");
                String address = scan.nextLine();
                System.out.println("New account created.");
                costumer = new Costumer(name, surname, password2, userName2, gmail, cardnumber, cvcNumber, expMonth_Year, address);
                addCostumer(costumer);

                System.out.println("Welcome to the city of flowers, " + costumer.firstName);
                break;
            default:
                System.out.println("Wrong number, choose 1 or 2.");
                break;

        }
    }

    void addFlower(Flowers flower) {
        Flowers.flowers.add(flower);
    }

    void removeFlower(Flowers flower) {
        Flowers.flowers.remove(flower);
    }

    void addAdmin(Admin admin) {
        admins.add(admin);
    }

    void removeAdmin(Admin admin) {
        admins.remove(admin);
    }

    void addCostumer(Costumer costumer) {
        costumers.add(costumer);
    }

    void removeCostumer(Costumer costumer) {
        costumers.remove(costumer);
    }

    void addCategory(Category category) {
        categorys.add(category);

    }

    void removeCategory(Category category1) {
        categorys.remove(category1);
        category1.flowersType.clear();
    }

}
