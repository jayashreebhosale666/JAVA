package Test;

import java.util.regex.*;
/*
 * replace text that matches any regular expression. 
 * The API for this method states that "given the regular expression a*b, the input aabfooaabfooabfoob, and the replacement string -, 
 * an invocation of this method on a matcher for that expression would yield the string -foo-foo-foo-."
 */
public class REplaceDemo2 {

	public REplaceDemo2() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String REGEX="a*b";
			Pattern pt=Pattern.compile(REGEX);
			String input="aab fooa ab uu fooabfoob";
			Matcher m=pt.matcher(input);
			String replace="-";
			input=m.replaceAll(replace);
			
			
			System.out.println("input: "+input);
	}

}
