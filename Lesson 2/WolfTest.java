public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        System.out.println(wolfOne.getSex());

        wolfOne.setName("Zxy");
        System.out.println(wolfOne.getName());

        System.out.println(wolfOne.getColor());

        System.out.println(wolfOne.getWeight());

        wolfOne.setAge(6);
        System.out.println(wolfOne.getAge());
    }
}