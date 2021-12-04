public class Practice {

	public static void main(String[] args) {
      String s1 = "Java";
      String s2 = new String("Java");
      
      String s3 = "java";
      String s4 = "JAVA";
      
      System.out.println(s1.equals(s2));
      System.out.println(s3.equals(s4));
      
	}
}

//Output
true
false