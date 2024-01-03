import javax.swing.JOptionPane;
//Dillon Tall, CSC 229, Program 1
public class Project01 {

	public static void main(String[] args) {
		int x1,y1;
		int x2,y2;
		int x3,y3;
		int height;
		//required integers for the calculations for the rest of the program
		//they were initialized as doubles as they ran into errors converting double to int
		double perimeter;
		double s;
		double area;
		double sarea;
		double volume;
		
		String input;
		double side1, side2, side3;
		// get input values 
		
		input = JOptionPane.showInputDialog(
				null, "Enter an Integer", "X1",JOptionPane.QUESTION_MESSAGE);
		x1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(
				null, "Enter an Integer", "Y1",JOptionPane.QUESTION_MESSAGE);
		y1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(
				null, "Enter an Integer", "X2",JOptionPane.QUESTION_MESSAGE);
		x2 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(
				null, "Enter an Integer", "Y2",JOptionPane.QUESTION_MESSAGE);
		y2 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(
				null, "Enter an Integer", "X3",JOptionPane.QUESTION_MESSAGE);
		x3 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(
				null, "Enter an Integer", "Y3",JOptionPane.QUESTION_MESSAGE);
		y3 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(
				null, "Enter Height of the Prism", "Height",JOptionPane.QUESTION_MESSAGE);
		height = Integer.parseInt(input);
		
		//perform calculations
		side1 = Math.sqrt(Math.pow(x2 - x1, 2) + 
				Math.pow((y2-y1), 2));
		side2 = Math.sqrt(Math.pow(x3 - x2, 2) + 
				Math.pow((y3-y2), 2));
		
		
		//newly added side3 calculation
		side3 = Math.sqrt(Math.pow(x1 - x3, 2) + 
				Math.pow((y1-y3), 2));
		
		//Calculations for Perimeter, Area, Surface Area and Volume
		//Using given formula for variable s to substitute in the area formula
		s = (side1 + side2 + side3) / 2 ;
		
		//area calculation using variable s and sides 1-3 all square rooted
		area = Math.sqrt(s *(s - side1) * (s - side2) * (s - side3));
		
		//perimeter simply added all sides
		perimeter = side1 + side2 + side3;
		
		//surface area using area height and perimeter from before
		sarea = 2 * area + height * perimeter;
		
		//volume simply height multiplied by area
		volume = height * area;
		
		//create output
		JOptionPane.showMessageDialog(
				null,
				"          CSC 229 - Project 1"+"\n" + "___________________________" + "\n" + 
				"          Triangular Prism"+"\n" + 
				"___________________________" + "\n" + "" +
				"          Primary Attributes" + "\n" + 
				"___________________________" + "\n" + "" +
				"          First Point    = (" + x1 +"," + y1 + ")" + "\n" +
				"          Second Point   = (" + x2 +"," + y2 + ")" + "\n" +
				"          Third Point    = (" + x3 +"," + y3 + ")" + "\n" +
				"          Height         = " + height +  "\n" +
				"___________________________" + "\n" + "" +
				"          Base Attributes" + "\n" + 
				"___________________________" + "\n" + "" +
				//Added side 3, Perimeter, and Area to Base Attributes output
				"          Side 1 = "+Math.round(side1) + "\n" +
				"          Side 2 = "+Math.round(side2) + "\n" +
				"          Side 3 = "+Math.round(side3) + "\n" +
				"          Perimeter = "+Math.round(perimeter) + "\n" + 
				"          Area   = "+Math.round(area) + "\n" +
				"___________________________" + "\n" +
				"          Prism Attributes" + "\n" + 
				"___________________________" + "\n" +
				//Output of surface area and volume rounded to whole number
				"          Surface Area = "+Math.round(sarea) + "\n" +
				"          Volume       = "+Math.round(volume) + "\n" ,
				"Project 1 - Triangular Prism", JOptionPane.INFORMATION_MESSAGE);
				
				

	}

}
