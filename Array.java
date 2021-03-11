public class Array {
    public static void main(String[] args) {
      int arr[] = new int[5];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = i + 1;
      }
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
    }
  }




//array for same datatype limit in capacity and size 
//arraylist allow u to get out of capacity it gets 16 when exceeded it *2 so it increase thats how the dynamic works copy the oldarray to new larger one and delete the old one 



// complaxity is the worst case to an excution to finish
// o(n) im looping on array size
// o(n2) im looping on array size 2 times
// 0(1)-constant time no llop like addition
// O(log(n)) alogothrms that each time we devide the arrays
// n
// n / 2
// n / 4
// n / 8
// n / 16
// dimentional array O(m*n) m = number of rows
// n = number of columns
// O(n^2 - n)
// O(n^2)  for each n im doing looping all others
// why complaxity? to know how fast the exection of my program




