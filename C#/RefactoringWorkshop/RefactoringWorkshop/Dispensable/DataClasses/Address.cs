namespace RefactoringWorkshop.Dispensable.DataClasses
{
    public class Address
    {
        public string City { get; set; }

        public string PostCode { get; set; }

        public string Country { get; set; }

        public Address(string city, string postCode, string country)
        {
            City = city;
            PostCode = postCode;
            Country = country;
        }
    }
}