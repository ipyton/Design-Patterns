package Chain;

public class Boss implements People{
    People next;

    public void process(int a){
        if(a>30) {System.out.println("Boss处理");
        return;}
        if(next!=null) next.process(a);

    }

}
