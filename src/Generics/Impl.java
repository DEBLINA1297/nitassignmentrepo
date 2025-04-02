package Generics;

public class Impl {

//	@Override
//	public void xyz() {
//		System.out.println("Hello form xyz");
//		
//	}
	public static void main(String[] args) {
//		I i = new Impl();
		//i.xyz();
		Impl impl = new Impl();
		impl.doTask(() -> System.out.println("Hello form xyz using Java8"));
	}
	
	void doTask(I i) {
		i.xyz();
	}
	
}
