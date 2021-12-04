
public class Practice {

	public static void main(String[] args) {
      String s1 = "Bbb";
      String s2 = new String("Aa");
      
      String s3 = "ACTING";
      String s4 = new String("CAT");
      
      String s5 = "Java";
      String s6 = new String("Java");
      
      System.out.println(s1.compareTo(s2));    
      System.out.println(s3.compareTo(s4));     
      System.out.println(s5.compareTo(s6));    
	}
}

//OUTPUT
1
-2
0
