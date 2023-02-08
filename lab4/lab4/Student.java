package lab4;

public class Student {

    public String firstName;
    public String lastName;
    public int age;
    public String faculty;
    public boolean hasStipend;

    public Student(String fn, String ln, int age, String fac, boolean wealth) {
        setValues(fn, ln, age, fac, wealth);
        getValues();
    }

    private void setValues(String fn, String ln, int age, String fac, boolean wealth) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = age;
        this.faculty = fac;
        this.hasStipend = wealth;
    }

    private void getValues() {
        System.out.println("Прізвище та ім'я: " + this.lastName + " " + this.firstName);
        System.out.println("Вік: " + this.age);
        System.out.println("Факультет: " + this.faculty);
        System.out.print("Наявність стипендії: ");
        if (this.hasStipend)
            System.out.println("є");
        else
            System.out.println("немає");
        System.out.println("~".repeat(40));
    }

}
