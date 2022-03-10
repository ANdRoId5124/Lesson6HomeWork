package Computer;

public class Computer {
    int cost;
    String model;
    RAM RAM;
    HDD HDD;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        RAM RAM = new RAM();
        HDD HDD = new HDD();
    }

    public Computer(int cost, String model, RAM RAM1, HDD HDD1) {
        this.cost = cost;
        this.model = model;
        this.RAM = RAM1;
        this.HDD = HDD1;

    }

    void show() {
        System.out.println("\n" + "Compuuter: " + cost + "\n" + model + "\n" + RAM + "\n" + HDD);
    }

}

