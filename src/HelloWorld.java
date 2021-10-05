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
    System.out.println("Interger Minimum Value = '" + myMinIntValue);
    System.out.println("Interger Maximum Value = '" + myMaxIntValue);
    System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
    System.out.println("Busted MIN value = " + (myMinIntValue - 1));

    int myMaxIntTest = 2_147_483_647;
    }
}
