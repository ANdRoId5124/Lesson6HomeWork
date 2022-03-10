package Computer;

public class HDD{

    String name;
    int value;

    void showHDD() {
        System.out.println("\n" + "HDD: " + name + value);
    }

    public HDD() {
    }

    public HDD(String nameHdd, int valueHdd) {
        this.name = nameHdd;
        this.value = valueHdd;
    }
}
