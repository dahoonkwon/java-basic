package ref;

public class NullMain {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("data = " + data);
        data = new Data();
        System.out.println("data = " + data);
        data = null;
        System.out.println("data = " + data);
    }
}
