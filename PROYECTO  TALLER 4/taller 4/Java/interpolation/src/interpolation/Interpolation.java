/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpolation;

import static interpolation.Interpolation.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author: Julian Peñuela ID:607452 NRC:5813
 */
public class Interpolation {

    /**
     * Next we will see the main where the input data for the search method 
     * is requested.
     * @author: Julian Peñuela ID:607452 NRC:5813
     * @version: 31/11/2017/A
     * @see <a href = https://github.com/19julian99" /> </a>
     * @throws IOException
     * 
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(isr);
        /**
         * @param ok is an object of the class for call the function
         */
        Interpolation ok = new Interpolation();
        //the numbers are read by a comma and stored in a String, then this is
        //divided into a String arreeglo and the initial string is split by the token (",")
        System.out.println("ingrese los numeros SEPARADOS POR COMA");
        String numeros = leer.readLine();
        String pre[] = numeros.split(",");
        int array[] = new int[pre.length];
        //in a FOR structure, you pass the string array to an integer using 
        //the Integer.parseInt () property;
        for (int i = 0; i < pre.length; i++) {
            array[i] = Integer.parseInt(pre[i]);
        }
        System.out.println("ingrese el numero a buscar");
        int x;
        x = Integer.parseInt(leer.readLine());

    }//close of the main

    /**
     * this class defines the function used to find a number by means of the
     * Interpolation search method 
     *
     * use a structure while u basically starts playing with the indexes of the 
     * array having as a condition that the lowerBound is lower than the 
     * upperBound, then looking for the midpoint and then another condition c
     * omes out which starts to make changes of values between variables and the
     * arrangement for so find the desired number.
     * 
     * @author: Julian Peñuela ID:607452 NRC:5813
     * @version: 31/11/2017/A
     * @param array
     * @param x
     * @return index
     * @see <a href = https://github.com/19julian99" /> </a>
     */
    public int interpolation(int array[], int x) {
        int lowerBound = 0;
        int upperBound = array.length - 1;
        int index = -1;
        int middlePoint;
        while (lowerBound < upperBound) {
            int higherBound = 0;
            middlePoint = lowerBound + ((higherBound - lowerBound / array[higherBound] - array[lowerBound])) * (x - array[lowerBound]);
            if (x == array[middlePoint]) {
                index = middlePoint;
                break;
            } else {
                if (x < array[middlePoint]) {
                    upperBound = middlePoint - 1;
                } else {
                    lowerBound = middlePoint + 1;
                }

            }
        }
        if (lowerBound == upperBound && array[lowerBound] == x) {
            index = lowerBound;
        }
        return index;

    }
    //closure of the method

}
//end of the class