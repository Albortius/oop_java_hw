import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable  {
    List<Human> humans;
    private Serializable fileHandler;

    public void save() {
        if (fileHandler != null){
            fileHandler.save();
        }
    }
    public void setFileHandler(Serializable fileHandler) {
        this.fileHandler = fileHandler;
    }

    /**
     * Конструктор FamilyTree с аргументом List<Humans>
     * @param humans - список людей в дереве
     */
    public FamilyTree(List<Human> humans){
        this.humans = humans;
    }

    /**
     * Конструктор FamilyTree без аргументов
     */
    public FamilyTree(){
        this(new ArrayList<>());
    }
    
    
    
    public void addNew(String name, String birthDay, int gender) {
        Human person = new Human(name, birthDay, gender);
        humans.add(person);
    }

    public void addNew(String name, String birthDay, int gender, Human father, Human mother) {
        Human person = new Human(name, birthDay, gender, father, mother);
        humans.add(person);
    }

    public Human getByName( String nameStr) {
        Human searchObj = new Human();
        if (nameStr != null){
            for (Human searching : humans) {
                if (searching.getName().equals(nameStr)) {
                    searchObj = searching;
                }
            }
            return searchObj;
        }
        else {
            return null;
        }
    }

    public void viewAllHumans(){
        for (Human i : this.humans){
            System.out.println(i);
        }
    }
}
