import java.util.Scanner;
public class swap{
	public static void main(String [] args ){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number 1");
	int a=sc.nextInt();
	int b =sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
}
}