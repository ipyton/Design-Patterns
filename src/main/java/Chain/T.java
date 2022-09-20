package Chain;

public class T {
    public static void main(String[] args) {
        HR hr= new HR(new Manager(new Boss()));
        hr.process(99);
    }
}
