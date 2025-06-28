package Data_Structure;

import java.util.Scanner;

public class SupermarketQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int capacity;

    public SupermarketQueue(int size) {
        queue = new String[size];
        capacity = size;
        front = 0;
        rear = 0;
    }

    public void addCustomer(String name) {
        if (rear == capacity) {
            System.out.println("Queue is full. Cannot add more customers.");
            return;
        }
        queue[rear++] = name;
        System.out.println(name + " has joined the queue.");
    }

    public void serveCustomer() {
        if (isEmpty()) {
            System.out.println("No customers to serve.");
            return;
        }
        System.out.println(queue[front] + " has been served.");
        // Shift all elements left
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        }
        System.out.print("Current queue: ");
        for (int i = 0; i < rear; i++) {
            System.out.print(queue[i]);
            if (i < rear - 1) System.out.print(" <- ");
        }
        System.out.println();
    }

    public int getCustomerCount() {
        return rear;
    }

    public boolean isEmpty() {
        return rear == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SupermarketQueue queue = new SupermarketQueue(100); // Capacity of 100 customers
        boolean running = true;

        while (running) {
            System.out.println("\n--- Supermarket Queue Management ---");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve next customer");
            System.out.println("3. Display queue");
            System.out.println("4. Display number of customers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    queue.addCustomer(name);
                    break;
                case 2:
                    queue.serveCustomer();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("Number of customers in queue: " + queue.getCustomerCount());
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
