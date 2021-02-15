public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jager1 = new Jaeger();
        Jaeger jager2 = new Jaeger();

        jager1.setModelName("Gipsy Danger");
        System.out.println(jager1.getModelName());

        jager1.setMark("Mark-3");
        System.out.println(jager1.getMark());

        jager1.setOrigin("USA");
        System.out.println(jager1.getOrigin());

        jager1.setHeight(79.25f);
        System.out.println(jager1.getHeight());

        jager1.setWeight(1.980f);
        System.out.println(jager1.getWeight());

        jager1.setSpeed(7);
        System.out.println(jager1.getSpeed());

        jager1.setStrengh(8);
        System.out.println(jager1.getStrengh());

        jager1.setArmor(6);
        System.out.println(jager1.getArmor());

        System.out.println(jager1.drift());

        jager1.move();


        System.out.println("");


        jager2.setModelName("Coyote Tango");
        System.out.println(jager2.getModelName());

        jager2.setMark("Mark-1");
        System.out.println(jager2.getMark());

        jager2.setOrigin("Japan");
        System.out.println(jager2.getOrigin());

        jager2.setHeight(85.34f);
        System.out.println(jager2.getHeight());

        jager2.setWeight(2.312f);
        System.out.println(jager2.getWeight());

        jager2.setSpeed(5);
        System.out.println(jager2.getSpeed());

        jager2.setStrengh(7);
        System.out.println(jager2.getStrengh());

        jager2.setArmor(4);
        System.out.println(jager2.getArmor());

        System.out.println(jager2.scanKaiju());

        jager2.useVortexCannon();
    }
}