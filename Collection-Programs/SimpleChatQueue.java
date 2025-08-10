import java.util.concurrent.*;

public class SimpleChatQueue {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();

        // Thread to add messages
        Thread adder = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    while (queue.size() > 5) {
                        // Pause if more than 5 messages
                        Thread.sleep(500);
                    }
                    String msg = "Message " + i;
                    queue.put(msg);
                    System.out.println("Added: " + msg);
                    Thread.sleep(200); // slow adding for demo
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread to read messages
        Thread reader = new Thread(() -> {
            while (true) {
                try {
                    String msg = queue.take();
                    System.out.println("Read: " + msg);
                    Thread.sleep(1000); // simulate reading delay
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        adder.start();
        reader.start();
    }
}

