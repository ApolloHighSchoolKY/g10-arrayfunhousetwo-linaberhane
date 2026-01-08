//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class Lab14b
{
	public static void main( String args[] )
	{
		int[] one = {1,2,3,4,5,6,7,8,9,10};
		int[] two = {1,2,3,9,11,20,30};
		int[] three = {5,11,81,81};
		int[] four = {17,13,9,8,2};
		int[] five = {4,7,2,0,9};
		//add more test cases


		System.out.println(Arrays.toString(one));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(two));
		System.out.println(Arrays.toString(three));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(three));
		System.out.println(Arrays.toString(four));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(four));
		System.out.println(Arrays.toString(five));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(five));
		//add more test cases

		System.out.println("\n\n"+Arrays.toString(one));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(two));
		System.out.println(Arrays.toString(three));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(three));
		System.out.println(Arrays.toString(four));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(four));
		System.out.println(Arrays.toString(five));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(five));
		//add more test cases

		System.out.println("\n\nfirst 3 values greater than 8: " + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(two,3,8))  );

	}
}