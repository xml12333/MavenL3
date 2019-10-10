import java.util.*;

public class Main {


    public static void main(String[] args) throws MyOwnExeption{
        //task 1
        //1. Create method to check: if number < 0 print “Number < 0”,
        // if number > 0 print “Number > 0” if number = 0 throw your own exception
        int number = 1;
        if (number < 0) {
            System.out.println("Number<0");
        } else {
            if (number > 0) {
                System.out.println("Number>0");
            } else {
                throw new MyOwnExeption();
            }
        }

        //task 2
        //"2. Fix the method with try-catch to get the correct result of division:
        //public class Main {
        //
        //    public static void main(String[] args) {
        //        System.out.println(divideByZero());
        //    }
        //
        //    public static int divideByZero() {
        //        int a = 5;
        //        int b = 0;
        //        return a / b;
        //    }
        //}"
        System.out.println(divideByZero());
        //task 3
        //"3. Finish the program to handle all the possible exceptions:
        //public class Main {
        //
        //    public static void main(String[] args) {
        //        int a = args.length;
        //        System.out.println(a);
        //
        //        int b = 10 / a;
        //        int[] c = {1};
        //        System.out.println(c[1]);
        //
        //    }
        //
        //}
        //
        //Print the cause of the exception to the console."
        int a = args.length;
        System.out.println(a);
        try {
            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //task 4
        //"4. Fix the program to make it work:
        //public static void main(String[] args) {
        //        try {
        //            int a = 0;
        //            int b = 4 / a;
        //        } catch (Exception e) {
        //            e.printStackTrace();
        //        } catch (ArithmeticException e) {
        //            e.printStackTrace();
        //        }
        //    }"
        try {
            int x = 0;
            int b = 4 / x;
        } catch (ArithmeticException e) {
           e.printStackTrace();
        }

        //task 5
        //"5. Throw a NullPointerException from the method iCanThrowException();
        //Handle it in the main method.
        //public class Main {
        //
        //    public static void main(String[] args) {
        //        iCanThrowException();
        //    }
        //
        //    public static void iCanThrowException() {
        //
        //    }
        //
        //}"

        //this answer commented because task 6 will not run
        //iCanThrowException();

        //task 6
        //"6. Write a program that will enter numbers from the keyboard.
        //The code for reading numbers from the keyboard must be in the readData method.
        //The code inside the readData is wrapped in a try..catch.
        //If the user entered some text, instead of entering a number, the method should catch the exception and display all previously entered numbers as a result.
        //Numbers output from a new line preserving the order of input."
        readData();

    }
    public static void readData (){
        ArrayList<Integer> x = new ArrayList();
        try {
            while (true){
                Scanner a = new Scanner(System.in);
                x.add(a.nextInt());
            }
        }
        catch (Exception e){
            for (Integer item:x) {
                System.out.println(item);

            }
        }
    }
    public static void iCanThrowException() throws NullPointerException {
            throw new NullPointerException();
            }
    public static int divideByZero() {
        int a = 5;
        int b = 0;
        try {
            return a / b;
        }
        catch (Exception e) {
            return 0;
        }
    }

}


