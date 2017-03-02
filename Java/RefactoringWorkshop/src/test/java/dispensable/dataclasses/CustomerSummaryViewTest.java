package dispensable.dataclasses;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerSummaryViewTest {

    @Test public void
    should_return_customer_summary_view() {
        Address address = new Address("New Delhi", "110011", "India");
        Customer customer = new Customer("Mr.", "firstname", "lastname", address);
        CustomerSummaryView view = new CustomerSummaryView(customer);

        assertEquals("Mr. firstname lastname, New Delhi, 110011 India", view.getCustomerSummary());
    }
}