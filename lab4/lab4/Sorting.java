package lab4;

import java.util.Comparator;

public class Sorting {

    public static class SortByAlphabet implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            if (st1.lastName.compareTo(st2.lastName) == 0) {
                return st1.firstName.compareTo(st2.firstName);
            } else {
                return st1.lastName.compareTo(st2.lastName);
            }
        }
    }

    public static class SortByAge implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            String age1 = Integer.toString(st1.age);
            String age2 = Integer.toString(st2.age);
            return age1.compareTo(age2);
        }
    }

}
