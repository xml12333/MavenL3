import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task 1
        double v1,v2,t1,t2,k1,k2;
        v1=100;
        v2=50;
        t1 = 36.6;
        t2 = 38;
        k1 = v1/v2;
        k2 = t1/t2;
        System.out.println("V="+(v1+v2)/2*k1);
        System.out.println("T="+(t1+t2)/2*k2);
        //task 2
        double evro,dollar,funt;
        evro = 35.38802342;
        dollar = 23.234231344234;
        funt = 45.23412345;
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter summ:");
        double summ = obj.nextDouble();
        System.out.println("In evro summ:"+ summ*evro);
        System.out.println("In dollar summ:"+ summ*dollar);
        System.out.println("In funt summ:"+ summ*funt);
        //task 3
        int a,b,a4,a6;
        a = 125;
        b = a*a;
        a4 = b*b;
        a6= b*b*b;
        //task 4
        int a1=100;
        int b2=200;
        int c;

        c = a1;
        a1 = b2;
        b2 = c;

        a1 = a1+b2;
        b2 = a1-b2;
        a1 = a1-b2;



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


