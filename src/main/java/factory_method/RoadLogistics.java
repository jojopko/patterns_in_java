package factory_method;

public class RoadLogistics extends Logistics{
    @Override
    public Transport CreateTransport() {
        return new Car();
    }

    @Override
    public void PlanDelivery() {

    }
}
