package Data;


/**
 * Write a description of class Sorter here.
 * 
 * @author Michael Kelly 
 * @version 1.0.0 (sept. 21, 2007)
 */


public class Sorter
{
    /**
     * Sorts a Comparable list using the Selection sort Algorithm.
     * 
     * @param   Comparable[]
     */
    public static void selectionSort (Comparable[] list){
        int min;
        Comparable temp;
        
        for (int i = 0; i < list.length - 1; i++){
            min = i;
            
            for (int j = i + 1; j < list.length; j++)
                if (list[j].compareTo (list[min]) < 0)
                    min = j;
                    
            temp = list[min];
            list[min] = list[i];
            list[i] = temp;
        }
    }
    
    /**
     * Sorts a Comparable list using the bubble sort Algorithm
     * 
     * @param   Comparable[]
     */
    public static void bubbleSort (Comparable[] list){
        boolean isSorted = true;
        
        while (!isSorted){
            for (int i = 0; i < (list.length - 1); i++){
                if (list[i].compareTo (list[i + 1]) > 0){
                    Comparable temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    
                    isSorted = false;
                }
            }
        }
    }
}
