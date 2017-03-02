package coupler.featureenvy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BenefitServiceTest {

    BenefitService benefitService;
    Employee employee;
    @Before public void
    setup() {
        employee = new Employee(30, 2, "Employee one");
        benefitService = new BenefitService(employee);
    }

    @Test public void
    should_return_employee_with_healthcare_benefit() {
        assertEquals("<EMPLOYEE><NAME>Employee one</NAME><BENEFIT_TYPE>HEALTHCARE_BENEFIT</BENEFIT_TYPE</EMPLOYEE>", benefitService.employeeDetailsXML());
    }

    @Test public void
    should_return_employee_with_wellness_benefit() {
        employee.setGrade(4);
        assertEquals("<EMPLOYEE><NAME>Employee one</NAME><BENEFIT_TYPE>WELLNESS_BENEFIT</BENEFIT_TYPE</EMPLOYEE>", benefitService.employeeDetailsXML());
    }

    @Test public void
    should_return_employee_with_retirement_benefit() {
        employee.setGrade(6);
        assertEquals("<EMPLOYEE><NAME>Employee one</NAME><BENEFIT_TYPE>RETIREMENT_BENEFIT</BENEFIT_TYPE</EMPLOYEE>", benefitService.employeeDetailsXML());
    }
}