package Generics;

public class Impl3 {
	public static void main(String[] args) {
		I i = () -> 
				System.out.println("Hello form xyz impl3");
				
		i.xyz();
	}
}
