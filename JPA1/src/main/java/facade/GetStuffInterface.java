/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Costumer;
import java.util.ArrayList;

/**
 *
 * @author Dixie
 */
public interface GetStuffInterface {
    
    
    public void createCostumer(String costumerName, String email);
    public String findCostumer(String email);
    public ArrayList<Costumer> getAllCostumers();
    public void createOrder(String itemName, int quantity);
    public void addOrderCostumer(String costumerName,int orderID);
    public void createItemType(String itenName, String itemDescription, int itemPrice);
    public void createOrderLine(String itemName, int itemQuantity);
    public int getTotalPrice(int OrderID);
    
}
