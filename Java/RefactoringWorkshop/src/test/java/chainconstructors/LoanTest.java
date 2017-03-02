package chainconstructors;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class LoanTest {

    private float outstanding;
    private int rating;
    private Date expiryDate;
    private float notional;
    private Date maturityDate;

    @Before public void
    setup() {
        notional = 1.0f;
        outstanding = 1.0f;
        rating = 1;
        expiryDate = new Date();
        maturityDate = new Date();
    }

    @Test public void
    should_be_able_to_construct_object_using_constructor_with_4_arguments() {
        Loan loan = new Loan(notional, outstanding, rating, expiryDate);
        assertThat(loan, isA(Loan.class));
        assertThat(loan, notNullValue());
    }

    @Test public void
    should_be_able_to_construct_object_using_constructor_with_5_arguments() {
        Loan loan = new Loan(notional, outstanding, rating, expiryDate, maturityDate);
        assertThat(loan, isA(Loan.class));
        assertThat(loan.getStrategy(), instanceOf(RevolvingTermROC.class));
    }

    @Test public void
    should_be_able_to_construct_object_using_constructor_with_6_arguments() {
        CapitalStrategy strategy = new CapitalStrategy();
        Loan loan = new Loan(strategy, notional, outstanding, rating, expiryDate, maturityDate);
        assertThat(loan, isA(Loan.class));
        assertThat(loan.getStrategy(), instanceOf(CapitalStrategy.class));
    }

}