class Main {
  public static void main(String[] args) {

  int result = sumOdds();

  System.out.println(result);
  }

/*
Exercise 26: sumOdds
Create an integer method that takes in no arguments or parameters. Return the sum of the odd integers between 1 and 100 inclusive.
sumOdds() →  2500
*/
public static int sumOdds() {
  int totalSum = 0;
 for (int i = 1; i <= 100; i++) {
   if (i%2 != 0) {
     totalSum += i;
   }
 }
  return totalSum;
}
//public static <type> <name>(<arguments or paramters>) {}
//  <code>
//}
