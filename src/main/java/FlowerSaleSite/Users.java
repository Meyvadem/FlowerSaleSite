/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlowerSaleSite;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 *
 * @author Merve
 */
public class Users {

    String firstName;
    String lastName;
    String password;
    String userName;
    String gmail;

    public Users(String firstName, String lastName, String password, String userName, String gmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.gmail = gmail;

    }

    public Users() {
    }

    void enterTheSite() {
        System.out.println("Login or register.");
    }

    void showFunctions() {
        System.out.println("The user can enter the site.");
        System.out.println("The user can show the fonctions she/he has.");
    }

    void showInformations() {
        System.out.println("User's first name : " + this.firstName);
        System.out.println("User's last name : " + this.lastName);
        System.out.println("User's username : " + this.userName);
        System.out.println("User's password : " + this.password);
        System.out.println("User's gmail : " + this.gmail);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;

    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

}
