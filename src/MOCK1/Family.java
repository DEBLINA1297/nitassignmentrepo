package MOCK1;

abstract class Sample {
	abstract void love();

}
class Family
{
	public static void main(String[] args) {
		Sample s= new Sample(){
			void love()
			{
				System.out.println("Love you Mommy");
				}
			};
		s.love();
		}
	}

