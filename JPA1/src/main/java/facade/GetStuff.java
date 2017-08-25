/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Costumer;
import entity.ItemType;
import entity.NewO;
import entity.OrderLine;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Dixie
 */
public class GetStuff implements GetStuffInterface {

    @Override
    public void createCostumer(String costumerName, String email) {
        Costumer costumer = new Costumer();
        costumer.setEmail(email);
        costumer.setName(costumerName);
    }

    @Override
    public String findCostumer(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> getAllCostumers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createOrder(String itemName, int quantity) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        
        
        ItemType itemType = new ItemType();
        itemType.setName(itemName);
        OrderLine orderLine = new OrderLine();
        orderLine.setQuantity(quantity);
        orderLine.setItemType(itemType);
        NewO order = new NewO();
        orderLine.setOrder(order);
        
        
        
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void addOrderCostumer(String costumerName, int orderID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Query q = em.createQuery("SELECT ID From Costumer WHERE NAME = " + costumerName);
        
        
        
        NewO order = new NewO();
        
    }

    @Override
    public void createItemType(String itenName, String itemDescription, int itemPrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createOrderLine(String itemName, int itemQuantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTotalPrice(int OrderID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
