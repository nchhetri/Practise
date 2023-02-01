// git practise

public class Practise
{
	public void add()
	{
		System.out.println("add");
	}
	public static void main(String args[])
	{
		int choice;
		for (int i=1; i<=2; i++)
		{
			choice = i; 
			switch (choice)
			{
				case 1:
					int a = 10;
					System.out.println(a);
					break;
				case 2:
					a = 20;
					System.out.println(a);
					break;
			}
			System.out.println("Merge experiment"); // hello world
		}
	}
}

