public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strengh;
    private int armor;

    public String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        if(modelName == "") {
            System.out.println("Ошибка: пустая строка");
        } else {
            this.modelName = modelName;
        }
    }

    public String getMark() {
        return mark;
    }

    void setMark(String mark) {
        if(mark == "") {
            System.out.println("Ошибка: пустая строка");
        } else {
            this.mark = mark;
        }
    }

    public String getOrigin() {
        return origin;
    }

    void setOrigin(String origin) {
        if(origin == "") {
            System.out.println("Ошибка: пустая строка");
        } else {
            this.origin = origin;
        }
    }

    public float getHeight() {
        return height;
    }

    void setHeight(float height) {
        if(height < 0.0 || height > 200.0) {
            System.out.println("Ошибка: недопустимый размер");
        } else {
            this.height = height;
        }
    }

    public float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        if(weight < 0.0 || weight > 100.0) {
            System.out.println("Ошибка: недопустимая масса");
        } else {
            this.weight = weight;
        }
    }

    public int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        if(speed <= 0 || speed > 2000) {
            System.out.println("Ошибка: недопустимая скорость");
        } else {
            this.speed = speed;
        }
    }

    public int getStrengh() {
        return strengh;
    }

    void setStrengh(int strengh) {
        if(strengh <= 0 || strengh > 20) {
            System.out.println("Ошибка: недопустимая величина");
        } else {
            this.strengh = strengh;
        }
    }

    public int getArmor() {
        return armor;
    }

    void setArmor(int armor) {
        if(armor <= 0 || armor > 20) {
            System.out.println("Ошибка: недопустимая величина");
        } else {
            this.armor = armor;
        }
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