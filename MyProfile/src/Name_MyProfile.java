
public class Name_MyProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "Natali";

		char middleIninital = 'P';

		String lastName = "Fesenko";
		
		String fullName = (firstName + " " + middleIninital + " " + lastName);

		byte age = 37;

		String occupation = "Student";

		float height = 164;

		boolean isSmoker = false;
		
		System.out.println("My name is " + fullName
				+ "\r\n"
				+ "I am " + age + " years old");
		System.out.println("I'm a " + occupation);
		
		System.out.println(height);
		System.out.println(isSmoker);

	}

}
