package Computer;

public class Computer {
    int cost;
    String model;
    RAM ramMemory;
    HDD hddMemory;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        RAM RAM = new RAM();
        HDD HDD = new HDD();
    }

    public Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ramMemory = ram;
        this.hddMemory = hdd;

    }

    void show() {
        System.out.println("\n" + "Compuuter: " + cost + "\n" + model + "\n" + ramMemory + "\n" + hddMemory);
    }

}

