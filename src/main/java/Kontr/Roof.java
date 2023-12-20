package Kontr;

class Roof extends Stage {
    private double area; //площадь

    public Roof() {
        this.area = 0.0;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public Stage next() {
        return new Finish();
    }

    @Override
    public Stage prev() {
        return new Walls();
    }
}
