package Computer;

public class RAM {
    String name;
    int value;

    public RAM() {
    }

    public RAM(String nameRam, int valueRam) {
        this.name = nameRam;
        this.value = valueRam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
