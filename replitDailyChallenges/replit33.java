class Main {
  public static void main(String[] args) {

    String a = "Hello";
    String b = "hi";

    String result = combostring(a, b);

    System.out.println(result);
  }

/*
Exercise 33: combostring (new for V4)
Create a string method called combostring that takes in two strings,
 “a” and “b”. Given 2 strings, a and b, return a string of the form
short+long+short, with the shorter string on the outside and the 
longer string on the inside. The strings will not be the same 
length, but they may be empty (length 0).

combostring("Hello", "hi") → "hiHellohi"
combostring("hi", "Hello") → "hiHellohi"
combostring("aaa", "b") → "baaab"
*/
public static String combostring(String a, String b) {
  String result = "";
  if (a.length() < b.length()) {
    result = a + b + a;
  }
  else {
    result = b + a + b;
  }
  return result;
}
}
//public static <type> <name>(<arguments or paramters>) {}
//  <code>
//

