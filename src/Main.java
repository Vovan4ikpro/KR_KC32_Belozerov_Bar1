public class Main {
    public static void main(String[] args) {

        Permission per = new Permission();
        Helicopter hel = new Helicopter();

        //������� ��������, � ����� ���� ��������� ������������� � �����������
        FacadeFlight flightA = new FacadeFlight(per, hel);
        //� ����� ������� �������� ������, ����� ������, ������ ����������, �������� ��������
        flightA.fly();
        //���� ������� ������������� ��������� �� ����������
        per.Dispatcher(0);
        //������� ����������
        hel.landing();
    }
}
