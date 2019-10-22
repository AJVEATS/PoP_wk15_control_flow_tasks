/**
 * 
 * @author Melanie
 * This is the Second Salary class - used to explore if and loop statements
 * 
 */

public class Salary {
	
	//Task 1
	
	public double salaryTax(double grossSalary) {
		double tax = 0;
		if(grossSalary >= 45000.00 ) {
			tax = 0.5;
		} else if (grossSalary >= 30000.00) {
			tax = 0.7;
		}else {
			tax = 0.85;
		}
		return grossSalary * tax;
	}
	
	//Task 2
	
	public double calculateNI(double grossSalary, char NIBand) {
		double NIPayment = 0;
		if(NIBand == 'A') {
			NIPayment = 0.88;
		} else if (NIBand == 'B') {
			NIPayment = 0.9415;
		} else if (NIBand == 'C') {
			NIPayment = 0.98;
		} else {
			NIPayment = 1;
		}
		return grossSalary * NIPayment;
	}

	//Task 3
	
	public double salaryTotal( double[] salaries) {
		double sum  = 0;
		for(int i = 0; i < salaries.length; i++) {
			sum = salaries[i] + sum;
		}
		return sum;
	}
	
	//Task 4
	
	public double salaryAverage( double[] salaries) {
		double sum  = 0;
		for(int i = 0; i < salaries.length; i++) {
			sum = salaries[i] + sum;
		}
		return sum / salaries.length;
	}
	
	//Task 5
	
	public double[] salaryIncrease(double[] salaries) {
		for(int i = 0; i < salaries.length; i++) {
			salaries[i] = salaries[i] * 1.05;
		}
		return salaries;
	}
}
