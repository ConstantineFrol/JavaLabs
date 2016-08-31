package Practicing2ndYear;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class Week3_Lab1_displayPyramid {

	/**
	 * first for-loop used to use second for-loop and third for-loop 10 times
	 * second for-loop is displaying space in each string from 10 till null
	 * third for-loop is displaying symbol'*' in each string after a space " "
	 * from one till 10,every next line qty of '*' is bigger by 2 [1.3.5.7.....so on]
	 * 1st string prints 10 spaces them one star
	 * every following string will be less spaces " " and more stars '*'
	 */
	
	public static void main(String[] args) {

		//1
		for(int i = 0; i < 10; i++)
		{
			//2
	        for(int j = 0; j < 10 - i; j++)
	        {	
	            System.out.print(" ");
	        }
	        //3
	        for(int k = 0; k < 2 * i + 1; k++)
	        {	
	        	System.out.print("*");
	        }
	       	System.out.println();
	    }
		
	}


}
