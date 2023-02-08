package lab4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student First = new Student("Михайло", "Гордун", 21, "ІПСА", true);
        Student Second = new Student("Дмитро", "Шарій", 19, "ТЕФ", false);
        Student Third = new Student("Аліна", "Шарій", 18, "ЕФ", false);
        Student Fourth = new Student("Назар", "Лоленко", 17, "ФІОТ", true);
        Student Fifth = new Student("Олександра", "Зеленська", 18, "ФМВ", true);

        Student[] ObjArray = new Student[] {First, Second, Third, Fourth, Fifth};

        Arrays.sort(ObjArray, new Sorting.SortByAlphabet());
        System.out.println("\nСортування за алфавітом (зростання):");
        for (Student Classes : ObjArray) {
            System.out.println(Classes.lastName + " " + Classes.firstName);
        }

        Arrays.sort(ObjArray, new Sorting.SortByAge());
        System.out.println("\nСортування за віком (спадання):");
        for (int i = ObjArray.length-1; i >= 0; i--) {
            System.out.print(ObjArray[i].lastName + " ");
            System.out.print(ObjArray[i].firstName);
            System.out.println(", вік: " + ObjArray[i].age);
        }
    }

}
