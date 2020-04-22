import java.util.*;
public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p,t,r,comp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the price");
		p=sc.nextDouble();
		System.out.println("enter the time");
		t=sc.nextDouble();
		System.out.println("enter the rate");
		r=sc.nextDouble();
		comp=p*Math.pow(1+r/100,t)-p;
		System.out.println("compound interest="+comp);
	}

}
