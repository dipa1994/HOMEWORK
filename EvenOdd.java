package Homework;

public class EvenOdd {
    public static void main(String[] args) {
        int i = 7;
        int Number = i % 2; //The % operator returns the remainder of two numbers

        if (Number == 0)
        {
            System.out.println("The Number is EVEN");
        } else
        {
            System.out.println("The Number is ODD");
        }

    }
}