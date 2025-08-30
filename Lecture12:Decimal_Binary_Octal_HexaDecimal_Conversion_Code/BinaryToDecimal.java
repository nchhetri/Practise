import java.util.Scanner;
class BinaryToDecimal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number in Binary: ");
		int num = sc.nextInt();
		
		int rem = 0;
		int res = 0;
		int mul = 1;
		int len = String.valueOf(num).length();
		
		for(int i=0; i<len; i++){
			res += num%10 * mul;
			num /=10;
			mul *= 2;
		}
		System.out.print("result is: "+res);
	}
}