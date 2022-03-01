package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.io.File;
import java.lang.reflect.Method;

public class ReflectDemo8 {
    public static void main(String[] args) throws Exception {
        File dir = new File(
                ReflectDemo8.class.getResource(".").toURI()
        );
        File[] subs = dir.listFiles(f -> f.getName().endsWith(".class"));
        for (File sub : subs) {
            String fileName = sub.getName();
            String className = fileName.substring(0, fileName.indexOf("."));
            Class cls = Class.forName(
                    ReflectDemo8.class.getPackage().getName() + "." + className);
            if (cls.isAnnotationPresent(AutoRunClass.class)) {
                System.out.println("实例化:" + className);
                Object o = cls.newInstance();
                System.out.println(o);
                Method[] methods = cls.getDeclaredMethods();
                for(Method method : methods){
                    if(method.isAnnotationPresent(AutoRunMethod.class)){
                        AutoRunMethod a = method.getAnnotation(AutoRunMethod.class);
                        int num = a.value();
                        System.out.println("自动调用  "+ num);
                        method.invoke(o);
                    }
                }


            }
        }
    }
}
