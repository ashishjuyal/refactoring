namespace RefactoringWorkshop.Dispensable.DataClasses
{
    public class Customer
    {
        public string Title { get; set; }

        public string FirstName { get; set; }

        public string LastName { get; set; }

        public Address Address { get; set; }

        public Customer(string title, string firstName, string lastName, Address address)
        {
            Title = title;
            FirstName = firstName;
            LastName = lastName;
            Address = address;
        }
    }
}