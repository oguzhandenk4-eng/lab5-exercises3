import java.util.Scanner;

public class PalindromeDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Ask the user to enter a string.
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Step 2: Create a Stack and a Queue.
        // Use the length of the input string as capacity.
        Stack stack = new Stack(text.length());
        Queue queue = new Queue(text.length());

        // Step 3: Traverse the string from left to right.
        for (int i = 0; i < text.length(); i++) {

            // Get the character at the current index.
            char ch = text.charAt(i);

            // Insert the character into the stack.
            stack.push(ch);

            // Insert the same character into the queue.
            queue.enqueue(ch);
        }

        // Step 4: Assume the string is a palindrome.
        boolean isPalindrome = true;

        // Step 5: Compare characters while the queue is not empty.
        // Stop comparing if a mismatch is found.
        while (!queue.isEmpty() && isPalindrome) {

            // Remove one character from the stack.
            char stackChar = stack.pop();

            // Remove one character from the queue.
            char queueChar = queue.dequeue();

            // Compare the two characters.
            // If they are different, update isPalindrome.
            if (stackChar != queueChar) {
                isPalindrome = false;
            }
        }

        // Step 6: Display whether the string is a palindrome.
        if (isPalindrome) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }

        input.close();
    }
}