package Data_Structure;
import java.util.Scanner;

public class CallCenterQueue {
    private String[] callQueue;
    private int front;
    private int rear;
    private int capacity;

    public CallCenterQueue(int size) {
        callQueue = new String[size];
        capacity = size;
        front = 0;
        rear = 0;
    }

    public void addCall(String callerID) {
        if (rear == capacity) {
            System.out.println("Call queue is full. Cannot accept more calls.");
            return;
        }
        callQueue[rear++] = callerID;
        System.out.println("Call from " + callerID + " added to the queue.");
    }

    public void serveCall() {
        if (isEmpty()) {
            System.out.println("No calls to serve.");
            return;
        }
        System.out.println("Handling call from: " + callQueue[front]);
        for (int i = 0; i < rear - 1; i++) {
            callQueue[i] = callQueue[i + 1];
        }
        rear--;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("No pending calls.");
            return;
        }
        System.out.println("Pending calls in queue:");
        for (int i = 0; i < rear; i++) {
            System.out.println((i + 1) + ". " + callQueue[i]);
        }
    }

    public int getPendingCalls() {
        return rear;
    }

    public boolean isEmpty() {
        return rear == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CallCenterQueue queue = new CallCenterQueue(100); // Capacity of 100 calls
        boolean running = true;

        while (running) {
            System.out.println("\n--- Call Center Queue Management ---");
            System.out.println("1. Add incoming call");
            System.out.println("2. Serve next call");
            System.out.println("3. Display call queue");
            System.out.println("4. Display number of pending calls");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter caller ID: ");
                    String callerID = scanner.nextLine();
                    queue.addCall(callerID);
                    break;
                case 2:
                    queue.serveCall();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("Pending calls: " + queue.getPendingCalls());
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
