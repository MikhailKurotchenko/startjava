public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public boolean setNumber(int number) {
        if(number <= 0 || number > 100) {
            System.out.println("Ошибка: число должно быть в диапазоне (0; 100]");
            return false;
        } else {
            this.number = number;
            return true;
        }
    }

    public int getNumber() {
        return number;
    }

     public String getName() {
        return name;
    }
}