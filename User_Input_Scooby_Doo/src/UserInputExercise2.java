import java.util.Scanner;
public class UserInputExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName;
		String bffFirtsName;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please enter your first name");
		firstName = in.nextLine();
		System.out.println("Your Scooby Doo name is "+ firstName +"y"+ " Dooo");
		System.out.println("Please enter your best friend forevers first name");
		bffFirtsName = in.nextLine();
		System.out.println("Your Scooby Doo name is ... Shady "+ bffFirtsName);

	}

}
