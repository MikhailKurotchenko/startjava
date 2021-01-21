public class ConditionalStatement {
     public static void main(String[] args) {
        int age = 21;
        boolean isOverTwenty = true;
        if(age > 20) {
            System.out.println(isOverTwenty);
        }

        char sex = 'F';
        if(sex == 'M') {
            System.out.println('M');
        }

        if(sex != 'M') {
            System.out.println(sex);
        }

        int growth = 181;
        boolean isTaller = true;
        boolean isNotTaller = false;
        if(growth < 180) {
            System.out.println(isNotTaller);
        } else {
            System.out.println(isTaller);
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