public class MyFirstGame {
     public static void main(String[] args) {
        int computerNum = -1;
        int userNum = 10;
        if(computerNum > 0 & computerNum <= 100) {
            if(computerNum > userNum) {
                while(computerNum > userNum) {
                    System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������");
                    userNum++;
                }
            } else if(computerNum < userNum) {
                while(computerNum < userNum) {
                    System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������");
                    userNum--;
                }
            }

            System.out.println("�� �������!");

        } else {
            System.out.println("������: �������� computerNum ������ ���� � ��������� (0;100]");
        }
    }
}