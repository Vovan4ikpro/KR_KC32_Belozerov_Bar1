public class FacadeFlight {
    Weather weat;               //стан погоди
    TechnicalCondition tech;    //технічний стан
    Permission per;             //дозвіл диспетчера
    Route rout;                 //побудова маршрута
    Helicopter hel;             //стан гвинтокрила

    public FacadeFlight( Permission per, Helicopter hel){
        this.weat = new Weather();
        this.tech = new TechnicalCondition();
        this.per = per;
        this.rout = new Route();
        this.hel = hel;
    }

    public void fly(){
        if(weat.Statuss() && tech.Statuss()){
            System.out.println("1.Погода та технічний стан вертольота перевірено,все гаразд.");
            per.Dispatcher(1);
            rout.RouteR();
            hel.takeoff();
        }
        else{
            System.out.println("Погода та технічний стан вертольота перевірено, незадовільні");
        }


    }
}
