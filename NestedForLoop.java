/**
 * 
 */
package Practicing2ndYear;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class NestedForLoop {

	public static void main(String[] args) {
		
		// using Nested For Loop 
		for(int k = 1; k <= 10; k++)
		{
			System.out.print("\t" + k);
		}
		
		System.out.println();
		
		for(int i = 1; i < 11; i++)
		{
			System.out.print(i);
			for(int j = 1; j < 11; j++)
			{	
				System.out.print("\t" + i * j);
			}
			System.out.println();
		}
		
	}

}
