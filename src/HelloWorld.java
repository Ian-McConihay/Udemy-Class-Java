public class HelloWorld {

    public static void main(String[] args) {
//        System.out.println("Hello, Ian");

//        Primitive types
//        rarely used byte short float
//        commonly used int, double, boolean
//        uncommon long and char


//        int myFirstNumber = (10 + 5) + (2 * 10);
//        int mySecondNumber = 12;
//        int myFirstThird = myFirstNumber * 2;
//        int myTotal = myFirstNumber + mySecondNumber + myFirstThird;
//        System.out.println(myTotal);
//        int myLastOne = myTotal - 1000;
//        System.out.println(myLastOne);


    int  myValue = 10000;
    int  myMinIntValue = Integer.MIN_VALUE;
    int  myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Integer Minimum Value = '" + myMinIntValue);
    System.out.println("Integer Maximum Value = '" + myMaxIntValue);
    System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
    System.out.println("Busted MIN value = " + (myMinIntValue - 1));
//        Integer Minimum Value = '-2147483648
//        Integer Maximum Value = '2147483647
//        A int occupies 32 bits, has a width of 32
    int myMaxIntTest = 2_147_483_647;


    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Max Value = " + (myMaxByteValue));
    System.out.println("Byte Min Value = " + (myMinByteValue));
//        Byte Max Value = 127
//        Byte Min Value = -128
//        A byte occupies 8 bits, has a width of 8
        
        
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short Max Value = " + (myMaxShortValue));
        System.out.println("short Min Value = " + (myMinShortValue));
//        short Max Value = 32767
//        short Min Value = -32768
//        A short occupies 16 bits, has a width of 16
        
    long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Max Value = " + (myMaxLongValue));
        System.out.println("Long Min Value = " + (myMinLongValue));
//        Long Max Value = 9223372036854775807
//        Long Min Value = -9223372036854775808
//        A long occupies 64 bits, has a width of 64

//        Casting
        int myTotal = (myMaxIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
//        Advice always use int(integer) unless you got a perfect reason not too

    byte challengeByte = 100;
    short challengeShort = 1000;
    int challengeInt = 10000;
    long challengeLong = 50000L + 10L * (challengeByte + challengeShort + challengeInt);

    System.out.println(challengeLong);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value = " + myMinFloatValue);
        System.out.println("Float Max Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value = " + myMinDoubleValue);
        System.out.println("Double Max Value = " + myMaxDoubleValue);

//        double is the preferred method and using the letter d on the end instead of (double)
        int myIntValue = 5 / 3;
//        float myFloatValue = (float) 5.25; float goes back 7 places
        float myFloatValue = 5f / 3f;
//        double myDoubleValue = (double) 5.25; double goes back 16 decimal places
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double kiloGram = 0.45359237;
        System.out.println(kiloGram * 45);
        double pi = 3.1416027d;

//        unicode is like a universal binary language
//      char can only have one letter with single quotes
        char myChar = 'D';
        char myUniCode = '\u0044';
        System.out.println(myUniCode);
        System.out.println(myChar);

        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;
        boolean isCustomerOverTwentyOne = true;

        String myString = "This is my String";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2020";
        System.out.println(myString);
        String numberString = "250.55 ";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

//        int operand = 15 + 12;
//       + is the operator and 15, 12 are the operands. = is the assign operator. the literal value is 27

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        result = result * 10;
        System.out.println("2 * 10 = " + result);
        result = result / 5;
        System.out.println("20 / 5 = " + result);
        result = result % 3;
        System.out.println("4 % 3 = " + result);
        result++;
        System.out.println("1 + 1 = " + result);
        result--;
        System.out.println("2 - 1 = " + result);
        result += 2;
        System.out.println("1 + 2 = " + result);
        result *= 10;
        System.out.println("3 * 10 = " + result);
        result /= 3;
        System.out.println("30 / 3 = " + result);
        result -= 2;
        System.out.println("10 - 2 = " + result);




    }
}
