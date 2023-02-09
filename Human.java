import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable {
    private String name;
    private String birthDay;
    private int gender;
    private Human father;
    private Human mother;
    private List<Human> children;
    
    public Human(){

    }

    /* Конструктор с 3 аргументами */
    public Human(String name, String birthDay, int gender) {
        this.name       = name;
        this.birthDay   = birthDay;
        this.gender     = gender;
        this.father     = null;
        this.mother     = null;
        this.children   = new ArrayList<>();
    }

    public Human(String name, String birthDay, int gender, List<Human> children) {
        this.name       = name;
        this.birthDay   = birthDay;
        this.gender     = gender;
        this.father     = null;
        this.mother     = null;
        this.children   = children;
    }

    public Human(String name, String birthDay, int gender, Human father, Human mother) {
        this.name       = name;
        this.birthDay   = birthDay;
        this.gender     = gender;
        this.father     = father;
        if (father != null){
            father.children.add(this);
        }
        this.mother     = mother;
        if (mother != null){
            mother.children.add(this);
        }this.children   = new ArrayList<>();
    }
    
    public Human(String name, String birthDay, int gender, Human father, Human mother, List<Human> children) {
        this.name       = name;
        this.birthDay   = birthDay;
        this.gender     = gender;
        this.father     = father;
        if (father != null){
            father.children.add(this);
        }
        this.mother     = mother;
        if (mother != null){
            mother.children.add(this);
        }
        this.children   = children;
    }

    /**
     * @return Получаем имя человека
     */
    public String getName(){
        return name;
    }
    
    /**
     * Задаем имя человека
     * @param nameValue - имя человека
     */
    public void setName(String nameValue){
        this.name = nameValue;
    }
    
    /**
     * @return Получаем день рожденья
     */
    public String getBirthDay(){
        return birthDay;
    }
    
    /**
     * Задаем день рожденья
     * @param birthDayValue - день рожденья
     */
    public void setBirthDay(String birthDayValue){
        this.birthDay = birthDayValue;
    }
    
    /**
     * @return Получаем пол
     */
    public int getGender(){
        return gender;
    }
    
    /**
     * Задаем пол
     * @param genderValue - день рожденья
     */
    public void setGender(int genderValue){
        this.gender = genderValue;
    }

    public List<Human> getChildren() {
        return children;
    }

    /**
     * @return Получаем имя отца
     */
    public Human getFather(){
        return father;
    }
    
    /**
     * Задаем имя отца
     * @param fatherValue - имя отца
     */
    public void setFather(Human fatherValue){
        this.father = fatherValue;
    }
    
    /**
     * @return Получаем имя матери
     */
    public Human getMother(){
        return mother;
    }
    
    /**
     * Задаем имя матери
     * @param motherValue - имя матери
     */
    public void setMother(Human motherValue){
        this.mother = motherValue;
    }

    @Override
    public String toString() {
        String genStr = "";
        String appeal = "";
        String parents = "";
        String childList = "";
        if (getGender() == 0){
            genStr = "female";
            appeal = "Her";
        }
        if (getGender() == 1) {
            genStr = "male";
            appeal = "His";
        }
        
        if (getFather() != null) {
            parents += getFather().getName();
            if (getMother() != null) {
                parents += ", "+getMother().getName();
            }
        }
        else if (getMother() != null) {
            parents += getMother().getName();
        }
        else{
            parents += "was been not found";
        }

        
        if (getChildren().size() > 0) {
            for (var item : getChildren()) {
                childList += " "+item.getName()+",";
            }
            childList = childList.substring(0, childList.length() - 1);
        }
        else {
            childList += " was been not found";
        }
        
        return "Name: "+getName()+", was born at: "+getBirthDay()+", sex: "+genStr+"\n"+appeal+" parents: "+parents+"\n"+appeal+" children:"+childList+"\n- - - - -";
    }
}