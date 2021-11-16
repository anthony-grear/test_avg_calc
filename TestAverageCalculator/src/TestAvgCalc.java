
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
		
		System.out.println(spec1+spec2+spec3+spec4+spec5+spec6+spec7);
	}
	
	public static void main (String [] args) {
		TestAvgCalc.specs();
	}
}
