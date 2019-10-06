import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task 2
        //2. Create ENUM and print.
        for (NotebookBrand brand : NotebookBrand.values()) {
            System.out.println(brand);
        }
        //task 3
        //C3. Create Map vehicles : vehicles.put("BMW", 5);, print
        HashMap<String, Integer> vehicles = new HashMap<String, Integer>();
        vehicles.put("BMW", 5);
        System.out.println(vehicles.get("BMW"));
        //task 7
        //"7. Create HashMap<String, String> and add 10 pairs:
        // watermelon, berry;
        // banana, fruit;
        // cherry, berry;
        // pineapple, fruit;
        // melon, vegetable;
        // cranberry, berry;
        // apple, fruit;
        // iris, flower;
        // potato, vegetable;
        // carrot, vegetable;
        //
        //Print the content of the map, each pair from a new line.
        //Example:
        //watermelon - berry;
        //cherry - berry;
        //..."
        HashMap<String, String> content = new HashMap<String, String>();
        content.put("watermelon", "berry");
        content.put("banana", "fruit");
        content.put("cherry", "berry");
        content.put("pineapple", "fruit");
        content.put("melon", "vegetable");
        content.put("cranberry", "berry");
        content.put("apple", "fruit");
        content.put("iris", "flower");
        content.put("potato", "vegetable");
        content.put("carrot", "vegetable");
        for (String item : content.keySet()) {
            System.out.println(item+" "+content.get(item));
        }
        //task 8
        //"8. Create HashMap<String, String> and add 10 pairs:
        // watermelon, berry;
        // banana, fruit;
        // cherry, berry;
        // pineapple, fruit;
        // melon, vegetable;
        // cranberry, berry;
        // apple, fruit;
        // iris, flower;
        // potato, vegetable;
        // carrot, vegetable;
        // Print only vegetables to the console."
        System.out.println("-------------------");
        HashMap<String, String> content1 = new HashMap<String, String>();
        content1.put("watermelon", "berry");
        content1.put("banana", "fruit");
        content1.put("cherry", "berry");
        content1.put("pineapple", "fruit");
        content1.put("melon", "vegetable");
        content1.put("cranberry", "berry");
        content1.put("apple", "fruit");
        content1.put("iris", "flower");
        content1.put("potato", "vegetable");
        content1.put("carrot", "vegetable");
        for (Map.Entry<String,String> item : content.entrySet()) {
            if (item.getValue() == "vegetable"){
                System.out.println(item);
            }
        }

        //task 10
        //"10. Create enum for days of the week.
        // Write a program which will be printing the number of a day according to day of the week.
        // Example:
        //If today is Sunday - print 1;
        //If today is Monday - print 2
        //..."
        Days day = Days.UN;
        switch (day) {
            case MON:
                System.out.println(1);
                break;
            case THU:
                System.out.println(2);
                break;
            case WEN:
                System.out.println(3);
                break;
            case THI:
                System.out.println(4);
                break;
            case FRI:
                System.out.println(5);
                break;
            case SUT:
                System.out.println(6);
                break;
            case SUN:
                System.out.println(7);
                break;
            default:
                System.out.println("budun");
                break;
        }

    }
}



