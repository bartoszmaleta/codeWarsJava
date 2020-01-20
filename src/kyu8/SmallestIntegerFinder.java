package kyu8;

public class SmallestIntegerFinder {
    public static void main(String[] args) {
        int[] myArray = {78,56,232,12,11,43};
        findSmallestInt(myArray);
    }

    public static int findSmallestInt(int[] args) {
        int smallestInteger = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < smallestInteger) {
                smallestInteger = args[i];
            }
        }
        // System.out.println(smallestInteger);
        return smallestInteger;
    }
}