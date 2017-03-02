using System.Text;

namespace RefactoringWorkshop.Coupler.FeatureEnvy
{
    public class BenefitService
    {
        private readonly Employee _employee;

        public BenefitService(Employee employee) {
            _employee = employee;
        }

        public string EmployeeDetailsXml() {
            StringBuilder details = new StringBuilder();
            details.Append("<EMPLOYEE>");
            details.Append("<NAME>" + _employee.Name + "</NAME>");
            details.Append("<BENEFIT_TYPE>" + GetBenefitType() + "</BENEFIT_TYPE");
            details.Append("</EMPLOYEE>");
            return details.ToString();
        }

        private Benefit GetBenefitType() {
            if(_employee.Grade <= 3) {
                return Benefit.HealthcareBenefit;
            }
            if(_employee.Grade <= 5) {
                return Benefit.WellnessBenefit;
            }
            return Benefit.RetirementBenefit;
        }

    }
}