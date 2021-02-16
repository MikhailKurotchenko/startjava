public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jager1 = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 6);
        Jaeger jager2 = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2.312f, 5, 7, 4);

        System.out.println(jager1.modelName);

        System.out.println(jager1.mark);

        System.out.println(jager1.origin);

        System.out.println(jager1.height);

        System.out.println(jager1.weight);

        System.out.println(jager1.speed);

        System.out.println(jager1.strengh);

        System.out.println(jager1.armor);


        System.out.println("");


        System.out.println(jager2.modelName);

        System.out.println(jager2.mark);

        System.out.println(jager2.origin);

        System.out.println(jager2.height);

        System.out.println(jager2.weight);

        System.out.println(jager2.speed);

        System.out.println(jager2.strengh);
        
        System.out.println(jager2.armor);
    }
}