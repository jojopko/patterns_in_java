//https://refactoring.guru/ru/design-patterns/factory-method
package factory_method;

public abstract class Logistics {
    public abstract void PlanDelivery();
    public abstract Transport CreateTransport();
}
