package employeeApp.models;

public enum Plan {
    PLAN1("Plan1",10000),
    PLAN2("Plan2",50000),
    PLAN3("Plan3",25000);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
