
public class EmployeePay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String EmployeeName = "John Dou";
		String PPS = "5121212QR";
		String Department = "IT Engineering";
		double BasicRate = 29.35;
		double BasicTime = 40;
		double OverTime = 18;
		double OvertimeRate = BasicRate*1.5;
		
		double HoursWorked_basic = BasicTime*BasicRate;
		double HoursWorked_overtime = OverTime*OvertimeRate;
		double GrossPay = HoursWorked_basic + HoursWorked_overtime;
		double IncomeTax = (GrossPay*0.35);
		double NetPay = GrossPay - IncomeTax;
		
		
		System.out.println("Employee " + EmployeeName + " PPS number -"+ PPS);
		System.out.println("Department " + Department);
		System.out.println("Weekly salary Calculation");
		System.out.println("Basic Salary - " + HoursWorked_basic + " euro");
		System.out.println("Over Time Salary - " + HoursWorked_overtime + " euro");
		System.out.println("Gross Pay - " + GrossPay + " euro");
		System.out.println("Income Tax - " + IncomeTax + " euro");
		System.out.println("Net Pay - " + NetPay + " euro");
	
		
		
		
		

	}

}
