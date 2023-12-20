package Kontr;

public class Foundation extends Stage {
        private double soilVolume;

        public Foundation() {
            this.soilVolume = 0.0;
        }

        public double getSoilVolume() {
            return soilVolume;
        }

        public void setSoilVolume(double soilVolume) {
            this.soilVolume = soilVolume;
        }

    @Override
    public Stage next() {
        return new Walls();
    }

    @Override
    public Stage prev() {
        return new Project("Previous Project");
    }
}
