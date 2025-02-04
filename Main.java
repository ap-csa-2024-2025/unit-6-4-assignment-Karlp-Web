import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0;

    for (int i= 0; i < arr.length; i++)//the average get every array element loop
    {
      if (arr[i].length() == target.length) //makes the length equal to the other length (have to use == ;.equals is for objects)
      {
        count++
      }
    }
    return count;
  }

  public static int indexOf(double[] arr, double target)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == target)
      {
        return i; //returns the first occurance of the target and the placing since it it keeping track of it
      }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (int i= 0; i < arr.length; i++)
    {
      if (arr[i] == target)
      {
        int target = arr[i];


        
      }
    }

    return false;
  }

  public static String findMode(String[] arr)
  {
    // replace with your code
    return null;
  }
}
