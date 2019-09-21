import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //task 1
        //"1. Print numbers from 10 to 20 using all known cycles.
        int a = 10;
        int b = 20;
        while (a <= b) {
            System.out.println(a++);
        }
        a = 10;
        do {
            System.out.println(a++);
        } while (a <= b);

        for (a = 10; a <= b; a++) {
            System.out.println(a);
        }
        int[] c = new int[11];
        int d = 10;
        for (int i : c) {
            System.out.println(d++);
        }
        //task 2
        //"2. Print all the numbers from 1 to 100, which are divided by 3 without a remainder.
        int e;
        for (e = 1; e <= 100; e++) {
            if (e % 3 == 0) {
                System.out.println(e);
            }
        }
        //task 3
        //"3. Fill the array with numbers from 100 to 0.
        int[] f = new int[101];
        int g = 0;
        for (int k = 100; k >= 0; k--)
        {
            f[g] = k;
            //System.out.println(f[g]);
            g++;

        }
        //task 4
        //4. Given an array of 10 integers. To display the sum of all its elements except the first and last.
        int[] l = new int[10];
        for (int i =0;i<10;i++){
            l[i]=i;
//            System.out.println(l[i]);
        }
        int n =0;
        for (int m=0;m<10;m++){
            if (m==0||m==9)
            {
                continue;
            }
            n=n+l[m];
        }
        System.out.println(n);

        //task 5
        //"5. Write a function which calculates and returns the minimum of 4 arguments.
        Main obj = new Main();
        System.out.println(obj.min(100,9,10,11));

        //task 6
        //6. Write a method named getEvenDigitSum with one parameter of the type "int".
        // The method should return the sum of even digits within the number.
        // If the number is negative, method should return -1;
        System.out.println(getEvenDigitSum(9));

        //task 7
        // "7. Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
        //If one of the parameters is < 10, method should return -1 to indicate an invalid value.
        //The method should return the greatest common divisor of two numbers."
        System.out.println(getGreatestCommonDivisor(18,30));
    }
    public static int min(int a, int b, int c, int d) {
        if (min(a,b)==b){a = b;}
        if (min(a,c)==c){a = c;}
        if (min(a,d)==d){a = d;}
        return a;
    }
    public static int min(int a, int b) {
        if (a < b){return a;}
        else {return b;}
    }

    public static int getEvenDigitSum(int a){
        if (a<0 ) {
            return -1;
        }

        int[] evenArray = fillEvenDigit(a);
        int result = 0;
        for (int i : evenArray) {
            result = result + evenArray[i];
        }
        return result;
    }
    public static int[] fillEvenDigit(int a){
        int [] array = new int[a+1];
        for (int e = 1; e <= a; e++) {
            if (e % 2 == 0) {
                array[e] = e;
            }
        }
        return array;
    }

    public static int getGreatestCommonDivisor(int a, int b){
        if (a<10||b<10) {
            return -1;
        }
        int result = 0;
        int mm = min(a,b);
        int[] m1 = returnDivisorArray(a);
        int[] m2 = returnDivisorArray(b);
        for(int i=0;i<=mm;i++){
            if(m1[i]!=0 && m2[i]!=0 && m1[i]==m2[i]){
                result = i;
            }
//            System.out.print(m1[i]);
//            System.out.print(",");
//            System.out.println(m2[i]);
        }
        return result;
    }
    public static int[] returnDivisorArray(int a){
        int[] m = new int[a+1];
        for(int i = 1;i<=a;i++){
            if(a%i==0){
            m[i]=i;}
        }
        return m;
    }

}


