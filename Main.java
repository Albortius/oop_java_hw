import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        familyTree.addNew(2, "Rose", "27.09.1971", 0, 0, 0);
        familyTree.addNew(1, "Donald", "02.05.1968", 1, 0, 0);
        familyTree.addNew(new Human(3, "John", "25.10.1999", 1, 2, 1));
        familyTree.addNew(new Human(4, "Lara", "03.12.2001", 0, 2, 1));
        familyTree.addNew(new Human(5, "Robert", "17.04.2018", 1, 3, 0));
        familyTree.addNew(new Human(6, "Julia", "28.08.2020", 0, 3, 0));
        familyTree.addNew(new Human(7, "Fill", "19.06.2019", 1, 0, 4));
        familyTree.addNew(new Human(8, "Susan", "11.11.2021", 0, 0, 4));
        
        // Метод для вывода всех людей из дерева
        // familyTree.viewAllHumans();
        
        // Метод для поиска братьев или сестер
        // familyTree.searchBrothersAndSisters("Robert");
    }
}