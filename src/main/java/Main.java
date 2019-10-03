import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        //task 1
        ArrayList<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        //task 4
        //Create an array of 15 random integers from the segment [0;   9].
        // Display the array on the screen. Count how many in the array of even elements and
        // display this number on the screen on a separate line.
        int A[] = new int[15];
        int B[] = new int[15];
        for (int i = 0; i < A.length; i++) {
            A[i] = randomWithRange(0, 9);
            System.out.print(A[i]);
            if (A[i] % 2 == 0) {
                B[i] = A[i];
            }
        }
        System.out.println();
        for(int i=0; i<B.length;i++) {
            if (B[i] != 0) {
                System.out.println(B[i]);
            }
        }
        //task 5
        //"5. Create ArrayList of Strings. Add 5 different Strings to it.
        //Using any cycle print all the values of the ArrayList to the console."
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");
        list2.add("Four");
        System.out.println();
        System.out.println(list2.size());
        for (int i = 0; i < list2.size(); i++)
            System.out.println(list2.get(i));

        //task 6
        //"6. Create ArrayList of Strings. Add 10 different Strings to it.
        //Using any cycle find the longest String in the list and print it out.
        //If there are several String with the same legth - print each from a new line."
        ArrayList<String> list3 = new ArrayList<String>();
        for(int i = 0; i<=10; i++)
            list3.add("String "+i);
        int max = 0;
        int x;
        for(int i = 1; i<11;i++){
            x = list3.get(i).length();
            if (max < x) {
                max = x;
            }
        }
        for (int i = 1; i<11;i++) {
            x = list3.get(i).length();
            if (max == x) {
                System.out.println(list3.get(i));
            }
        }
        //task 9
        //"9. Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
        //Create HashSet<Integer> and add all unique numbers from the ArrayList."
        ArrayList<Integer> int1 = new ArrayList<Integer>();
        Set intHashSet = new HashSet();
        System.out.println();
        for(int i=0;i<100;i++) {
            int1.add(randomWithRange(0,1000));
            System.out.print(int1.get(i) +" ");
            intHashSet.add(int1.get(i));
        }
        retrieveValuesFromListMethod1(intHashSet);

    }

    public static void retrieveValuesFromListMethod1(Set set)
    {
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

    private static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}


