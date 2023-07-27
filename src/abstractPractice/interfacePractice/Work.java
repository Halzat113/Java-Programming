package abstractPractice.interfacePractice;

public class Work {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Computer macbook = new Laptop("macOS");
        Computer windows = new Desktop("Windows 10");
        developer.code(macbook);
        developer.code(windows);
    }
}
