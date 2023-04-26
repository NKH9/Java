import java.sql.Time;
import java.util.Timer;

public enum TrafficLights {
    RED(30, "Red"),
    GREEN(10, "Green"),
    YELLOW(5, "Yellow");
    private final int Duration;
    private final String Lightname;

    TrafficLights(int Duration, String LightName){
        this.Duration=Duration;
        this.Lightname=LightName;
    }
    public String getLightname() {
        return  Lightname;
    }

    @Override
    public String toString() {
        return "TrafficLights{" +
                "Duration=" + Duration +
                ", Lightname='" + Lightname + '\'' +
                '}';
    }
}
