package Generics;

public class Impl2 {
	public static void main(String[] args) {
		I i = new I() {
			@Override
			public void xyz() {
				System.out.println("Hello form xyz impl2");
				
			}
		};
		i.xyz();
	}
}
