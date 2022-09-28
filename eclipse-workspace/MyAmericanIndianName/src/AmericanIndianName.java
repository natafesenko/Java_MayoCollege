import java.util.Scanner;

public class AmericanIndianName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String partBird;
		String favSize;
		String favColour;
		String favAnimal;
		String favNum;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Name a part of a bird?");
		partBird = in.nextLine();
		System.out.println("What size chocolate bar do you prefer? Small, Medium, Large, Extra Large, Gigantic?");
		favSize = in.nextLine();
		System.out.println("What is your favourite colour?");
		favColour = in.nextLine();
		System.out.println("What is your favourite animal?");
		favAnimal = in.nextLine();
		System.out.println("What is your favourite number?");
		favNum = in.nextLine();
		
		System.out.println("Your American Indian Name is " + partBird + " " + favSize + " "+ favColour + " " + favAnimal +" " + favNum +"th" );

	}

}
