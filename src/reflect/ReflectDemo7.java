package reflect;

import reflect.annotations.AutoRunClass;

/**
 * 反射机制中使用注解
 */
public class ReflectDemo7 {
    public static void main(String[] args) throws Exception {
        //判断一个类是否有被@AutoRunClass标注
//        Class cls = Class.forName("reflect.Person");
//        Class cls = Class.forName("reflect.Student");
        Class cls = Class.forName("reflect.Test2");
        /*
            出了Class之外，像Method，Filed等其他反射对象也支持isAnnotationPresent
            方法，用来表示是否被指定注解标注。
            比如:
            Method的这个方法就是判断其表示的方法是否有被指定注解标注。
            Constructor的这个方法就是判断其表示的构造器是否被指定注解标注。
         */
        if(cls.isAnnotationPresent(AutoRunClass.class)){
            System.out.println(cls.getName()+":被@AutoRunClass标注了!");
        }else{
            System.out.println(cls.getName()+":没有被@AutoRunClass标注了!");
        }


    }
}
