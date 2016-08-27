package Practicing2ndYear;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class SayHello2Methods {

	public static void main(String[] args) {

		// Calling Method displayMessage()
		displayMessage();
		displayMessage();

		System.out.println("\nMantra for semester two:");

		// Calling Method displayMantra() 10 times
		for(int i = 0; i <= 10; i++)
		{	
			displayMantra();
		}

		System.out.println();
		//		################################################ HierarchicalMethods ######################################################

		method1();
		method3();
		method2();
		method3();

		System.out.println();
		//		################################################### Drawing faces #########################################################		

		drawFace1();
		System.out.println("\n");
		drawFace2();
		System.out.println("\n");
		drawFace3();
		System.out.println("\n");

		//		################################################### Print Figures #########################################################

		drawFigure1();
		System.out.println();
		drawFigure2();
		System.out.println("\n");
		drawFigure3();
		System.out.println("\n");

		//	######################################################## Draw shuttle ##########################################################

		part1OfShuttle();
		part2OfShuttle();
		part3OfShuttle();

	}

	

	//	############################################################# Methods ##############################################################

	private static void part3OfShuttle()
	{
		System.out.println("  //\\\\");
		System.out.println(" //  \\\\");
		System.out.println("//    \\\\");
	}
	
	private static void part2OfShuttle()
	{
		for(int i = 0; i < 4; i++)
		{
			System.out.print("#");
			for(int j = 0; j < 6; j++)
			{
				System.out.print("-");
			}
			System.out.println("#");
			for(int k = 0; k < 3; k++)
			{
				System.out.print("-");
				for(int l = 0; l < 6; l++)
				{
					System.out.print(" ");
				}
				System.out.println("-");
			}
		}
		System.out.print("#");
		for(int j = 0; j < 6; j++)
		{
			System.out.print("-");
		}
		System.out.println("#");
	}

	private static void part1OfShuttle()
	{
		System.out.println("   /\\");
		System.out.println("  /  \\");
		System.out.println(" /    \\");
	}


	private static void drawFigure1() 
	{
		parallelLines();
		System.out.println();
		fiveStars();
	}

	private static void fiveStars() 
	{
		System.out.println(" * * ");
		System.out.println("  *  ");
		System.out.print(" * * ");
	}

	private static void drawFigure2() 
	{
		drawFigure1();
		parallelLines();
	}

	private static void parallelLines() 
	{
		for (int i = 0; i < 2; i++)
		{
			System.out.println();

			for(int j = 0; j < 5; j++)
			{
				System.out.print("*");
			}
		}
	}

	private static void drawFigure3() 
	{
		verticalLine();
		drawFigure1();
	}

	private static void verticalLine() 
	{
		for(int i = 0; i < 4; i++)
		{
			if(i>0)
			{
				System.out.println();
			}
			for(int j = 0; j < 1; j++)
			{
				System.out.print("  *");
			}
		}
	}

	private static void drawFace2() {
		drawEyes();
		drawNose();
		drawMouth();
		drawHair();
	}

	private static void drawFace1() {
		drawHair();
		drawEyes();
		drawNose();
		drawMouth();
	}

	private static void drawFace3(){
		drawHair();
		drawEyes();
		drawNose();
		drawMouth();
		drawHair();
	}

	private static void drawEyebrows() {
		System.out.println("\"  \"");

	}

	private static void drawMouth() {
		System.out.println("<-->");
	}

	private static void drawNose() {
		System.out.println(" <> ");
	}

	private static void drawEyes() {
		drawEyebrows();
		System.out.println("*  *");
	}

	private static void drawHair() {
		System.out.println("||||");
	}

	private static void method2() 
	{
		method1();
		System.out.println("I am method 2.");
	}

	private static void method3() 
	{
		method2();
		System.out.println("I am method 3.");
		method1();
	}

	private static void method1() 
	{
		System.out.println("I am method 1.");
	}

	/**
	 * This method displaying a message
	 */
	private static void displayMantra() 
	{	
		System.out.println("Programming is easy, I am going to nail Java in semester two.");
	}

	/**
	 * This method displaying a message
	 */
	private static void displayMessage() 
	{
		System.out.println("Hello World!");
	}

}
