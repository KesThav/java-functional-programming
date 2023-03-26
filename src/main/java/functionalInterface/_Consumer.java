package functionalInterface;

import java.util.List;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args){

        //Normal java function
        greetCustomer(new Customer("Maria", "0000"));

        //Consumer Functional interface
        greetCustomerConsumer.accept(new Customer("Maria", "0000"));

        List.of(new Customer("Maria", "0000"),
                new Customer("Marime", "0002")).forEach(_Consumer::greetCustomer);

    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }


    }
}
