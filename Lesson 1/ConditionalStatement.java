public class ConditionalStatement {
     public static void main(String[] args) {
        int age = 21;
        if(age > 20) {
            System.out.println(true);
        }

        char sex = 'F';
        if(sex == 'M') {
            System.out.println('M');
        }

        if(sex != 'M') {
            System.out.println(sex);
        }

        int growth = 181;
        if(growth < 180) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        char firstNameLetter = 'N';
        if(firstNameLetter == 'M') {
            System.out.println('M');
        } else if(firstNameLetter == 'I') {
            System.out.println('I');
        } else {
            System.out.println(firstNameLetter);
        }
    }
}