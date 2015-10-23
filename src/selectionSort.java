/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jj22511
 */
public class selectionSort extends mainClass {
    //CONTRUCTOR
    public selectionSort(int[] number){}
    
    //ASCENDING
    public void Ascending(){
    int min;
    for (int i = 0; i < number.length; i++) {
        // Assume first element is min
        min = i;
        for (int j = i + 1; j < number.length; j++) {
            if (number[j] < number[min]) {
                min = j;
            }
        }
        if (min != i) {
            final int temp = number[i];
            number[i] = number[min];
            number[min] = temp;
        }
        }
        System.out.print("ASCENDING: ");
        for(int x=0;x<10;x++){
        System.out.print(number[x] + ", ");// I print the in ascending order
        }
        
    }
    
    
public void Descending(){
      
    int min2;
    for (int i = 0; i < number.length; i++) {
        // Assume first element is min
        min2 = i;
        for (int j = i + 1; j < number.length; j++) {
            if (number[j] > number[min2]) {
                min2 = j;
            }
        }
        if (min2 != i) {
            final int temp = number[i];
            number[i] = number[min2];
            number[min2] = temp;
        }
     
    }
       System.out.print("\nDESCENDING: ");
        for(int x=0;x<10;x++){
        System.out.print(number[x] + ", ");// I print the in ascending order
        }
    
    }

}
