package se.Lexicon;

import java.util.Scanner;

public class App<Public>
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args ) {
        int operator = -1;
        boolean loop = true;

        while(loop) {
            System.out.println("Calculator");
            System.out.println("Make an option:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Quit");
            operator = scanner.nextInt();

            switch (operator) {
                case 1:
                    makeAddition();
                    break;
                case 2:
                    makeSubtraction();
                    break;
                case 3:
                    makeMultiplication();
                    break;
                case 4:
                    makeDivision();
                    break;
                case 5:
                    makeModulus();
                    break;
                case 6:
                    loop = false;
                    break;
                default:
                    System.out.println("Error");
            }//End of Switch
        }//End of While
    }//End of main
    public static int getNumber(String nameOfNumber)
    {
        System.out.println("Enter " + nameOfNumber + " number ");
        return scanner.nextInt();
    }
    public static int makeAddition(){
        int numberOne;
        int numberTwo;
        String result = "Your result is\n";
        numberOne = getNumber("first");
        numberTwo = getNumber("second");
        System.out.println(result + (numberOne+numberTwo));
        return numberOne+numberTwo;
    }
    public static int makeSubtraction(){
        int numberOne;
        int numberTwo;
        String result = "Your result is\n";
        numberOne = getNumber("first");
        numberTwo = getNumber("second");
        System.out.println(result + (numberOne-numberTwo));
        return numberOne-numberTwo;
    }
    public static int makeDivision(){
        int numberOne;
        int numberTwo;
        String result = "Your result is\n";
        numberOne = getNumber("first");
        numberTwo = getNumber("second");
        System.out.println(result +(numberOne/numberTwo));
        return numberOne/numberTwo;
    }
    public static int makeMultiplication(){
        int numberOne;
        int numberTwo;
        String result = "Your result is\n";
        numberOne = getNumber("first");
        numberTwo = getNumber("second");
        System.out.println(result + (numberOne*numberTwo));
        return numberOne*numberTwo;
    }
    public static int makeModulus(){
        int numberOne;
        int numberTwo;
        String result = "Your result is\n";
        numberOne = getNumber("first");
        numberTwo = getNumber("second");
        System.out.println(result +(numberOne%numberTwo));
        return numberOne%numberTwo;
    }//End of methods
}//End of app