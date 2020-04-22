import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the decimal number");
		n=sc.nextInt();
		String binary=Integer.toBinaryString(n);
		System.out.println("binary number is"+binary);

	}

}
