package annotationdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
	int myValue() default 0;
	String myName() default "XYZ";
	String myCity() default "Hyd";
}
/*@Target() helps us to where it can be usefull for example
 * it could be use for class, interface,constructor,field or interface
 * 
 *we use @Retention() where it could be implemented(Compile time/Runtime)*/