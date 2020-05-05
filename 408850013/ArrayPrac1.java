/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayprac1;

/**
 *
 * @author min20120907
 */
public class ArrayPrac1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[]{1,2,3,4};
        int sum=0;
        int avr;
        int min=array[0], max = array[0];
        for(int i = 0;i<array.length;i++){
            if(min > array[i])
                min = array[i];
            if(max < array[i])
                max = array[i];
            sum += array[i];
        }
        avr = sum / array.length;
        
        System.out.printf("Maximum: %d\nMinimum: %d\nSum: %d\nAverage: %d\n", max, min, sum, avr);
        
    }
    
}
