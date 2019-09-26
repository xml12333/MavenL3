//task 2
//"2. Implement the method fight() depending on weight, strength and age of the boxer:
//You should write dependency by yourself. The method should return true or false if our boxer won or lost.
public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        //write your code here
        if (anotherBoxer.age >= 20 && anotherBoxer.age <= 80 && anotherBoxer.age <= this.age+20){
            if (anotherBoxer.weight >= 50 && anotherBoxer.weight <=150 && anotherBoxer.weight <=this.weight+50) {
                if (anotherBoxer.strength > this.strength) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Boxer obj1 = new Boxer(30,80,100);
        Boxer obj2 = new Boxer(40,90,190);
        System.out.println(obj1.fight(obj2));
        System.out.println(obj2.fight(obj1));
    }
}
