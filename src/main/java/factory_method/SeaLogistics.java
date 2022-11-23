package factory_method;

public final class SeaLogistics extends Logistics{
    @Override
    public Transport CreateTransport() {
        return new Ship();
    }

    @Override
    public void PlanDelivery() {

    }
}
