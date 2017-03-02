namespace RefactoringWorkshop.Coupler.FeatureEnvy
{
    public class Employee
    {
        public int Age { get; set; }
        public int Grade { get; set; }
        public string Name { get; set; }

        public Employee(int age, int grade, string name)
        {
            Age = age;
            Grade = grade;
            Name = name;
        }
    }
}