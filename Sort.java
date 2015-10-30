import java.util.Arrays;

public class Sort {

	private static MyComparator mc;

	
	public static void main(String[] args) {

		mc = new MyComparator();
		Arrays.sort(args, mc);
		for (int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
	}
}


