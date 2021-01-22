public class ConditionalStatement {
     public static void main(String[] args) {
        int age = 21;
        if(age > 20) {
            System.out.println("Вы старше 20 лет");
        }

        char sex = 'F';
        if(sex == 'M') {
            System.out.println("Вы мужчина");
        }

        if(sex != 'M') {
            System.out.println("Вы женщина");
        }

        int growth = 181;
        if(growth < 180) {
            System.out.println("Вы невысокий человек");
        } else {
            System.out.println("Вы высокий человек");
        }

        char firstNameLetter = 'N';
        if(firstNameLetter == 'M') {
            System.out.println("Ваше имя начинается на 'M'");
        } else if(firstNameLetter == 'I') {
            System.out.println("Ваше имя начинается на 'I'");
        } else {
            System.out.println("Ваше имя начинается на " + firstNameLetter);
        }
    }
}