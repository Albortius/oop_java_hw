import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FamilyTree implements Serializable {
    List<Human> humans;

    public FamilyTree(List<Human> humans){
        this.humans = humans;
    }

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
        for (Human searching : humans) {
            if (searching.getName().equals(nameStr)) {
                searchObj = searching;
            }
        }
        return searchObj;
    }
    
    /**
     * Метод вывода всех людей из дерева
     */
    /*
    public void viewAllHumans(){
        for (var i : humans){
            List<Human> parents     = new ArrayList<>();
            List<Human> children    = new ArrayList<>();
            if (i.getFather() != 0){
                for (var j : humans){
                    if (i.getFather() == j.getHumanId()){
                        parents.add(j);
                    }
                }
            }
            if (i.getMother() != 0){
                for (var k : humans){
                    if (i.getMother() == k.getHumanId()){
                        parents.add(k);
                    }
                }
            }
            for (var m : humans){
                if (i.getHumanId() == m.getFather()){
                    children.add(m);
                }
                if (i.getHumanId() == m.getMother()){
                    children.add(m);
                }
            }
            System.out.println(i.toString());
            if (parents.size() > 0){
                System.out.println("Parents:");
                for (var n : parents){
                    System.out.println(n);
                }
            }
            else{
                System.out.println("Parents: not found");
            }

            if (children.size() > 0){
                System.out.println("Children:");
                for (var o : children){
                    System.out.println(o);
                }
            }
            else{
                System.out.println("Children: not found");
            }
            System.out.println("- - - - -");
        }
    }
    */
    /**
     * Метод поиска и вывода братьев и сестер
     */
    /*
    public void searchBrothersAndSisters(String searchName){
        List<Human> brothersAndSisters = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        for (var i : humans){
            if (searchName.equals(i.getName())){
                tempList.add(i.getFather());
                tempList.add(i.getMother());
                brothersAndSisters.add(i);
            }
        }
        for (var i : humans){
            for (var j : tempList){
                if (i.getFather() == j && j != 0){
                    brothersAndSisters.add(i);
                }
                if (i.getMother() == j && j != 0){
                    brothersAndSisters.add(i);
                }
            }
        }
        Set<Human> finalSet = new HashSet<>(brothersAndSisters);
        brothersAndSisters.clear();
        brothersAndSisters.addAll(finalSet);
        if (brothersAndSisters.size() > 0){
            if (brothersAndSisters.size() == 1){
                System.out.println("A person named \""+searchName+"\" does not have a brother or sister");
                System.out.println(brothersAndSisters.get(0).toString());
            }
            else{
                System.out.println("Brothers and sisters:");
                for (var i : brothersAndSisters){
                    System.out.println(i.toString());
                }
            }
        }
        else{
            System.out.println("A person named \""+searchName+"\" has not been found in the Family Tree!");
        }
    }
    */
}
