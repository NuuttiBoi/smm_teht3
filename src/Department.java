import java.util.ArrayList;
import java.util.List;

public class Department extends Component {

    private List<Component> children = new ArrayList<>();
    public Department(String name) {
        super(name);
    }

    @Override
    public void printData() {
        System.out.println(children);
    }


    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public int getSalary() {
        int salary = 0;
        for(Component child : children){
            salary += child.getSalary();
        }
        return salary;
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }

}
