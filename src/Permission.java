public class Permission {
    int a =  0;
    int b = 0;
    int c = 0;

    public void Dispatcher(int temp){
        if (temp == 0) {
            System.out.println("5.Даємо добро на посадку");
            a = 1;
            b = 2;
            c = 3;
        }
        if (temp == 1){
            System.out.println("2.Даємо добро на зліт");
            a = 3;
            b = 2;
            c = 1;
        }

    }

}
