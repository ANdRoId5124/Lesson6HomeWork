package Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(8, "Lenovo");
        System.out.println(computer1.cost);
        System.out.println();
        computer1.show();
        System.out.println();
        Computer computer2 = new Computer(1500, "ASUS");
        computer2.show();


    }
}
