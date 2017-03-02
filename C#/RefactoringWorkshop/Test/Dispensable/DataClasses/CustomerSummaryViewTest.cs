using NUnit.Framework;
using RefactoringWorkshop.Dispensable.DataClasses;

namespace Test.Dispensable.DataClasses
{
    public class CustomerSummaryViewTest
    {
        [Test]
        public void
            should_return_customer_summary_view() {
            var address = new Address("New Delhi", "110011", "India");
            var customer = new Customer("Mr.", "firstname", "lastname", address);
            var view = new CustomerSummaryView(customer);

            Assert.AreEqual("Mr. firstname lastname, New Delhi, 110011 India", view.GetCustomerSummary());
        }
    }
}