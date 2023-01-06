package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human h11 = new Human("Миша");
        Human h22 = new Human("Ольга");

        Human h2 = new Human("Иван", 22, "муж", h11, h22);
        Human h3 = new Human("Ольга", 33, "жен", h11, h22);
        Human h4 = new Human("Аля", 10, "жен", h2, h3);

        Human[] Baza = { h2, h3, h4 };

        System.out.print("Поиск\n 1 - поиск по имени \n2 - Добавление\n3 - Ввывести весь список \nВведите данные: ");

        Scanner iScanner = new Scanner(System.in);
        int VV = iScanner.nextInt();
        switch (VV) {
            case 1:
                metod.getname1(Baza);
                break;
            case 2:
                Drevo.addHuman(Baza);
            case 3:
                System.out.println(Arrays.toString(Baza));
        }

    }

}