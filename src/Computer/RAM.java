package Computer;

public class RAM{
    String name;
    int value;

    void showRam() {
        System.out.println("\n" + "RAM: " + name + "\n" + value);
    }

    public RAM() {
    }

    public RAM(String nameRam, int valueRam) {
        this.name = nameRam;
        this.value = valueRam;
    }
}
