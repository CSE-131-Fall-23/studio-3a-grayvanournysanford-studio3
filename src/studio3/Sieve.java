package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array max number: ");
		int n = in.nextInt();
		boolean[] primes = new boolean[n-1];
		for (int i=2; i<=Math.sqrt(n); i++){
			if(primes[i]==true) {
				for(int j= i*i;j<=n;j=j+i) {
					primes[j]=false;
					System.out.println(primes[j]==false);
				}
			}
		}
		for (boolean primes[]:)
{
	
}
	}

}
