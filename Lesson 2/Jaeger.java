public class Jaeger {
    public String modelName;
    public String mark;
    public String origin;
    public float height;
    public float weight;
    public int speed;
    public int strengh;
    public int armor;

    public Jaeger(String modelName, String mark, String origin,
float height, float weight, int speed, int strengh, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strengh = strengh;
        this.armor = armor;
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы сделали 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {

    }
}