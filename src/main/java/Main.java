import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("TASK 1");
        System.out.println("1 string");
        System.out.println("2 string");
        System.out.println("3 string");
        System.out.println("4 string");
        System.out.println("5 string");
        //task2
        System.out.println("TASK 2");
        boolean a2 = true;
        byte b2 = 100;
        char c2 = 'a';
        short d2 = 255;
        int e2 = 10000;
        long f2 = 66000;
        float g2 = 5.14f;
        double h2 = 6.9999999995;

        //task 3
        System.out.println("TASK 3");
        int a3 = 5;
        int b3 = 5;

        System.out.println("Area of a rectangle a*b =" + a3 * b3);

        //task 4
        //4. Fix the program to get the correct result:
        System.out.println("TASK 4");
        int a4 = 5;
        int b4 = 10;
        float result4 = a4 / b4;
        System.out.println(result4);

        // task 5
        //"5. Change the operations  to get the result 20:
        System.out.println("TASK 5");
        int a5 = 1;
        int b5 = 3;
        int c5 = 9;
        int d5 = 27;

        int result5 = (-a5 + (b5 - c5)) + (d5);

        System.out.println(result5);

        //task 6
        //"6. Comment redundant strings to get the output ""Happy Java Learning"":
        System.out.println("TASK 6");
        //String s6 = ""Java"";
        //System.out.println(""Happy"");
        //System.out.println(""Java Learning"");
        //System.out.println(""programming"");
        System.out.print("Happy Java");
        //System.out.println(""weekend"");
        //System.out.println(s);
        //System.out.print(""Python"");
        System.out.print(" ");
        System.out.println("Learning");

        //task 7
        //"7. Comment variables which are never used.
        System.out.println("TASK 7");
        int a = 10;
        int b = 15;
        double c = b + 38;
        //int d = a + 12;
        //double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
        //String s2 = ""a"";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);

        //task 8
        //"8*. Write a program which prints ""Hello world"" to the console using methods transformIntToChar and printList only.
        // write your code here
        System.out.println("TASK 8");
        Main obj = new Main();
        obj.printList(obj.transformIntToChar(72));
        obj.printList(obj.transformIntToChar(101 ));
        obj.printList(obj.transformIntToChar(108 ));
        obj.printList(obj.transformIntToChar(108 ));
        obj.printList(obj.transformIntToChar(111 ));
        obj.printList(obj.transformIntToChar(32 ));
        obj.printList(obj.transformIntToChar(119 ));
        obj.printList(obj.transformIntToChar(111 ));
        obj.printList(obj.transformIntToChar(114 ));
        obj.printList(obj.transformIntToChar(108 ));
        obj.printList(obj.transformIntToChar(100 ));



    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }

}
