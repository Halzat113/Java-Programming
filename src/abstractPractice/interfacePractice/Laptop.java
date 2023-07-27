package abstractPractice.interfacePractice;

public class Laptop implements Computer{
    private final
    String os;

    public Laptop(String os){
        this.os = os;
    }
    @Override
    public boolean speed() {
        return true;
    }

    @Override
    public void coding() {
        System.out.println("Coding with "+os+" laptop");
    }
}
