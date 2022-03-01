package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 该注解是用来标注那些可以被反射机制自动调用的类
 *
 * 定义注解时，我们通常会使用java内置的两个注解来加以修饰
 * 当前注解。其中:
 * @Retention 用来指定当前注解的保留级别。有三个可选值，
 * 对应:
 *  RetentionPolicy.SOURCE  表示当前注解仅保留在源码中
 *  RetentionPolicy.CLASS(默认值) 表示注解会保留在字节码中，但是反射机制不可用
 *  RetentionPolicy.RUNTIME 表示保留在字节码文件中，但是可以被反射机制使用
 *  通常我们定义的注解都会指定为RUNTIME级别，辅助反射机制的操作。
 *
 * @Target用于表示当前注解可以在什么位置上使用。可选项都定义在ElementType上
 * 常见的有:
 *       ElementType.TYPE 在类上使用
 *       ElementType.FIELD 在属性使用
 *       ElementType.METHOD 在方法上使用
 *       ...
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AutoRunClass {

}






