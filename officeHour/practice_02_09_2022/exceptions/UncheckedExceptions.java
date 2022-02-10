package practice_02_09_2022.exceptions;

public class UncheckedExceptions {

    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5}; // com+opt+T

        System.out.println("Test 1 is started");
        try {
            System.out.println(number[10]);
        }

        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException is Handled");
        }

        catch (RuntimeException e) {
            System.out.println("RuntimeException is Handled");
            e.printStackTrace();  // to see full Report for exception
            //  System.out.println("e.getMessage() = " + e.getMessage());

        }

        System.out.println("Test 1 is Passed");


    }
}
