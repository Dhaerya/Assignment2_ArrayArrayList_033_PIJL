// Name: Dhaerya More
// PRN:  23070126033
// Batch: AIML A2

//UserInput.java


import java.util.*;
class UserInput{
	int[] arrayInput(){
		int[] array = new int[5];
		System.out.println("Enter 5 Numbers: ");
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < array.length; i++){
			array[i] = scan.nextInt();
		}
		
		return array;
	}
}