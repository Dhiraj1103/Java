import java.util.Scanner;
class VowelCheck{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String: ");
		String str=sc.next();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
				System.out.println(str.charAt(i));
			}
		}


	}
}