public class Drinks extends Product {

    private double volume;

    public Drinks(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        StringBuilder drinks = new StringBuilder(super.toString());
        drinks.append(String.format(", volume: %.1f", volume));
        return drinks.toString();
    }
}
