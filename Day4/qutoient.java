import java.util.Scanner;
public class qutoient{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number 1");
	int num1 = sc.nextInt();
	System.out.println("Enter a number 2");
	int num2 = sc.nextInt();
	float qut=num1/num2;
	int remainder=num1%num2;
	System.out.println(qut);
	System.out.println(remainder);
}
}
