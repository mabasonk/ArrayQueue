/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;

/**
 *
 * @author Mbuzeleni
 */
public interface QueueInterface {
    void Enqueue(int item);
    boolean isEmpty();
    boolean isFull();
    int Dequeue();
    int Peek();
}
