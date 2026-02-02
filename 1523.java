class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        
        // Loop from the low number to the high number
        for (int i = low; i <= high; i++) {
            
            // Conditional: Check if the number is odd
            // (A number is odd if dividing by 2 leaves a remainder)
            if (i % 2 != 0) {
                count++; // Increment our counter
            }
        }
        
        return count;
    }
}