package dxc;

public class Tester {
	public static void main(String[] args) {
		Find_Distance p1 = new Find_Distance(2, 3);
		System.out.println("The distance of p1 from origin is: " + p1.distance());
		Find_Distance p2 = new Find_Distance(5, 6);
		System.out.println("The distance between p1 and p2 is: " + p1.distance(p2));
		}
}