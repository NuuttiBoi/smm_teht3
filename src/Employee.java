import java.util.ArrayList;
import java.util.List;

public class Employee extends Component {

    protected double salary = 0;
    private List<Component> children = new ArrayList<>();

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary(){
        return this.salary;
    }

    @Override
    public void printData() {
        System.out.println("Työntekijän nimi:" + name + " , palkka: " + salary);
    }

    @Override
    public void add(Component component) {
        System.out.println("Et voi lisätä työntekijälle ominaisuuksia");
    }
    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public String printStructure(String indent) {
        return indent + "<Employee name=\"" + name + "\" salary=\"" + salary + "\" />\n";
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }
}
