package lab6;

public class Skoda extends Car {

    public String mark = "Skoda";

    public Skoda(String _model, float speed, int price, int year, float fuel, float engineCapacity, String country) {
        super(_model, speed, price, year, fuel, engineCapacity, country);
    }

    @Override
    public void printValues() {
        System.out.println("Марка: Skoda\nМатеринська компанія: Volkswagen");
        super.printValues();
    }

}
