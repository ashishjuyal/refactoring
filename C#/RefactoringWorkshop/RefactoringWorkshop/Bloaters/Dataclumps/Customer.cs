namespace RefactoringWorkshop.Bloaters.Dataclumps
{
    public class Customer
    {
        public string FirstName { get; set; }

        public string LastName { get; set; }

        public string Title { get; set; }

        public string House { get; set; }

        public string Steet { get; set; }

        public string City { get; set; }

        public string Postcode { get; set; }

        public string Country { get; set; }

        public string AddressSummary() {
            return House + ", " + Steet + ", " + City + ", " + Postcode + ", " + Country;
        }

    }
}