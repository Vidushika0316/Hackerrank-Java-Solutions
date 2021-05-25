/*

Java Output Formatting

Java OutputFormattingJava's System.out.printf function can be used to print formatted output. 
The purpose of this exercise is totest your understanding of formatting output using printf.
To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
Input Format: Every line of input will contain a String followed by an integer. 
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.
Output Format: In each line of output there should be two columns: The first column contains the String and is left justified using exactly 15 characters. 
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
Sample Input:
java 100
cpp 65
python 50
Sample Output
================================
java           100
cpp            065
python         050
================================
Explanation: Each String is left-justified with trailing whitespace through the first 15 characters. 
The leading digit of theinteger is the  character, and each integer that was less than  digits now has leading zeroes.
*/


import java.util.Scanner;

public class solution{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);

		System.out.println("================================");
		for(int i=0;i<3;i++) {
			String text=scanner.next();
			int num=scanner.nextInt();

			System.out.printf("%-15s%03d\n",text,num);   /*This is Java's formatter syntax. You can find more about it here.
			                                               In this case, you have 2 parameters, that get formatted.
                                                           First s1 which is formatted using %-15s. The % means that 
                                                           what follows is an argument that will be formatted. Then follows
                                                           a - resulting in left alignment. 15 fills the string up to a 
                                                           length of 15 characters (adding spaces at the end). Finally the s means, 
                                                           that you are formatting a string.
                                                           Second x which is formatted using %03d. Here the 0 is the fill character, 
                                                           meaning that, if necessary, zeros are added. The 3 is again the width, 
                                                           meaning the fill character 0 is added as many times as necessary 
                                                           to make it 3 digits long (this time at the beginning). Finally d means, 
                                                           that a integer is formatted.*/


		}

	}
}

/*
test 1

input======
java 100
cpp 65
python 50

output=====
================================
java           100 
cpp            065 
python         050 
================================

input======
hello 0
hackerrank 65
java 10

output=====
================================
hello          000 
hackerrank     065 
java           010 
================================

Result:Success

 */