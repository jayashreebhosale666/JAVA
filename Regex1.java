/**
 * 
 */
package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MRuser
 *
 */
public class Regex1 {

	/**
	 * 
	 */
	public Regex1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "\\d";
		Pattern pt=Pattern.compile(pattern);
		Matcher m=pt.matcher("ht 1  ht33");
		while(m.find())
		System.out.println(m.start()+" "+m.end());
		/*OUTPUT:
		 3 4
		8 9
		9 10
		 * */
		//-----------------------------------
		 
	}

}
