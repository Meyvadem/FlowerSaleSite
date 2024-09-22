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
public class Order {

    private String orderHolderFirstName;
    private String orderHolderLastName;
    private int orderId;
    static ArrayList<Order> orders = new ArrayList<>();

    public Order(String orderHolderFirstName, String orderHolderLastName, int orderId) {
        this.orderHolderFirstName = orderHolderFirstName;
        this.orderHolderLastName = orderHolderLastName;
        this.orderId = orderId;
    }
    
    

    /**
     * @return the orderHolderFirstName
     */
    public String getOrderHolderFirstName() {
        return orderHolderFirstName;
    }

    /**
     * @param orderHolderFirstName the orderHolderFirstName to set
     */
    public void setOrderHolderFirstName(String orderHolderFirstName) {
        this.orderHolderFirstName = orderHolderFirstName;
    }

    /**
     * @return the orderHolderLastName
     */
    public String getOrderHolderLastName() {
        return orderHolderLastName;
    }

    /**
     * @param orderHolderLastName the orderHolderLastName to set
     */
    public void setOrderHolderLastName(String orderHolderLastName) {
        this.orderHolderLastName = orderHolderLastName;
    }

    /**
     * @return the orderId
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * @param OrderId the orderId to set
     */
    public void setOrderId(int OrderId) {
        orderId = OrderId;
    }

}
