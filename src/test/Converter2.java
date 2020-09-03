package test;

public class Converter2 {
	public void convert(int num) {
		
		String output = "";
		
		//quadruple digits
		
		if  (num >=1000 && num <=1999 ) {output = (output+"one thousand ");}
		if  (num >=2000 && num <=2999 ) {output = (output +"two thousand ");}
		if  (num >=3000 && num <=3999 ) {output = (output +"three thousand ");}
		if  (num >=4000 && num <=4999 ) {output = (output +"four thousand ");}
		if  (num >=5000 && num <=5999 ) {output = (output +"five thousand ");}
		if  (num >=6000 && num <=6999 ) {output = (output +"six thousand ");}
		if  (num >=7000 && num <=7999 ) {output = (output +"seven thousand ");}
		if  (num >=8000 && num <=8999 ) {output = (output +"eight thousand ");}
		if  (num >=9000 && num <=9999 ) {output = (output +"nine thousand ");}
		
		num = num%1000;
		
		//triple digits
		
		if  (num >=100 && num <=199 ) {output = (output +"one hundred ");}
		if  (num >=200 && num <=299 ) {output = (output +"two hundred ");}
		if  (num >=300 && num <=399 ) {output = (output +"three hundred ");}
		if  (num >=400 && num <=499 ) {output = (output +"four hundred ");}
		if  (num >=500 && num <=599 ) {output = (output +"five hundred ");}
		if  (num >=600 && num <=699 ) {output = (output +"six hundred ");}
		if  (num >=700 && num <=799 ) {output = (output +"seven hundred ");}
		if  (num >=800 && num <=899 ) {output = (output +"eight hundred ");}
		if  (num >=900 && num <=999 ) {output = (output +"nine hundred ");}
		
		num = num%100;
		
		//double digits
		
		if  (num >=20 && num <=29 ) {output = (output +"twenty ");}
		if  (num >=30 && num <=39 ) {output = (output +"thirty ");}
		if  (num >=40 && num <=49 ) {output = (output +"fourty ");}
		if  (num >=50 && num <=59 ) {output = (output +"fifthy ");}
		if  (num >=60 && num <=69 ) {output = (output +"sixty ");}
		if  (num >=70 && num <=79 ) {output = (output +"seventy ");}
		if  (num >=80 && num <=89 ) {output = (output +"eighty ");}
		if  (num >=90 && num <=99 ) {output = (output +"ninety ");}
		
		num = num%10;
		
		//digits up to 20
		if  (num == 1) {output = (output +"one");}
		if  (num == 2) {output = (output +"two");}
		if  (num == 3) {output = (output +"three");}
		if  (num == 4) {output = (output +"four");}
		if  (num == 5) {output = (output +"five");}
		if  (num == 6) {output = (output +"six");}
		if  (num == 7) {output = (output +"seven");}
		if  (num == 8) {output = (output +"eight");}
		if  (num == 9) {output = (output +"nine");}
		if  (num == 10) {output = (output +"ten");}
		if  (num == 11) {output = (output +"eleven");}
		if  (num == 12) {output = (output +"twelve");}
		if  (num == 13) {output = (output +"thirteen");}
		if  (num == 14) {output = (output +"fourteen");}
		if  (num == 15) {output = (output +"fifthteen");}
		if  (num == 16) {output = (output +"sixteen");}
		if  (num == 17) {output = (output +"seventeen");}
		if  (num == 18) {output = (output +"eighteen");}
		if  (num == 19) {output = (output +"nineteen");}
		
		if (output == "") {System.out.println("number out of range");}
		System.out.println(output);

		
		
		
	}
		
}
