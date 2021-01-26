public class Wolf {

    private String sex = "Male";
    public String getSex() {
        return sex;
    }

    private String name;
    public String getName(){
        return name;
    }
    void setName(String name) {
        if (name == "") {
            System.out.println("Пустая строка");
        } else {
            this.name = name;
        }
    }

    private String color = "Grey";
    public String getColor() {
        return color;
    }

    private int weight = 40;
    public int getWeight() {
        return weight;
    }

    private int age;
    public int getAge() {
        return age;
    }
    void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            System.out.println(age);
        }
    }

    public void move() {

    }

    public void sit() {

    }

    public void run() {

    }

    public String hunt() {
        return "The wolf caught a hare";
    }

    public boolean howl() {
        System.out.println("Full moon in the sky");
        return true;
    }
}