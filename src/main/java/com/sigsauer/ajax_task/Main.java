package main.java.com.sigsauer.ajax_task;

public class Main {

    public static void main(String[] args) {
        Task task = new Task();
        System.out.println(task.addTwoDigits(29));
        System.out.println(task.addTwoDigits(48));
        System.out.println();

        System.out.println(task.largestNumber(2));
        System.out.println();

        System.out.println(task.firstNotRepeatingCharacter("abcabcdabc"));
    }
}
