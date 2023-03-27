package combinatorpattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Alice","alicegmail.com", "0000000",LocalDate.of(2000,03,01));

        CustomerValidatorService validatorService = new CustomerValidatorService();
        validatorService.isValid(customer);

        System.out.println(CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isPhonenumberValid())
                .and(CustomerRegistrationValidator.isAdult()).apply(customer));


    }
}
