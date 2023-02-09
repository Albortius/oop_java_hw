import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class CustomMenu {
    // @Override
    public void viewMenuChoises(FamilyTree familyTree) {
        Scanner inp = new Scanner(System.in);
        String choise = "start";
        while(choise.equals("start")){
            System.out.println("Ваши действия:");
            System.err.println("0 - Выход");
            System.out.println("1 - Вывод всех людей из дерева;");
            System.out.println("2 - Поиск человека по имени;");
            System.out.println("3 - Добавление нового человека в дерево;");
            int userChoise = inp.nextInt();
            switch(userChoise){
                case 0:
                    choise = "stop";
                    break;
                case 1:
                    System.out.println("Вариант 1");
                    break;
                case 2:
                    System.out.println("Введите искомое имя:");
                    String searchingName = inp.next();
                    System.out.println(familyTree.getByName(searchingName));
                    break;
                case 3:
                    System.out.println("Variant 3");
                    break;
            }
        }
    }
}
