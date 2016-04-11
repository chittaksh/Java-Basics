package basic;

import java.util.Scanner;

public class Main
{
	static int getGCD(int a, int b)
	{
		if(a==0 || b==0)
			return a+b;
		
		return getGCD(b, a%b);
	}
	
	public static int[] getCoprimeCount(int[] A){
		int[] B = new int[A.length];
		
		for(int i=0; i< A.length; i++){
			int count =0;
			for(int j=0; j<A[i];j++){
				int c = getGCD(A[i], j);
				
				if(c==1)
					count++;
			}
			B[i] = count;
		}
		return B;
	}
	 
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] B;
		
		for(int i=0;i<n;i++){
			A[i] = sc.nextInt();
		}
		
		B = getCoprimeCount(A);
		
		for(int j =0 ; j<B.length;j++){
			System.out.println(B[j]);
		}
	}
}
