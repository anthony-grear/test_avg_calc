import java.util.Scanner;

public class TestAvgCalc {
	
	//method to print the program specifications
	private static void specs () {
		String spec1 = "\u2022 Create a Java project in IDE and begin the Project Program\n  by developing a Java Method to print the programming specifications\n  for the project.";
		String spec2 = "\n\n\u2022 Expand the Project Program and create Java code to input from the \n  console (keyboard) the first quiz grade. Use a loop to allow the \n  user to continue to enter grades as long as they don't enter 999 to quit.";
		String spec3 = "\n\n\u2022 Expand the Project Program and create Java code to populate the array \n  the student's quiz grades. The grade is added to a running total, and the \n  count of grades entered is incremented. If the grade entered is the 10th \n  grade, the grade is forced to 999 and the loop ends; otherwise the user \n  enters another quiz grade. When the loop ends count holds the number of \n  grades entered.";
		String spec4 = "\n\n\u2022 Expand the Project Program and create Java code use another loop to print \n  all grades in the array.";
		String spec5 = "\n\n\u2022 Expand the Project Program and create Java code to compute the average \n  quiz grade.";
		String spec6 = "\n\n\u2022 Expand the Project Program and create Java code to use decision logic \n  to find out the letter grade of the average based on the following \n  grading scale and print to the console.";
		String spec7 = "\n\n\u2022 A = 90-100\r\n"
				+ "\u2022 B = 80-89\r\n"
				+ "\u2022 C = 70-79\r\n"
				+ "\u2022 D = 60-69\r\n"
				+ "\u2022 F = 0-59";
		System.out.println("Anthony Grear, CS 115 Final Assignment, Test Average Calculator\n");
		System.out.println(spec1+spec2+spec3+spec4+spec5+spec6+spec7);
	}
	
	public static void main (String [] args) {
		double score=0;                       //each test grade
		double total=0;                       //sum of all entered grades
		double average=0;                     //average of grades entered
		double averageFloor;                  //grade average rounded down to the tens place
		int scoreFloor;                       //grade average rounded down to the tens place cast to an int
		int count=0;                          //count of grades entered
		int remaining=10;                     //count of grades to be entered 
		char finalGrade;                      //final letter grade
		double[] scores= new double[10];      //array of grades entered
		TestAvgCalc.specs();                  //calling the method to print specifications		
		System.out.println("\nWelcome to Test Average Calculator.\n\nYou may enter up to 10 scores, or enter 999 at anytime to quit.\n\nPlease enter your first test grade:");
		
		Scanner sc = new Scanner(System.in);  //initialize an instance of the Scanner class
		score = sc.nextDouble();              //call the nextDouble method to read the input 
		
		if (score!=999) {                     //check if user has entered the first score, or wants to quit
			scores[count] = score;
			total=total+score;
			count++;
			remaining = 10 - count;
		}
		while (score!=999 && count<10) {	 //prompt user to enter test scores until 999 or 10th score is entered		
			System.out.println("\nYou have " + remaining + " scores remaining.\n\nPlease enter your next test grade or 999 to quit:");
			score = sc.nextDouble();
			if (score!=999) {
				scores[count] = score;
				total=total+score;
				count++;
				remaining = 10 - count;
			}
		}
		
		average = total/count;                       //calculate the average test score
		averageFloor = Math.floor(average/10) * 10;  //round down the average to the tens place
		scoreFloor = (int)(averageFloor);            //cast the double to int to use in following switch block
		                                             
		switch (scoreFloor) {                        //assign a letter grade for output
		  case 90:
			 finalGrade = 'A' ;
			 break;
		  case 80:
			 finalGrade = 'B' ;
			 break;
		  case 70:
			 finalGrade = 'C' ;
			 break; 
		  case 60:
			 finalGrade = 'D' ;
			 break;  
		  default:
			 finalGrade = 'F' ;
			 break;			  
		}
		
		
		//loop through array and print scores
		System.out.println("List of Test Grades");
		System.out.println("---------------------");
		for (int i = 0; i <10; i++ ) {
			if (i <9) {
				System.out.println("| Test grade "+(i+1)+":  "+ scores[i]);
			} else {
			System.out.println("| Test grade "+(i+1)+": "+ scores[i]);
		
			}
		}		
		System.out.println("---------------------\n");
		
		//print the final output
		System.out.println("Total: " + total);
		System.out.println("Test Count: " + count);
		System.out.println("Numerical Average: " + average);
		System.out.println("Final Grade: " + finalGrade);
	}
}
