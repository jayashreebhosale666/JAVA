package Test;

import java.util.regex.*;

public class AppendReplacement {

	public AppendReplacement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p = Pattern.compile("cat");
		 Matcher m = p.matcher("one cat two cats in the yard");
		 StringBuffer sb = new StringBuffer();
		 while (m.find()) {
		     m.appendReplacement(sb, "dog");
		 }
		 
		 System.out.println("Without append Tail: "+sb.toString());
		
		 m.appendTail(sb);
		 System.out.println("With append Tail:"+sb.toString());
		 //Replaceall()	
		  p = Pattern.compile("cat");
		  m = p.matcher("one cat two cats in the yard");

		  while (m.find()) {
		     System.out.println("replaceAll(): "+m.replaceAll("dog"));
		 }
		//ReplaceFirst()	
		  p = Pattern.compile("cat");
		  m = p.matcher("one cat two cats in the yard");

		  while (m.find()) {
		     System.out.println("replaceFirst(): "+m.replaceFirst("dog"));
		     break;
		 }
		  p = Pattern.compile("cat");
		 
		 
	
	}

}
