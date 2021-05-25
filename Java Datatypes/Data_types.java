/*
Java Datatypes

Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

Input Format

The first line contains an integer,T, denoting the number of test cases.
Each test case,T, is comprised of a single line with an integer,n , which can be arbitrarily large or small.

Output Format

For each input variable  and appropriate primitive datatype , you must determine if the given primitives are capable of storing it. If yes, then print:

n can be fitted in:
* dataType

If the number cannot be stored in one of the four aforementioned primitives, print the line:

n can't be fitted anywhere.


*/

import java.util.Scanner;

public class Data_types{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);

		int n=scanner.nextInt();

		for(int i=0;i<n;i++){
			try{
				long x=scanner.nextLong();
				System.out.println(x + " can be fitted in:");
				if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE){
					System.out.println("* byte");
				}
				if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){
					System.out.println("* short");
				}
				if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){
					System.out.println("* int");
				}
				if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
					System.out.println("* long");
				}
			}
			catch (Exception e){
				System.out.println(scanner.next() + " can't be fitted anywhere.");
			}
		}
	}
}

/*
test 1

input======
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000

output=====
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long


Result:Success

 */