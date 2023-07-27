package abstractPractice.interfacePractice;

public class Desktop implements Computer{
    private String os;
    public Desktop(String os){
        this.os=os;
    }

    @Override
    public void coding() {
        System.out.printf("Coding on %s desktop",os);
    }

    @Override
    public boolean speed() {
        return true;
    }
}
