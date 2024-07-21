
public class OperadoresBitwise {
	public static void main(String[] args) {

		// & -> operação "E" bit a bit
		// | -> operação "OU" bit a bit
		// ^ -> operação "OU-exclusivo" bit a bit

		int n1 = 89;// 0101 1001
		int n2 = 60;// 0011 1100
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
	}
}
