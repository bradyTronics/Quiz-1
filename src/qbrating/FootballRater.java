package qbrating;
import java.util.Scanner;

public class FootballRater {
	private static Scanner v;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Td;      // Quarter backs Collect Touchdowns
		double Yrds; // Total Yards
		double INT;     // Interceptions
		double Comp; // Completions
		double Att;     // Number of passes Attempted
		double a;   //Completion Ratio
		double b;   // Yards per Attempt
		double c;   // Touchdown per Attempt
		double d;   // Interceptions per Attempt;
		
		double Pr;   // Passer Rating
		
		Scanner v = new Scanner(System.in);
		System.out.println("Number of Passes Attempted");
		Att = v.nextDouble();
		
		
		System.out.println("Number of Completions");
		Comp = v.nextDouble();
		
		
		System.out.println("Total amount of Yards");
		Yrds = v.nextDouble();
		
	
		System.out.println("Number of Interceptions");
		INT = v.nextDouble();
		
		
		System.out.println("Total amount of TouchDowns");
		Td = v.nextDouble();
		
	    a = (((Comp/Att)-.3)*5);  
		b = (((Yrds/Att)-3)*.25);
		c = ((Td/Att)*20);
		d = 2.375 - ((INT/Att)*25);
		
		Pr = (((a+b+c+d)/6)*100);
		
		System.out.println(Pr); //output to user for final result
		
	}

}
