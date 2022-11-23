package abstract_factory;

public class VictorianFactory implements FurnitureFactory{
    @Override
    public Chair CreateChair() {
        return new VictorianChair();
    }
}
