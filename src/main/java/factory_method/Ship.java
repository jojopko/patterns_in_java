package factory_method;

public final class Ship implements Transport{
    @Override
    public void ToGo() {
        System.out.println("Going to the sea");
    }
}
