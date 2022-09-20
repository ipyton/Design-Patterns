package MyProxy;

//想在结婚前结婚后做些事情
interface Marry{
    public void marry();

}
class Person implements Marry{
    @Override
    public void marry() {
        System.out.println("i married");
    }
}

class ProxyForMarry implements Marry{
    Marry person;
    ProxyForMarry(Marry m){
        person=m;
    }
    @Override
    public void marry() {
        beforeMarry();
        person.marry();
        afterMarry();
    }

    public void beforeMarry(){
        System.out.println("before");
    }
    public void afterMarry(){
        System.out.println("after");
    }
}

//仅仅可以代理知道方法的对象
public class StaticProxyDemo {
    public static void main(String[] args) {
        Person person = new Person();
        Marry proxy = new ProxyForMarry(person);
        proxy.marry();

    }
}
