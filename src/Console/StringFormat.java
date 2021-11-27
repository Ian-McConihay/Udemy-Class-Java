package Console;

import java.text.NumberFormat;

public class StringFormat {
	public static void main(String[] args){
//		NumberFormat is an abstract class that extends java.text.Format
//		getCurrencyInstance changes numbers to read out as a float with a dollar sign
//
//		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
////		currencyFormat.setMinimumFractionDigits(3);
//		String apples = "Apples";
//		int appleQty = 8;
//		int applePrice = 100;
//		String oranges = "Oranges";
//		int orangeQty = 12;
//		int orangePrice = 80;
//
//		String column1Heading = "Fruit";
//		String column2Heading = "Quantity";
//		String column3Heading = "Price";
//
//		System.out.printf("%-12s %8s %6s%n", column1Heading, column2Heading, column3Heading );
//		System.out.printf("%-12s %-8d %6s %n", apples, appleQty ,currencyFormat.format(applePrice / 100.0));
//		System.out.printf("%-12s %-8d %6s %n", oranges, orangeQty ,currencyFormat.format(orangePrice / 100.0));

		System.out.printf("PI is %f %n", Math.PI);
		System.out.printf("PI is %.3f %n", Math.PI);
		System.out.printf("PI is %.0f %n", Math.PI);
		System.out.printf("PI is %.12f %n", Math.PI);
		System.out.printf("PI is %.99f %n", Math.PI);
	}
}
// - aligns to the left, + align to the right
// the numbers count as spacing
//