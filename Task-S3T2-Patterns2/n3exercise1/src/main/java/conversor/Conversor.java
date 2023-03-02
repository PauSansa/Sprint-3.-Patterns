package conversor;

public abstract class Conversor {
    float conversionRate;
    String to;

    public String getTo(){
        return to;
    }

    public float converse(Float original){
        return original*conversionRate;
    }
}
