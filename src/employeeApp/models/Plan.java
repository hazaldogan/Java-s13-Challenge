package employeeApp.models;

public enum Plan {
    BASIC("Basic",10000),
    MEDIUM("Medium",18000),
    ADVANCE("Advance",25000);

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
