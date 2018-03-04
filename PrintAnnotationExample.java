package day06;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	
	public static void main(String ar[]){
		//service Ŭ�����κ��� �޼ҵ� ������ ����
		//getDeclaredMethods() �� ���� �����ڿ� ������� �ش� Ŭ������ ��� �޼ҵ带 �����´�.
		
		Method[] declaredMethods=Service.class.getDeclaredMethods();
	
	
	
	for(Method method:declaredMethods){
		//printAnnotation�� ����Ǿ����� Ȯ��
		if(method.isAnnotationPresent(PrintAnnotation.class)){
			PrintAnnotation printAnnotation =method.getAnnotation(PrintAnnotation.class);
			System.out.println("["+method.getName()+"]");
			for(int i=0;i<printAnnotation.number();i++){
			System.out.println(printAnnotation.value());
			}
			System.out.println();
		
			try{
				method.invoke(new Service());
			}catch(Exception e){}
			System.out.println();
		}
	}
}
}
