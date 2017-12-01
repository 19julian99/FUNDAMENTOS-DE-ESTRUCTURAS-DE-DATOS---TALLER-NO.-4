/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import static mergesort.MergeSort.main;

/**
 *
 *
 * @author: Julian Peñuela ID:607452 NRC:5813
 * @version: 31/11/2017/A
 *
 */
public class MergeSort {

    /**
     * Next we will see the main where the input data for the search method is
     * requested.
     *
     * @author: Julian Peñuela ID:607452 NRC:5813
     * @version: 31/11/2017/A
     * @see <a href = https://github.com/19julian99" /> </a>
     * @throws IOException
     *
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // this is a constructor is created, an object with the name 
        //of the class to call
        MergeSort ms = new MergeSort();

        String[] num;
        int[] array;
        int[] arrayFinal;
        //the numbers are read by a comma and stored in a String, then this is
        //divided into a String arreeglo and the initial string is split by the token (",")
        bw.write("ingrese los numeros separados por coma");
        bw.flush();
        num = br.readLine().split(",");
        //the property .length () is used to obtain the size of the array and
        //this determine the repetitions of the FOR cycle
        array = new int[num.length];
        arrayFinal = new int[num.length];
        //in a FOR structure, you pass the string array to an integer using 
        //the Integer.parseInt () property;
        for (int i = 0; i < num.length; i++) {
            array[i] = Integer.parseInt(num[i]);
        }

        arrayFinal = ms.Merge_Sort(array);
        //the final ordered arrangement is printed
        bw.write("Your sort numbers\n");
        bw.flush();
        //
        for (int i = 0; i < num.length; i++) {
            System.out.print(arrayFinal[i] + " ");
        }

    }
    // end of the function

    /**
     * in this function the subarrays are obtained by validating the size and
     * obviously dividing them.
     *
     * @param Array
     * @return the ordered arrangement of left and right
     *  * @version: 31/11/2017/A
     * @see <a href = https://github.com/19julian99" /> </a>
     */
    public int[] Merge_Sort(int[] array) {
        int[] LeftSubArray = new int[array.length / 2];
        int[] RightSubArray = new int[array.length - (array.length / 2)];
        int[] SortedL = new int[array.length / 2];
        int[] SortedR = new int[array.length - (array.length / 2)];

        if (array.length == 1) {
            return array;
        } else {
            int i = 0;
            for (i = 0; i < array.length / 2; i++) {
                LeftSubArray[i] = array[i];
            }
            for (i = array.length / 2; i < array.length; i++) {
                RightSubArray[i - (array.length / 2)] = array[i];
            }
            SortedL = Merge_Sort(LeftSubArray);
            SortedR = Merge_Sort(RightSubArray);
            return Merge(SortedL, SortedR);
        }
    }
    // end of the function

    /**
     * this function is in charge of the positions of the vector and orders it.
     *
     * @param A
     * @param B
     * @return returns the vector c
     */
    public int[] Merge(int[] A, int[] B) {

        int length = A.length + B.length;
        int[] C = new int[length];
        int IndexA = 0, IndexB = 0, IndexC = 0;

        while (A.length != IndexA && B.length != IndexB) {
            if (A[IndexA] < B[IndexB]) {
                C[IndexC] = A[IndexA];
                IndexA++;
                IndexC++;
            } else {
                C[IndexC] = B[IndexB];
                IndexB++;
                IndexC++;
            }
        }

        while (A.length != IndexA) {
            C[IndexC] = A[IndexA];
            IndexA++;
            IndexC++;
        }
        while (B.length != IndexB) {
            C[IndexC] = B[IndexB];
            IndexB++;
            IndexC++;
        }
        return C;
    }
    // end of the function

}
// end of the class

