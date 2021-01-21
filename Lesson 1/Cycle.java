// public class Cycle {
//     public static void main(String[] args) {
//         for(int i = 0; i < 21; i++) {
//             System.out.println(i);
//         }
//     }
// }


// public class Cycle {
//     public static void main(String[] args) {
//         int i = 6;
//         while(i >= -6) {
//             System.out.println(i);
//             i = i - 2;
//         }
//     }
// }

public class Cycle {
    public static void main(String[] args) {
        int i = 10;
        int result = 0;
        do {
            if(i % 2 == 1) {
                result = result + i;
            }
            i++;
        } while(i <= 20);

        System.out.println(result);
    }
}