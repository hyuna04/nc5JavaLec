package chap08_static.clazz;

public class Weight {
	public void twoWeightSum() {
		int a = 76;
		int b = 65;
		
		String sum = Add.Add(a, b, "kg");
		System.out.println(sum);
		sum = Add.Add(a, b, "g");
		
	}
}
