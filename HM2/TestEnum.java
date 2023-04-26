public class TestEnum {
    private TrafficLights[] tr_light;

    public TestEnum(TrafficLights[] tr_light) {
        this.tr_light=tr_light;
    }
    public void GetInfoAboutduration(){
        for (TrafficLights tr : tr_light) {
            System.out.println(tr.toString());
        }
    }

    public  static void main(String[] args) {
        TrafficLights[] nw = TrafficLights.values();
        TestEnum new_test = new TestEnum(nw);
        new_test.GetInfoAboutduration();
    }
}
