public class Main {
    public static void main(String[] args) {

        Permission per = new Permission();
        Helicopter hel = new Helicopter();

        //передаю елементи, з якими хочу працювати безпосередньо в майбутньому
        FacadeFlight flightA = new FacadeFlight(per, hel);
        //у фасаді виконую перевірку погоди, стану техніки, рішення диспетчера, побудова маршрута
        flightA.fly();
        //коли потрібно безпосередньо звертаюся до диспетчера
        per.Dispatcher(0);
        //вимикаю гвинтокрил
        hel.landing();
    }
}
