package zj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReplaceAll {
	public static void main(String[] args) {
	String str = "1234.56";
	str = str.replaceAll("\\.", "*");
	System.out.println(str);
	Pattern pattern = Pattern.compile("[^0-9]");
	Matcher matcher =pattern.matcher(str);
	str= matcher.replaceAll("");
	System.err.println(str);
	}
}
