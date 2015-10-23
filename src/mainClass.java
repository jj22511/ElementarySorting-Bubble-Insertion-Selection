import java.util.Scanner;
/**
 *
 * @author JOHN JAY MERCINES BSIS2
 */
public class mainClass {
       
      	//GLOBAL VARIABLE  
        final static int size = 10;
        public static int[] number = new int[size];
       
        //MAIN CLASS
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 Number");
        
        for(int x=0;x<=9;x++){
            System.out.print("Number "+ (x+1) + ": ");
            number[x] = input.nextInt();
        }
        
        //BubbleSort
        System.out.println("\n(BUBBLE SORTING)");
        bubbleSort bubble = new bubbleSort(number);
        bubble.Ascending();
        bubble.Descending();
        
        //InsertSort
        System.out.println("\n\n(INSERTION SORT)");
        insertionSort insert = new insertionSort(number);
        insert.Ascending();
        insert.Descending();
        
        //SelectionSort
        System.out.println("\n\n(SELECTION SORT)");
        selectionSort select = new selectionSort(number);
        select.Ascending();
        select.Descending();
    }    
}
