/*Java Loops II

We use the integers a,b , and n to create the following series:
         (a +  2^0.b),(a  + 2^0.b+2^1.b),...,(a  + 2^0.b+ 2^1.b+...+ 2^{n-1}.b)
You are given q queries in the form of a,b , and n . For each query, print the series corresponding 
to the given a,b , and n  values as a single line of  space-separated integers.

Input Format

The first line contains an integer,q , denoting the number of queries.
Each line i of the  q subsequent lines contains three space-separated integers describing the 
respective a,b , and n  values for that query.

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in 
order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/


import java.util.Scanner;
import java.lang.Math;

public class Loop_II{
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        
        int q=myScanner.nextInt();
        
        
        for(int i=1;i<=q;i++){
            int a=myScanner.nextInt();
            int b=myScanner.nextInt();
            int n=myScanner.nextInt();
            
            
            for(int j=0;j<n;j++){
                a= a + (int)Math.pow(2,j)*b;
                System.out.print(a + " ");
            }
            System.out.println("");
            
        }
    }
}
/*
test 1

input======
2
0 2 10
5 3 5

output=====
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

test 2
input======
3
3 3 3
0 0 5
6 6 10

output=====
6 12 24
0 0 0 0 0
12 24 48 96 192 384 768 1536 3072 6144


Result:Success

 */