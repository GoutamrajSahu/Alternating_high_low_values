
/*
 Given a linked list of integers rearrange it such the every second node of the liked list is greater than
 its left and right nodes. In other words rearrange linked list node in alternating high to low. Assume no duplicate
 nodes are present in the linked list.

Demo1:
 Input:
 7
 1 2 3 4 5 6 7
 Output:
 1 3 2 5 4 7 6

Demo2:
 Input:
 6
 23 20 5 10 9 15
 Output:
 5 10 9 20 15 23

*/

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args){
                Scanner Sc = new Scanner(System.in);
        List<Integer> arr = new LinkedList<>();
        int num = Sc.nextInt();
        for(int i=0; i<num; i++){
            arr.add(Sc.nextInt());
        }
        Collections.sort(arr);
//        System.out.println(arr);
        if(arr.size()%2 == 0){
            for(int i = 1, j = 2; j < num-1; i=i+2, j=j+2){
                Collections.swap(arr, i, j);
            }
        }else{
            for(int i = 1, j = 2; j < num; i=i+2, j=j+2){
                Collections.swap(arr, i, j);
            }
        }
//        System.out.println(arr);
        for(Integer ele: arr){
            System.out.print(ele+" ");
        }
    }
}
