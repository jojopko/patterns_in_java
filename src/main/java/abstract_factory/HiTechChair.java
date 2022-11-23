package abstract_factory;

public class HiTechChair implements Chair{
    @Override
    public boolean HasLegs() {
        return false;
    }

    @Override
    public void SitOn() {
        System.out.println("Удобно и высокотехнологично");
    }
}
