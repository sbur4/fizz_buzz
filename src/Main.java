/**
 * Print integers 1 to N, but print “Fizz” if an integer is divisible by 3,
 * “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is
 * divisible by both 3 and 5.
 */

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": " + "FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + ": " + "Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + ": " + "Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}