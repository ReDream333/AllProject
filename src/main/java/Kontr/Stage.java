package Kontr;

public abstract class Stage implements IStage{

        private Statuse status;

        public Stage() {
            this.status = Statuse.запланирован;
        }

        public Statuse getStatus() {
            return status;
        }

        public void setStatus(Statuse status) {
            this.status = status;
        }
    }

