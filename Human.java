import java.util.ArrayList;
import java.util.List;

public class Human {
    private int humanId;
    private String name;
    private String birthDay;
    private int gender;
    private int father;
    private int mother;
    
    public Human(int humanId, String name, String birthDay, int gender, int father, int mother){
        this.humanId    = humanId;
        this.name       = name;
        this.birthDay   = birthDay;
        this.gender     = gender;
        this.father     = father;
        this.mother     = mother;
        // this.children = children;
    }

    public Human(){

    }
    
    public int getHumanId(){
        return humanId;
    }
    public void setHumanId(int humanIdValue){
        this.humanId = humanIdValue;
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
    /**
     * @return Получаем имя отца
     */
    public int getFather(){
        return father;
    }
    /**
     * Задаем имя отца
     * @param fatherValue - имя отца
     */
    public void setFather(int fatherValue){
        this.father = fatherValue;
    }
    /**
     * @return Получаем имя матери
     */
    public int getMother(){
        return mother;
    }
    /**
     * Задаем имя матери
     * @param motherValue - имя матери
     */
    public void setMother(int motherValue){
        this.mother = motherValue;
    }

    @Override
    public String toString() {
        String genStr = "";
        if (gender == 0){
            genStr = "female";
        }
        if (gender == 1){
            genStr = "male";
        }
        
        return "(ID:"+humanId+") Name: "+name+", was born at: "+birthDay+", sex: "+genStr;
    }
    
    public static void searchByName(String arg){
        System.out.println(arg);
    }
}
