public class bubbleSort extends mainClass{
    
    public bubbleSort(int[] number) {
     //constructor
    }
    
    
    
      //BUBBLE SORT ASCENDING
       public void Ascending(){
        int tmp;
        for(int a=0; a<number.length; a++){
            for( int b =0; b<10-1; b++){
                if(number[b] > number[b+1]){
                    tmp = number[b];
                    number[b] = number[b+1];
                    number[b+1] = tmp;
        
             }
        }
    }
       
        //OUTPUT
        System.out.print("ASCENDING: ");
        for(int x=0;x<10; x++){
            System.out.print(number[x] +", ");
        }        
       }
       
       
         //BUBBLE SORT DESCENDING
       public void Descending(){
        int tmp1;
        for(int j=0; j<number.length; j++){
            for( int k =0; k<10-1; k++){
                if(number[k] < number[k+1]){
                    tmp1 = number[k];
                    number[k] = number[k+1];
                    number[k+1] = tmp1;
             }
        }
    }
        //OUTPUT
        System.out.print("\nDESCENDING: ");
        for(int x=0;x<10;x++){
            System.out.print(number[x] +", ");
    }
}
       
}