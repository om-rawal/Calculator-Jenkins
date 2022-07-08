public class Calculator{
	public static void main(String[] args) {
		System.out.println("##########################################");
		System.out.println(add(10,20)+" is the result of adding 10,20");
		System.out.println(subtract(10,20)+" is the result of subtracting 10,20");
		System.out.println(multiply(10,20)+" is the result of multiplying 10,20");
		System.out.println("##########################################");
	}
	public static int add(int a,int b) {
		System.out.println("In Addition");
		return a+b;
	}
	public static int subtract(int a,int b) {
		System.out.println("In Subtraction");
		return a-b;
	}
	public static int multiply(int a,int b){
		System.out.println("In Multiplication");
		return a*b;
	}
}