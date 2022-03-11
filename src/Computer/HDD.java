package Computer;

public class HDD{

    String name;
    int value;

    public HDD() {
    }

    public HDD(String nameHdd, int valueHdd) {
        this.name = nameHdd;
        this.value = valueHdd;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
