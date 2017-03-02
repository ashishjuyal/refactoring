namespace RefactoringWorkshop.Dispensable.DataClasses
{
    public class CustomerSummaryView
    {
        private readonly Customer _customer;

        public CustomerSummaryView(Customer customer) {
            _customer = customer;
        }

        public string GetCustomerSummary() {
            var address = _customer.Address;
            return _customer.Title + " " + _customer.FirstName + " " + _customer.LastName + ", " +
                   address.City + ", " + address.PostCode + " " + address.Country;
        }
    }
}