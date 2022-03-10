package Computer;

public class Computer {
    int cost;
    String model;
    RAM ramMemory = new RAM();
    HDD hddMemory = new HDD();

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    public Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ramMemory = ram;
        this.hddMemory = hdd;

    }

    public void computerReview() {
        System.out.println("Model of the computer: " + model);
        System.out.println("Price of the computer: " + cost);
        System.out.println("RAM model: " + ramMemory.getName() + "\n" + "RAM memory: " + ramMemory.getValue());
        System.out.println("HDD model: " + hddMemory.getname() + "\n" + "HDD memory: " + hddMemory.getValue());
    }
}
