
public class Name_EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "Natali";

		char middleIninital = 'p';

		String lastName = "Fesenko";
		
		String fullName = (firstName + " " + middleIninital + " " + lastName);

		final String ppsNo = "5435989WA";

		byte age = 37;

		String department = "IT";

		Byte performanaceRating = 4;

		float basicSalary= 452000.50F;

		Boolean bonusAwarded = true;

		double bonus= 10000.50;

		double totalSalary= (basicSalary + bonus);
		
		System.out.println("My name is " + fullName
				+ "\r\n"
				+ "My PPS Number is " + ppsNo + ".");
		System.out.println(age);
		System.out.println(department);
		System.out.println(performanaceRating);
		System.out.println(bonusAwarded);
		System.out.println(bonus);
		System.out.println(totalSalary);

	}

}
