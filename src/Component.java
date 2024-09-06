public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void printData();

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract double getSalary();

    public abstract String printStructure(String indent);

    public abstract Component getChild(int index);
}
