import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class practiceClass {
  public static void main(String[] args) {

//
//      List<Integer> l1 =  List.of(1,2,3,4,5,6);
//        List<Integer> l2 = new ArrayList<>();
//        l2.add(10);
//        l2.add(9);
//        l2.add(8);
//        l2.add(6);
//        l2.add(3);
//        l2.add(2);
//
//        int arr1[] = {1,5,4,3,6,9,8,7,20};
//      System.out.println(twoSum(arr1 , 9));
//
//
//    }
//
//  static boolean twoSum(int arr[], int target) {

//    HashMap<Integer , Integer> mp = new HashMap<Integer , Integer>();
//    for(int i = 0 ; i<arr.length ; i++){
//      int value = target - arr[i];
//      if(mp.containsKey(value)){
//        return true;
//      }
//      mp.put(arr[i] ,i);
//    }
//    return false;
//  }
//    Arrays.sort(arr);
//    int i = 0;
//    int left = 0 ;
//    int right = arr.length - 1;
//    while(left<right){
//      int currentSum = arr[left] + arr[right];
//
//      if (currentSum == target) {
//        return true; // Found a pair that sums to target
//      } else if (currentSum > target) {
//        right--; // Decrease the sum by moving the right pointer left
//      } else {
//        left++; // Increase the sum by moving the left pointer right
//      }
//    }
//    return false; // No valid pair found
//    }

    List<String> names = List.of("nandini", "aman", "sarthak", "dhruv", "anant", "astha");
    List<String> newName = names.stream().filter(e -> e.startsWith("d")).toList();
//    System.out.println(newName);

    List<Integer> nums = List.of(1,2,5,6,7,8,9);
    List<Integer> newNums = nums.stream().map(e->e*2).toList();
    System.out.println(newNums);
  }

}
