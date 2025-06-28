//Stack bata matra Question aauxa
package Data_Structure;
public class QueueFromArray {
    int[] queue;
    int capacity;
    int front;
    int rear;
    int size;
    //Queue first in first out
    public QueueFromArray(int capacity){
        queue = new int[capacity];
        this.capacity=capacity;
        front=0; //index of the front element
        rear=-1; //index of the last element
        //when front is greater than rear, the queue is empty kinabhane rear ma element add hune ho 
        size=0;
    }
    public boolean isEmpty(){
        return front > rear;
    }
    public boolean isFull(){
        return rear == capacity - 1;
    }   
    //enqueue le queue ma element add garne ho
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue overflow");
        }else{
            // if queue is empty element will be added at index 0
            // if queue is not empty element will be added at index rear+1
            rear = (rear + 1) % capacity; // Circular queue implementation
            size++;
            rear++;
            queue[rear] = value;    
            System.out.println("Enqueued: "+value);
        }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -99999999; // Meaningful value indicating empty queue [exception can also be used]
        }else{
            int value = queue[front];
            // front++;
            front=(front+1) % capacity; // Circular queue implementation
            size--;
            System.out.println("Dequeued: "+value);
            return value;
        }
    }
    //peek le queue ko front element lai dekhaucha
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -99999999; // Meaningful value indicating empty queue [exception can also be used]
        }else{
            return queue[front];
        }
    }
    public int dequeue(int index){
        if(index < front || index > rear){
            System.out.println("Invalid index for dequeue");
            return -99999999; // Meaningful value indicating invalid index
        }
        int value = queue[index];
        // Shift elements to the left
        for(int i = index; i < rear; i++){
            queue[i] = queue[i + 1];
        }
        rear--; // Decrease the rear index
        System.out.println("Dequeued from index "+index+": "+value);
        return value;
    }
}
