public class WolfTest {
    public static void main(String[] args) {
    Wolf wolfOne = new Wolf();

    wolfOne.sex = "Male";
    System.out.println(wolfOne.sex);

    wolfOne.name = "Tuzik";
    System.out.println(wolfOne.name);

    wolfOne.color = "Grey";
    System.out.println(wolfOne.color);

    wolfOne.weight = 60;
    System.out.println(wolfOne.weight);

    wolfOne.age = 5;
    System.out.println(wolfOne.age);

    wolfOne.howl();

    System.out.println(wolfOne.hunt());
    }
}