package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.DocFlavor.STRING;

public class AnchoringBounds {

	public AnchoringBounds() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String regex=new String("(.+)(\\d)(.+)");
		String input=new String("abc jh ju &* 8 ** b");
		Pattern pt=Pattern.compile(regex);
		Matcher m=pt.matcher(input);
		m.useAnchoringBounds(true);
		while(m.find())
		{
			System.out.println(m.group());
			System.out.println(m.hasAnchoringBounds());
		}
		String regex1=new String("(.*)(\\d)(.*)");
		String input1=new String("99096llk");
		Pattern pt1=Pattern.compile(regex1);
		Matcher m1=pt1.matcher(input1);
		m.useAnchoringBounds(true);
		while(m1.find())
		{
			System.out.println(m1.group());
			System.out.println(m1.hasAnchoringBounds());
		}
	}

}
