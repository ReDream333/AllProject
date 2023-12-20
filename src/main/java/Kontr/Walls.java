package Kontr;

class Walls extends Stage {
    private int brickCount;

    public Walls() {
        this.brickCount = 0;
    }

    public int getBrickCount() {
        return brickCount;
    }

    public void setBrickCount(int brickCount) {
        this.brickCount = brickCount;
    }

    @Override
    public Stage next() {
        return new Roof();
    }

    @Override
    public Stage prev() {
        return new Foundation();
    }
}