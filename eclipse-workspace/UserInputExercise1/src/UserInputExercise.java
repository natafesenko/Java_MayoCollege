import java.util.Scanner;
public class UserInputExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		String fullName;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter ypur Full Name");
		fullName = in.nextLine();
		System.out.println("Hello " + fullName);
		
		System.out.println("Enter your age ");
		age = in.nextInt();
		System.out.println("You are " + age + " years old.");
	}

}
