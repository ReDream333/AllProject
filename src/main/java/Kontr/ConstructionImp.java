package Kontr;
import java.util.LinkedList;

class ConstructionImpl implements Construction {
    private LinkedList stages;

    public ConstructionImpl() {
        stages = new LinkedList();//создание линкеда
        stages.add(new Project("Project"));}

    public void startConstruction(){
        
    };
    public void finishConstruction(){

    };

}

