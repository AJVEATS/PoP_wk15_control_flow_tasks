import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalaryUnitTests3 {

	Salary salary;

	@BeforeEach
	void createObject() {
		salary = new Salary();
	}

	//Task 1
	@Test
	void testHighestOfTwo() {
		assertEquals(30000.0, salary.salaryTax(60000.00));
		assertEquals(21000.0, salary.salaryTax(30000.00));
		assertEquals(17000.0, salary.salaryTax(20000.00));
	}

	//Task 2
	@Test
	void testCalculateNI() {
		assertEquals(44000.0, salary.calculateNI(50000.00, 'A'));
		assertEquals(47075.0, salary.calculateNI(50000.00, 'B'));
		assertEquals(49000.0, salary.calculateNI(50000.00, 'C'));
		assertEquals(50000.0, salary.calculateNI(50000.00, 'D'));
	}

	//Task 3
	@Test
	void testSalaryTotal() {
		double[] salaries = {23000.50, 25478.66, 78496.56};
		assertEquals(126975.72, salary.salaryTotal(salaries));
		double[] salaries1 = {1.50, 1.50, 0.00};
		assertEquals(3.0, salary.salaryTotal(salaries1));
		double[] salaries2 = {1.50, 1.50, 0.00, 100000.00, 123456.00};
		assertEquals(223459.0, salary.salaryTotal(salaries2));
	}

}
