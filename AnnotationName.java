package day06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// @Target에 들어가는 ElementsType[]은 현재 어노테이션 적용범위를 나타낸다.
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR})

// @Retention은 현재 어노테이션 유지정책을 말한다.  보통은 RetentionPolicy.RUNTIME을 주로사용 
@Retention(RetentionPolicy.RUNTIME)

public @interface AnnotationName {
	String value(); //기본 element
	int elementName() default 5;
	
}
