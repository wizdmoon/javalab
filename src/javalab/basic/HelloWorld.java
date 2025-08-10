package javalab.basic;

// .java -> complier(.class) -> JVM 실행

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.print("Hello World!!!");
		
		String version = System.getProperty("java.version");
		System.out.print("Java Version: " + version);

	}

}
