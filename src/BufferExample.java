/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sudip
 */
import java.nio.ByteBuffer;

public class BufferExample {

    public static void main(String[] args) {
        // Create a ByteBuffer with a capacity of 10 bytes
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Fill the buffer
        fillBuffer(buffer);

        // Drain the buffer
        drainBuffer(buffer);
    }

    private static void fillBuffer(ByteBuffer buffer) {
        System.out.println("Filling the buffer...");
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) (i + 1));
        }
        System.out.println("Buffer filled. Position: " + buffer.position());
    }

    private static void drainBuffer(ByteBuffer buffer) {
        System.out.println("Draining the buffer...");
        buffer.flip(); // Prepare the buffer for reading

        while (buffer.hasRemaining()) {
            byte value = buffer.get();
            System.out.println("Read value: " + value);
        }
        System.out.println("Buffer drained. Position: " + buffer.position());
        buffer.clear(); // Reset the buffer for writing
    }
}
