  
package navin.com;

import java.util.Scanner;

public class Kjlk {

	public static void main(String[] args) {
Scanner Scan = new Scanner(System.in);
        int x=Scan.nextInt();
		for (int j=1;j<=x;j++) {
		for(int i=1;i<=j;i++) {	
		int	y=i*j;
			System.out.print(y+" ");
		}
		System.out.println();
		}
Scan.close();
		}
}
