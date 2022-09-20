import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    //使用序列化反序列化打破规则
    public static void writeObject() throws Exception{
        Singleton s= Singleton.get();
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("/Users/chen/Desktop/s.txt"));
        os.writeObject(s);
        os.close();

    }

    public static void read() throws Exception{
        ObjectInputStream is=new ObjectInputStream(new FileInputStream("/Users/chen/Desktop/s.txt"));
        Singleton sin=(Singleton) is.readObject();

    }

    //使用反射破坏单例模式
    public static void get() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class s=Singleton.class;
        Constructor cons=s.getDeclaredConstructor();
        cons.setAccessible(true);
        Singleton s1=(Singleton) cons.newInstance();
        Singleton s2=(Singleton) cons.newInstance();
        System.out.println(s1==s2);
    }

    public static void main(String[] args) throws Exception {
        get();
    }
}

