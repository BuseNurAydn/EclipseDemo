package ödev7;

import java.util.Scanner;

public class Main {
	public static int ucgen(int n) {
		for(int i=1;i<=n;i++) {
			for(int k =0;k<n-i;k++) {
				System.out.print(" ");
			}
			for(int m=0;m<2*i-1;m++) {
				System.out.print(i);
			}
		  
			System.out.println();
		}
		return n;
	}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç satırlık üçgen oluşturmak istiyorsunuz:");
		int n = scan.nextInt();
		if(1<n && n>10 ) {
			System.out.println("1 ile 10 arasında katsayı girmediniz.");
		}else {
			System.out.println("1 ile 10 arasında bir sayı girdiniz:");
		
			ucgen(n);
		
				
			}
			
		
		
		

	}

}
