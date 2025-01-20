package prob4;

import java.time.LocalDate;

public class CustOrderFactory {

    private CustOrderFactory() {
    }

    public static Customer createCustomer(String name) {
        if(name!=null && !name.isEmpty()){
            return new Customer(name);
        }
        throw new NullPointerException("Invalid name input");
    }

    public static Order newOrder(Customer customer, LocalDate orderDate) {
        if(customer != null){
            Order order = new Order(orderDate);
            customer.addOrder(order);
            return order;
        }
        throw new NullPointerException("Customer is null");
    }

    public static Item newItem(String name) {
        return new Item(name);
    }
}
