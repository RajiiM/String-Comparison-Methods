
public class Practice {

	public static void main(String[] args) {
      String s1 = "Java";
      StringBuffer s2 = new StringBuffer("Java");

      String s3 = "Java Learning";

      System.out.println(s1.contentEquals(s2));
      System.out.println(s3.contentEquals("Learning"));  
      System.out.println(s3.contentEquals("Java Learning"));  
	}
}

//OUTPUT
true
false
true
