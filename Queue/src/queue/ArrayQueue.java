/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


/**
 *
 * @author Mbuzeleni
 */
public class ArrayQueue implements QueueInterface {
    private int last;
    private int first;
    private int size;
    private int[]arr;
    
    public ArrayQueue()
    {
        arr=new int[5];
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public boolean isFull()
    {
        return size==arr.length;
    }
    public void Enqueue(int item)
    {
        if(isFull())
        {
            arr=Arrays.copyOf(arr, arr.length*2);
            //should i call enqueue again?
        }
       if(isEmpty())
       {
           first=0;
           last=first;
           arr[last]=item;
           size++;
       }
       else
       {
           last++;
           arr[last]=item;
           size++;
       }         
    }
    public int Dequeue()
    {
        int item=0;
        if(first==last)
        {
            item=arr[first];
            last=-1;
            first=-1;
        
        }
        else 
        {
            item=arr[first];
            first++;
        }
            size--;
        return item;
    }
    
     public int Peek()
    {
        int item=0;
        if(isEmpty())
            System.out.println("Queue is empty!!!");
        else if(first==last)
          item=arr[first];
           
        else 
          item=arr[first];
            
        
          
        return item;
    }
    
    

}
