package Generics;

class A<T> {
private T test;
A(T test){
	this.test=test;
}
T getTest() {
	return test;
}
}

class B{
	public static void main(String[] args) {
		A<String>obj=new A("S");
		System.out.println(obj.getTest());
	}
}
