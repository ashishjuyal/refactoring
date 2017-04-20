namespace RefactoringWorkshop.ChangePreventors.DivergentChange
{
    public class Customer
    {
        public string FirstName { get; set; }

        public string LastName { get; set; }

        public string Title { get; set; }

        public string ToXml() {
            return "<customer>" +
                       "<firstName>" + FirstName + "</firstName>" +
                       "<lastName>" + LastName + "</lastName>" +
                       "<title>" + Title + "</title>" +
                   "</customer";
        }

        public string ToJson() {
            return "{" +
                       "firstName: " + FirstName + "," +
                       "lastName:" + LastName + "," +
                       "title:" + Title +
                   "}";
        }

    }
}