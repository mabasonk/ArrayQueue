/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Mbuzeleni
 */
public class Main {

public static void main(String[] args) { 
//Because linkedlist provides methods for inserating and removing items 
// The queue method can be easily implemented. 
//Queue<String> queue = new LinkedList<String>();
//queue.offer("Hello"); 
//queue.offer("Bye"); 
//System.out.println(queue.peek()); 
//queue.remove(); 
//queue.offer("Welcome"); 
//if(!queue.isEmpty()){ 
//System.out.println(queue.remove() + ", new size is "+ queue.size()); 
//System.out.println("Item in front is "+ queue.peek()); 
//} 

    
    QueueInterface qu=new ArrayQueue();
  
    qu.Enqueue(1);
    qu.Enqueue(2);
    qu.Enqueue(3);
    qu.Enqueue(4);
    qu.Enqueue(5);
    qu.Enqueue(6);
   
    System.out.println("Removed item is "+ qu.Dequeue()); 
    System.out.println("First item is "+ qu.Peek()); 
  
    

}
}









