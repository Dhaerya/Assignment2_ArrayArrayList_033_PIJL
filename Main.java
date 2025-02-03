// Name: Dhaerya More
// PRN:  23070126033
// Batch: AIML A2


class Main {
    public static void main(String args[]) {
        UserInput in = new UserInput();s
        ArrayFunctions functions = new ArrayFunctions();

        int[] array = in.arrayInput();
        
        // Sorting even and odd numbers into separate arrays
        functions.oddEven(array);
        
        // Finding neighboring numbers with the smallest distance
        int index = functions.findSmallestDistancePair(array);
        System.out.println("Index of first number in the closest pair: " + index);
        
        // Converting array to ArrayList and back
        functions.convertArrayAndList(array);
    }
}