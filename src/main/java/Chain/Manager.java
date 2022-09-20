package Chain;

public class Manager implements People{
    People next;
    Manager(People p){
        next = p;
    }


    @Override
    public void process(int a) {
        if(a>10&&a<30) {System.out.println("Manager处理");
        return;}
        if(next!=null){
            next.process(a);
        }
    }
}
