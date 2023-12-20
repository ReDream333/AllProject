package Kontr;

class Finish extends Stage {
    private double cost;

    public Finish() {
        this.cost = 0.0;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public Stage next() {
        return null;
    }

    @Override
    public Stage prev() {
        return new Roof();
    }
}