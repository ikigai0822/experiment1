import java.util.Scanner;

public class greatest_of_three {
	public static void main(String[] args) 
	{
	
		int a, b, c ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers");	
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a>b && a>c)
			System.out.println("a is the greatest\n" +  a);
		else if(b>a && b>c)
			System.out.println("b is the greatest\n"+ b);
		else if (c>b && c>a)
			System.out.println("c is the greatest\n"+c);
		System.out.println("Sum of the three no."+(a+b+c));// adding the sum of the three numbers
    }
}
