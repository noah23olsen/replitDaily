class Main {
  public static void main(String[] args) {
  
  int[] nums = {3,1,4,1,3,9,2,6};

  boolean result = isStrictlyIncreasing(nums);

    System.out.println(result);
  }

/*
Exercise 25: isStrictlyIncreasing 
Create a boolean method called isStrictlyIncreasing that takes in an integer array “nums”. Given an array of integers, return true if the values are strictly increasing. Return false otherwise
isStrictlyIncreasing([5,7,8,10]) → true
isStrictlyIncreasing([5,7,7,10]) → false
isStrictlyIncreasing([-5,-3,0,17]) → true
*/
public boolean isStrictlyIncreasing(int[] nums){
  boolean isTrue = false;
  int previousNum = 0;
  for (int num: nums) {
    if (num%2 != 0 || previousNum >= num) {
      return false;
    }
    previousNum = num;
  }
  return true;
}
}
//public static <type> <name>(<arguments or paramters>) {}
//  <code>
//}
