package com.Sept12;



public class demo_str {

	public static void main(String[] args) {
                System.out.println("code commited Hello");
		System.out.println("code commited Hello");
		String str1="hello every one";
		String str2="hello india";
		String str3="HELLO INDIA";
		String str4="i am a software tester";
		System.out.println(str4.length());
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println(str2.equals(str3));	
		System.out.println(str1.contains("Hello"));
		System.out.println(str2.concat(str1));
		System.out.println(str2.endsWith("INDIA"));
		System.out.println(str2.startsWith("Hello"));
		/*String str1 = "Hello World";
		String str2 = "wOr";
		str1.indexOf(str2);
		String a = "alpha";
 		String b = "alpha";
 		String c = new String("alpha");
 		//All three strings are equivalent
 		System.out.println(a.equals(b) && b.equals(c));
 	//Although only a and b reference the same heap object
 		System.out.println(a == b);
 		System.out.println(a != c);
 		System.out.println(b != c);
 		String lineFromCsvFile = "Mickey;Bolton;12345;121216";
String[] dataCells = lineFromCsvFile.split(";");
// Result is dataCells = { "Mickey", "Bolton", "12345", "121216"};

String lineFromInput = "What do you need from me?";
String[] words = lineFromInput.split("\\s+"); // one or more space chars
// Result is words = {"What", "do", "you", "need", "from", "me?"};
You can even directly split a String literal:
String[] firstNames = "Mickey, Frank, Alicia, Tom".split(", ");
// Result is firstNames = {"Mickey", "Frank", "Alicia", "Tom"};

Using Pattern.quote():
String s = "a|b|c";
String regex = Pattern.quote("|");
String[] arr = s.split(regex);
Escaping the special characters:
String s = "a|b|c";
String[] arr = s.split("\\|");

An array of strings can be joined using the static method String.join():
String[] elements = { "foo", "bar", "foobar" };
String singleString = String.join(" + ", elements);
System.out.println(singleString); // Prints "foo + bar + foobar"

String code = "code";
System.out.println(code);
 StringBuilder sb = new StringBuilder(code);
 code = sb.reverse().toString();
System.out.println(code);


String str = "My String";
System.out.println(str.charAt(0)); // "M"
System.out.println(str.charAt(1)); // "y"
System.out.println(str.charAt(2)); // " "
System.out.println(str.charAt(str.length-1)); /
*/
	}

}
