package Chain;

public class HR implements People{
    People next;
    HR(People p){
        next = p;
    }

    public void process(int a){
        if(a<10){
            System.out.println("HR处理");
            return;
        }
        if(next!=null) next.process(a);

    }


}
