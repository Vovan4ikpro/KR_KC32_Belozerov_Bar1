public class Helicopter {
    private int engine = 0;
    public void takeoff(){
        System.out.println("4.Запускаємо гвинтокрил і злітаємо");
        engine = 1;
    }
    public void landing(){
        System.out.println("6.Йдемо на посадку та відключаємо гвинтокрил");
        engine = 0;
    }
}
