package Kontr;
import java.util.LinkedList;

class ConstructionImpl implements Construction {
    private LinkedList stages;

    public ConstructionImpl() {
        stages = new LinkedList();//создание линкеда
        stages.add(new Project("Project"));}

    public void startConstruction(){
        System.out.println("Construction started.");
        performStage((Stage) stages.peek());

    }

    private void performStage(Stage stage) {
        if (stage == null) {
            finishConstruction();
            return;
        }
    }

    public void finishConstruction(){
        System.out.println("Construction finished.");
    }


}

