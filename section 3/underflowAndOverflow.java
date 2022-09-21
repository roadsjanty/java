public class underflowAndOverflow {
    public static void main (String[] args){
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("myMinIntValue = " + myMinIntValue);
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("myMaxIntValue = " + myMaxIntValue);
        // underflow
        System.out.println("Busted Min Value = " + (myMinIntValue -1));
        // overflow
        System.out.println("Busted Max Value = " + (myMaxIntValue +1));

    }
}