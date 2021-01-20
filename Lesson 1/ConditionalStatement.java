public class ConditionalStatement {
     public static void main(String[] args) {
        int age = 21;
        char sex = 'F';
        int growth = 181;
        char firstCharOfName = 'N';
        boolean tr = true;
        boolean fls = false;
        if(age > 20) {
            System.out.println(tr);
        }

        if(sex == 'M') {
            System.out.println('M');
        }

        if(sex != 'M') {
            System.out.println(sex);
        }

        if(growth < 180) {
            System.out.println(fls);
        } 
        else {
            System.out.println(tr);
        }

        if(firstCharOfName == 'M') {
            System.out.println('M');
        } else if(firstCharOfName == 'I') {
            System.out.println('I');
        }
        else {
            System.out.println(firstCharOfName);
        }
    }
}