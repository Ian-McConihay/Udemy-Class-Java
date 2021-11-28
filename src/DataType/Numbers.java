package DataType;

import java.math.BigDecimal;

public class Numbers {
	public static void main(String[] args) {
		int apples = 10;
		int pears = 16;
		double applePrice = 3.14;
		double pearPrice = 2.20;
		boolean moreApples;
		boolean applesAreDearer;

		moreApples = (apples > pears);
		applesAreDearer = (applePrice > pearPrice);
		System.out.printf("We have more apples: %s %n", moreApples);
		System.out.printf("Apples are dearer: %s %n", applesAreDearer);
		System.out.printf("Reducing cost of apples: %s %n", (moreApples && applesAreDearer));
		System.out.printf("Reducing cost of apples: %s %n", (moreApples || applesAreDearer));
//		boolean check = apple + pear == 4;
//		System.out.println(check);
//		System.out.println(!check);

//		System.out.printf("Reducing apple cost: %s %n", (apples > pears) || (applePrice > pearPrice));


//		BigDecimal oneTenth = BigDecimal.valueOf(0.1);
//		BigDecimal result1 = oneTenth.multiply(BigDecimal.valueOf(7));
//		BigDecimal result2 = oneTenth.add(oneTenth
//				.add(oneTenth)
//				.add(oneTenth));
//		BigDecimal difference = result1.subtract(result2);
//		System.out.printf("The difference is %.99f %n", difference);





	}

}
