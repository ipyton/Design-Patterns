import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import sun.jvm.hotspot.code.SingletonBlob;

import java.io.Serializable;

public class Singleton implements Serializable {
    //不让外界使用
    //饿汉式
    private Singleton(){}
    private static Singleton instance=new Singleton();

    public static Singleton get(){
        return instance;
    }
}

class Singleton2{
    //饿汉式
    private Singleton2(){}
    private static Singleton2 instance;
    public static synchronized Singleton2 get(){
        if(instance==null) instance=new Singleton2();
        return instance;
    }
}

class Singleton3{
    //饿汉式2：大部分操作都是读操作，这种操作线程安全，以上面的方法为例，在读对像的时候无法并发执行
    private Singleton3(){}
    private static volatile Singleton3 instance;
    public static Singleton3 get(){
        if(instance==null) {
            //两个线程，第一个线程到达这里并获得锁，创建对象，第二个线程判断进来之后再获得锁判断一次，false 退出
            //这样相比上面函数的好处是在对象创建好之后没必要再在每一次访问的时候再获取锁了
            //但是指令重排序有可能会使对象在创建到一般的过程中被访问，这时候就会出现问题，解决方法是加volatile关键字，创建写屏障
            synchronized (Singleton3.class){
                if(instance==null){
                    instance=new Singleton3();
                }
            }
        }
        return instance;
    }
}
class Singleton4{
    //这也是一种惰性加载方式，内部类只有在被用到的时候才会被加载
    private Singleton4(){}
    private static class Singleton{
        private static Singleton4 instance =new Singleton4();
    }
    public static Singleton4 get(){
        return Singleton.instance;
    }
}
enum Singleton5{
    //不会被破坏,属于饿汉式方式
    instance
}






