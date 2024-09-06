import java.util.ArrayList;
import java.util.List;

public class Organization{

    protected String name;
    private List<Component> children;
    private Component root;

    public Organization(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void add(Component component){
        children.add(component);
    }

    public void remove(Component component){
        children.remove(component);
        System.out.println("department removed");
    }
    public int getSalaries(){
        int salaries = 0;
        for(Component child : children){
            salaries += child.getSalary();
        }
        return salaries;
    }

    public void printOrganizationStructure() {
        System.out.println("<Organization>");
        for (Component child : children) {
            System.out.println(child.printStructure(""));
        }
        System.out.println("</Organization>");
    }

}
