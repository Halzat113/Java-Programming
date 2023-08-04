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
        Generic<Integer> g = new Generic<>(2);
        System.out.println(g.obj);
    }
}
