package day06;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	
	public static void main(String ar[]){
		//service 클래스로부터 메소드 정보를 얻음
		//getDeclaredMethods() 는 접근 제어자에 관계없이 해당 클래스의 모든 메소드를 가져온다.
		
		Method[] declaredMethods=Service.class.getDeclaredMethods();
	
	
	
	for(Method method:declaredMethods){
		//printAnnotation이 적용되었는지 확인
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
