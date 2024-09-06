import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Organization organization = new Organization("org");

        Employee matti = new Employee("matti",1900);
        Employee vesa = new Employee("vesa",2500);

        Department hr = new Department("hr");

        matti.printData();
        vesa.printData();

        hr.add(matti);
        hr.add(vesa);

        organization.add(hr);
        System.out.println(organization.getSalaries());
        System.out.println(organization.getSalaries());
        System.out.println(organization.getSalaries());

        organization.printOrganizationStructure();

        organization.remove(hr);
        System.out.println("Palkat poistamisen jälkeen:");
        System.out.println(organization.getSalaries());

    }
}