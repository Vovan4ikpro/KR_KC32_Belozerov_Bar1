public class TechnicalCondition implements Status{
    private int condition = 4;

    public boolean Statuss(){
        if(condition >= 4){
            return true;
        }
        return false;
    }
}
