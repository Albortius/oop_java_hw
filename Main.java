import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FamilyTree familyTree = new FamilyTree();
        familyTree.addNew("Rose", "27.09.1971", 0);
        familyTree.addNew("Donald", "02.05.1968", 1);
        familyTree.addNew( "John", "25.10.1999", 1, familyTree.getByName("Donald"), familyTree.getByName("Rose"));
        familyTree.addNew("Lara", "03.12.2001", 0, familyTree.getByName("Donald"), familyTree.getByName("Rose"));
        familyTree.addNew("Robert", "17.04.2018", 1, familyTree.getByName("John"), familyTree.getByName("Lara"));
        familyTree.addNew("Julia", "28.08.2020", 0, familyTree.getByName("John"), familyTree.getByName("Lara"));
        familyTree.addNew("Fill", "19.06.2019", 1, familyTree.getByName("Robert"), familyTree.getByName("Julia"));
        familyTree.addNew("Susan", "11.11.2021", 0, familyTree.getByName("Robert"), familyTree.getByName("Julia"));
        familyTree.addNew("Sam", "03.01.2023", 1, familyTree.getByName("Robert"), familyTree.getByName("Julia"));
        familyTree.addNew("Nick", "01.01.2001", 1, null, familyTree.getByName("Rose"));

        
        TreeArchivable filework;
        
        CustomMenu menu = new CustomMenu();
        menu.viewMenuChoises(familyTree);
        
        // familyTree.viewAllHumans();
        // System.out.println(familyTree.getByName("Rose"));
    }
}