/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jj22511
 */
public class insertionSort extends mainClass {
    
   //Constructor
    public insertionSort(int[] number){}
    
    //ASCENDING SORT
            public void Ascending(){
            for(int a=1; a<number.length; a++){
                int tmp = number[a];
                int b = a;
                while((b>0) && (number[b-1] > tmp)){
                    number[b]=number[b-1]; //swap
                    b--;
                }
                number[b]=tmp;  //swap
            }
            
            System.out.print("ASCENDING:");
            for(int x = 0; x<10; x++){
                System.out.print(number[x]+ ", ");
            }   
            }
            
            
             //DESCENDING SORT
           public void Descending(){
            for(int a=1; a<number.length; a++){
                int tmp = number[a];
                int b = a;
                while((b>0) && (number[b-1] < tmp)){
                    number[b]=number[b-1]; //swap
                    b--;
                }
                number[b]=tmp;  //swap
            }
            
            System.out.print("\nDESCENDING:");
            for(int x = 0; x<10; x++){
                System.out.print(number[x]+ ", ");
            }              
}
}
