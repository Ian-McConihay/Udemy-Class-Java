public class HelloWorld {

    public static void main(String[] args) {
//        System.out.println("Hello, Ian");

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
    }
}
