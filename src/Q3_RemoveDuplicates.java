/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
 *
 * Write a Java program, user input a 1-dimension array of integers, firstly
 * sorting it in non-increasing order, and then remove the duplicates in the
 * array (if exists).
 *
 * INPUT: user input a 1-dimension array.
 * OUTPUT: sorted array in non-increasing order, and without any repeating element.
 *
 * Note: You must write sort algorithm by yourself, you are not supposed to
 * use Arrays.sort() to output the result directly.
 *
 * Hint: you can use bubble sorting algorithm or other sorting algorithms.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example 1:
 * INPUT: [0, 1, 1, 0, 1, 2, 2, 3, 3, 4]
 * OUTPUT: [4, 3, 2, 1, 0]
 *
 * Example 2:
 * INPUT: [7, 0, 4, 2, 9]
 * OUTPUT: [9, 7, 4, 2, 0]
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q3_RemoveDuplicates extends Q1_TwoSum {
    private static void sortArr(int[] myArr) {

        for (int i = 0; i<myArr.length;i++){
            int key = myArr[i];

            while ( ){
                if (key>=myArr[i-1]){
                    int temp;

                }

            }
        }
    }

    public static void main(String[] args) {
        System.out.println("This program sorts user-inputted array in a decreasing order without duplicates.\n");

        int[] myArr = {};
        myArr = makeArr();

        sortArr(myArr);
    }


}
