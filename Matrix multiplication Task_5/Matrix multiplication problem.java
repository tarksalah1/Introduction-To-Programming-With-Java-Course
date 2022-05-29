package navin.com;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		  Scanner Scan = new Scanner (System.in);	
System.out.print("the number of rows and columns of the first matrix respectively : ");
int sum=0;
int rows=Scan.nextInt();
int columns=Scan.nextInt();
System.out.print("the number of rows and columns of the second matrix respectively : ");
int rows2=Scan.nextInt();
int columns2=Scan.nextInt();
int [][] x= new int[rows][columns];
int [][] y= new int[rows2][columns2];
int [][] z= new int[rows][columns2];
if (columns==rows2) {
System.out.print("enter the rows' elements one by one of first matrix :"+" ");
System.out.println();
for (int i=0;i<rows;i++) {
for (int j=0;j<columns;j++) {
x[i][j]=Scan.nextInt();
}
}
System.out.print("enter the rows' elements one by one of Second matrix :"+" ");
System.out.println();
for (int i=0;i<rows2;i++) {
for (int j=0;j<columns2;j++) {
y[i][j]=Scan.nextInt();
}
}
System.out.print("the first matrix cross second matrix :"+" ");
System.out.println();
for (int i=0;i<rows;i++) {
for (int h=0;h<columns2;h++) {	
	sum=0;
for (int j=0;j<columns;j++) {
z[i][j]=(x[i][j])*(y[j][h]);
sum=sum+z[i][j];
}
System.out.print(sum+" ");
}
System.out.println();
}
}
else { System.out.println("that matrices can't be multiplied to each other");}
}
}