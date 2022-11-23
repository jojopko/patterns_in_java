package abstract_factory;

public class VictorianChair implements Chair{
    @Override
    public boolean HasLegs() {
        return true;
    }

    @Override
    public void SitOn() {
        System.out.println("Очень удобное и старое сидение");
    }
}
