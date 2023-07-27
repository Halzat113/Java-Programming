public class Generic<T> {
    T obj;

    public Generic(T obj){
        this.obj = obj;
    }

    public void print(){
        System.out.println(this.obj);
    }
}

class Test{
    public static void main(String[] args) {
        Generic<String> g = new Generic<>("asd");
        System.out.println(g.obj);
    }
}
