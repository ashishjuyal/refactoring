using NUnit.Framework;
using RefactoringWorkshop.Bloaters.Dataclumps;

namespace Test.Bloaters.DataClumps
{
    [TestFixture]
    public class CustomerTest
    {
        [Test]
        public void should_display_customers_address_details() {
            var customer = new Customer
            {
                House = "999",
                Steet = "Some street",
                City = "Gurgaon",
                Postcode = "111888",
                Country = "India"
            };

            Assert.AreEqual("999, Some street, Gurgaon, 111888, India", customer.AddressSummary());
        }

    }
}