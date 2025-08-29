import java.util.Scanner;
class DecimalToBinary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number in Decimal: ");
		int num = sc.nextInt();
		
		StringBuilder res = new StringBuilder("");
		while(num != 0){
			res.insert(0,num %2);
			num = num/2;
		}
		
		System.out.print("result is: "+res);
	}
}
