package coupler.featureenvy;

public class BenefitService {

    private Employee employee;

    public BenefitService(Employee employee) {
        this.employee = employee;
    }

    public String employeeDetailsXML() {
        StringBuilder details = new StringBuilder();
        details.append("<EMPLOYEE>");
        details.append("<NAME>" + employee.getName() + "</NAME>");
        details.append("<BENEFIT_TYPE>" + getBenefitType() + "</BENEFIT_TYPE");
        details.append("</EMPLOYEE>");
        return details.toString();
    }

    private Benefit getBenefitType() {
        if(employee.grade() <= 3) {
            return Benefit.HEALTHCARE_BENEFIT;
        }
        if(employee.grade() <= 5) {
            return Benefit.WELLNESS_BENEFIT;
        }
        return Benefit.RETIREMENT_BENEFIT;
    }
}
