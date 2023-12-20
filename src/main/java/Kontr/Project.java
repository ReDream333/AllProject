package Kontr;

class Project extends Stage {
    private String name;

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Stage next() {
        return new Foundation();
    }

    @Override
    public Stage prev() {
        return null;
    }
}
