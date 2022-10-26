/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
 *
 * Write a subroutine, user input an 1D array of integers and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * INPUT: user input array and target
 * OUTPUT: the indices of the two numbers such that they add up to target.
 *
 * The array and target are parameters to the subroutine.
 * User can get hint to input array and target number, respectively.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example:
 * INPUT: [2,7,11,15], 9
 * OUTPUT: [0,1]
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q1_TwoSum {
    public static Scanner sc = new Scanner(System.in);
    public static int[] makeArr(){
        int[] myArr = {};

        System.out.println("Enter an integer for the array then press enter, type N to stop adding numbers: ");
        System.out.println("(Eg. 0 2 5 7 N, where spaces represent enter)\n");


        while (true) {
            String ans = sc.nextLine();
            if (ans.equals("N")||ans.equals("n")){
                System.out.println("Finished final array: "+Arrays.toString(myArr));
                break;
            }
            else {
                myArr = Arrays.copyOf(myArr, myArr.length + 1);
                myArr[myArr.length - 1] = Integer.parseInt(ans);
                System.out.println("Added "+ ans);
            }
        }
        return myArr;
    }
    public static int makeTar(){
        int target;
        System.out.print("Enter your target num, then press enter: ");
        target = sc.nextInt();
        sc.nextLine();

        return target;
    }
    public static void twoSums(int[] myArr, int tNum){

        int[] num = new int[2];
        boolean exist = false;

        for (int i =0; i<myArr.length;i++){
            for (int j = i+1; j< myArr.length; j++){
                if (tNum == myArr[i]+myArr[j]){
                    num[0]=myArr[i];
                    num[1]=myArr[j];
                    exist = true;
                    break;
                }
            }
        }
        if (exist) {
            System.out.println("The two numbers that add up to " + tNum + " are " + num[0] + " and " + num[1]);
        }else{
            System.out.println("Program could not find numbers in the array that can match your target number "+tNum);
        }
    }

    public static void main(String[] args) {

        System.out.println("This program finds whatever a target number can be formed in the numbers of a user-inputted array.\n");
        int[] myArr = {};
        int targetNum;

        targetNum = makeTar();
        myArr = makeArr();

        twoSums(myArr,targetNum);
    }
}
