package abstract_factory;

public class HiTechFactory implements FurnitureFactory{
    @Override
    public Chair CreateChair() {
        return new HiTechChair();
    }
}
