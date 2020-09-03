package test;

public class Test {

	public static void main(String[] args) {
		int num = 273;

		System.out.println(num/100); //prints first digit
		System.out.println((num%100)/10); //prints second digit
		System.out.println(num%10); //prints third digit
		
		System.out.println((num/100)+((num%100)/10)+(num%10)); //adds together each digit

	}

}
