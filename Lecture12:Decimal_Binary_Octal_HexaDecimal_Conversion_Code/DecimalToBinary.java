import java.util.Scanner;
class DecimalToBinary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number in Decimal: ");
		int num = sc.nextInt();
		
		int rem = 0;
		int res = 0;
		int mul = 1;
		
		while(num > 0){
			res += num%2 * mul;
			num = num/2;
			mul *= 10;
		}
		System.out.print("result is: "+res);
	}
}
