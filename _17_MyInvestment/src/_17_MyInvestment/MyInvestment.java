package _17_MyInvestment;

public class MyInvestment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String EmployeeName = "John Dou";
		String PPS = "5121212QR";
		String Department = "IT Engineering";
		double PrincipalSumInvested = 100000;
		double InterestRate = 0.40;
		double TotalValue = PrincipalSumInvested*InterestRate;
		
		System.out.println("Employee " + EmployeeName + " PPS number -"+ PPS);
		System.out.println("Department " + Department);
		System.out.println("Total Value of Investmen Calculation");
		System.out.println("Total Value of Investmen - " + TotalValue + " euro");

	}

}
