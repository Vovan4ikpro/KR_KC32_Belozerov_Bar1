public class Weather implements Status{
    int situation = 0;

    public Weather(){
        this.situation = 3;
    }

    public boolean Statuss(){
        if(situation > 2)
        {
            return true;
        }
        return false;
    }

}
