package Data;


/**
 * Write a description of class PriorityQueue here.
 * 
 * @author Michael Kelly 
 * @version 1.0.0 (oct. 6, 2007)
 */
public class PriorityQueue
{
    private Comparable[] x;
    private int pos;
    
    public PriorityQueue (){
        x = new Comparable[1];
    }
    
    public PriorityQueue(Comparable[] x){
        this.x = new Comparable[x.length];
        pos = x.length;
        
        Sorter.selectionSort(x);
        
        for (int i = 0; i < x.length; i++){
            this.x[i] = x[i];
        }
    }
    
    public Comparable pop (){
        Comparable temp = x[0];
        x[0] = null;
        shrink ();
        
        Sorter.selectionSort(x);
        
        return temp;
    }
    
    public Comparable peek(){
        return x[0];
    }
    
    public void push (Comparable n){
        
        if (x[0] != null)
            expand ();
        
        x[0] = n;
        
        Sorter.selectionSort(x);
    }
    
    private void expand (){
        Comparable[] nx = new Comparable[x.length + 1];
        
        for (int i = 0; i < x.length; i++){
            nx[i + 1] = x[i];
        }
        
        x = nx;
    }
    
    private void shrink (){
        Comparable[] nx = new Comparable[x.length - 1];
        
        for (int i = 0; i < nx.length; i++){
            nx[i] = x[i + 1];
        }
        
        x = nx;
    }
}
