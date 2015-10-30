import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		Arrays.sort(args, new MyComparator());
		for (int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
	}
}


