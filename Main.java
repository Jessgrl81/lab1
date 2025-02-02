//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Jessica Stephens
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    int[] nums ={5, 9, 3, 12, 7, 3, 11, 5};
    int i = 0;
    while (i < nums.length) {
      System.out.print(nums[i] + "");
      i++;
    }
    System.out.println();
    System.out.println("First value: " + nums[0]);
    System.out.println("Last value: " + nums[nums.length -1]);
    System.out.println("Sum: " + lab.sum(nums));
    System.out.println("Average: " + lab.average(nums));
    System.out.println("Max: " + lab.max(nums));
    System.out.println("Min: " + lab.min(nums));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  public int max(int a, int b) {
    if (a > b) {
      return a;
    } 
    else {
      return b;
    }
  }
  public int min(int a, int b) {
    if (a < b) {
      return a;
    }
    else {
      return b;
    }
  }
  public int sum(int[] nums){
    int total =0;
    for (int num : nums) {
      total  += num;
    }
    return total;
  }
  public double average(int[] nums) {
    int total =0;
    int count =0;
    for (int num : nums) {
      total += num;
      count ++;
    }
    return (double) total / count;
  }
  public int max(int[] nums) {
    int maxVal = nums[0];
    for (int num : nums) {
      if (num > maxVal) {
        maxVal = num;
      }
    }
    return maxVal;
  }
  public int min (int[] nums) {
    int minVal = nums[0];
    for (int num : nums) {
      if (num < minVal) {
        minVal = num;
      }
    }
    return minVal;
  }
}