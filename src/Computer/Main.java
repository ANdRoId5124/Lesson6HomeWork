package Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(8, "Lenovo");
        computer1.computerReview();
        System.out.println();
        Computer computer2 = new Computer(1500, "ASUS", new RAM("Samsung",8), new HDD("HDD",512));
        computer2.computerReview();
    }
}
