package day06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// @Target�� ���� ElementsType[]�� ���� ������̼� ��������� ��Ÿ����.
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR})

// @Retention�� ���� ������̼� ������å�� ���Ѵ�.  ������ RetentionPolicy.RUNTIME�� �ַλ�� 
@Retention(RetentionPolicy.RUNTIME)

public @interface AnnotationName {
	String value(); //�⺻ element
	int elementName() default 5;
	
}
