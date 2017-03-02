using NUnit.Framework;
using RefactoringWorkshop.Coupler.FeatureEnvy;

namespace Test.Coupler.FeatureEnvy
{
    [TestFixture]
    public class BenefitServiceTest
    {
        private BenefitService _benefitService;
        private Employee _employee;
        [SetUp]
        public void Initialize() {
            _employee = new Employee(30, 2, "Employee one");
            _benefitService = new BenefitService(_employee);
        }

        [Test]
        public void should_return_employee_with_healthcare_benefit() {
            Assert.AreEqual("<EMPLOYEE><NAME>Employee one</NAME><BENEFIT_TYPE>HealthcareBenefit</BENEFIT_TYPE</EMPLOYEE>", _benefitService.EmployeeDetailsXml());
        }

        [Test]
        public void should_return_employee_with_wellness_benefit() {
            _employee.Grade = 4;
            Assert.AreEqual("<EMPLOYEE><NAME>Employee one</NAME><BENEFIT_TYPE>WellnessBenefit</BENEFIT_TYPE</EMPLOYEE>", _benefitService.EmployeeDetailsXml());
        }

        [Test]
        public void should_return_employee_with_retirement_benefit() {
            _employee.Grade = 6;
            Assert.AreEqual("<EMPLOYEE><NAME>Employee one</NAME><BENEFIT_TYPE>RetirementBenefit</BENEFIT_TYPE</EMPLOYEE>", _benefitService.EmployeeDetailsXml());
        }

    }
}