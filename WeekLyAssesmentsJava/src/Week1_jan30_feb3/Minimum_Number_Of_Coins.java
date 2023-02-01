package Week1_jan30_feb3;

/*Return The Coins Combination With The Minimum Number Of Coins
Given a value V, if we want to make change for V cents, and we have an infinite supply
of each of C = { C1, C2, .. , Cm} valued coins, what is the minimum number of coins to
make the change?
For example:
● Given coins[] = {25, 10, 5}, V = 30, the answer is 2 coins, which is combined with
one coin of 25 cents and one of 5 cents
● Given coins[] = {9, 6, 5, 1}, V = 11, the answer is 2 coins, which is combined with
one coin of 6 cents and one of 5 cents*/

import java.lang.Math;

public class Minimum_Number_Of_Coins {
	
	public static int Minimum_Coins(int[] arr,int v) {
		int count,sum;
		int min=arr.length+1;
	
		//using subsets of array to find the sum and length of array
		int l=arr.length;
		for(int i=0;i<Math.pow(2, l);i++) {
			int a[]=new int[l];
			count=0;
			sum=0;
			for(int j=0;j<l;j++) {
				if((i & (int)(Math.pow(2,j)))>0){
					sum=sum+arr[j];
					count+=1;
					
					
				}
			}
			if(sum==v && count<min) {
				min=count;
			}
			
		}
		return min;
		
	}

	public static void main(String[] args) {
		
		int[] arr= {9,6,5,1};
		int v=11;
		System.out.println(Minimum_Coins(arr,v));
		// TODO Auto-generated method stub

	}

}
