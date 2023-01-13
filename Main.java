import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "humansData.txt";
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
        
        /*FileOutputStream outputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(familyTree);
        objectOutputStream.close();
        */
        
        /*FileInputStream inputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        var familyTree = (FamilyTree) objectInputStream.readObject();
        objectInputStream.close();;
        */
        
        for (var item : familyTree.humans){
            System.out.println(item);
        }
        
        System.out.println();
        
        System.out.println(familyTree.getByName("Julia"));
        
    }
    /*private static void viewAllHumans(List<Human> list) {
        for (Human person : list) {
            System.out.println(person);
        }
    }*/
}