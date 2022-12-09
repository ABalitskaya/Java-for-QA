package HW1;

public class Phone {
    String number;
    String model;
    int weightInGrams;

    // конструктор1
    public Phone (String number, String model, int weightInGrams) {
        this.number = number;
        this.model = model;
        this.weightInGrams = weightInGrams;

    // конструктор2
    }
    public Phone (String number, String model) {
        this.number = number;
        this.model = model;

    // конструктор без параметров
    }
    public Phone() {

    }

    public String getNumber() {
        return number;
    }

    public void receiveCall (String name) {

        System.out.println("Звонит " + name);
    }
    public void receiveCallWithNumber (String name, String number) {
        number = getNumber();
        System.out.println("Звонит " + name + " Номер: " + number);
    }

    public void Message (String message, String number) {
        number = getNumber();
        System.out.println("Сообщение " + "<<" + message + ">> " + "отправляю абоненту по номеру " + number);
    }
}
