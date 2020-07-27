/*

https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form/

Rearrange an array in maximum minimum form | Set 1
Given a sorted array of positive integers, rearrange the array alternately
i.e first element should be maximum value, second minimum value, third second max,
fourth second min and so on.

Examples:

Input: arr[] = {1, 2, 3, 4, 5, 6, 7}
Output: arr[] = {7, 1, 6, 2, 5, 3, 4}

Input: arr[] = {1, 2, 3, 4, 5, 6}
Output: arr[] = {6, 1, 5, 2, 4, 3}

Expected time complexity: O(n).
This approach requires extra space
 */

package Arrays;

import java.util.Arrays;

public class Rearrange_Array_Alternately {
    public static int[] rearrange(int[] arr,int l){
//        System.out.println("inside rearrange");
        int[] temp=new int[l];

        int small=0,large=l-1;

        boolean flag=true;
        for (int i=0;i<l;i++){
            if(flag){
                temp[i]=arr[large--];
            }
            else
                temp[i]=arr[small++];

            flag=!flag;
        }
      return temp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("original array: ");
        System.out.println(Arrays.toString(arr));
        arr=rearrange(arr,arr.length).clone();

        System.out.println("After rearrange: ");
        System.out.println(Arrays.toString(arr));
    }
}

class AnotherApproach{
    public static void rearrange(int[] arr,int l){
        int max_id=l-1,min_id=0;
        int max_ele=arr[l-1]+1;

        for (int i=0;i<l;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[max_id] % max_ele) * max_ele;
                max_id--;
            }
            else {
                arr[i] = arr[i] + (arr[min_id] % max_ele) * max_ele;
                min_id++;
            }
        }
        for (int i=0;i<l;i++){
            arr[i]=arr[i]/max_ele;
        }

    System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("original array: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nafter rearrange: ");
        AnotherApproach aa=new AnotherApproach();

        aa.rearrange(arr,arr.length);
    }
}
