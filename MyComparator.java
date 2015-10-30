import java.util.Comparator;

public class MyComparator implements Comparator<Object>{
	@Override
	public int compare(Object o1, Object o2) {
		int i=0;
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		String d1 = "";
		String d2 = "";
		while(i< Math.min(s1.length(), s2.length())){
			if(Character.isDigit(s2.charAt(i)) && Character.isDigit(s1.charAt(i))){
				// once a digit is found, get all the successive numbers from the string and compare.
				 d1 = s1.substring(i).replaceAll("[^0-9]+", " ").trim().split(" ")[0];
				 d2 = s2.substring(i).replaceAll("[^0-9]+", " ").trim().split(" ")[0];
				 long i1 = myAtoi(d1);
				 long i2 = myAtoi(d2);
				 if(i1<i2) return -1;
				 else if(i1>i2) return 1;
				 else {
					 Long num = new Long(i1);
					 i+=num.toString().length();
				 }
			}else{
				if(s1.charAt(i) == s2.charAt(i)) {
					i++;
					continue;
				}else return s1.compareTo(s2);
			}
		}
		return o1.toString().compareTo(o2.toString());
	}
	
	public long myAtoi(String str) {
	    int index = 0,  total = 0;
	    while(index < str.length()){
	        int digit = str.charAt(index) - '0';
	        if(digit < 0 || digit > 9) break;
	        if(Long.MAX_VALUE/10 < total || Long.MAX_VALUE/10 == total && Long.MAX_VALUE %10 < digit)
	            return  Long.MAX_VALUE;
	        total = 10 * total + digit;
	        index ++;
	    }
	    return total ;
	}
}