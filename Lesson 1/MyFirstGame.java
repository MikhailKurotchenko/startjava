public class MyFirstGame {
     public static void main(String[] args) {
        int computer = -1;
        int user = 10;
        if(computer > 0 & computer <= 100) {
            if(computer > user) {
                while(computer > user) {
                    System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������");
                    user++;
                }
            } else if(computer < user) {
                while(computer < user) {
                    System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������");
                    user--;
                }
            }

            System.out.println("�� �������!");

        } else {
            System.out.println("������: �������� computer ������ ���� � ��������� (0;100]");
        }
    }
}