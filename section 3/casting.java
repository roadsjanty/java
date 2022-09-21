public class casting{
    public static void main(String[] args){
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("myMinIntValue = " + myMinIntValue);
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("myMaxIntValue = " + myMaxIntValue);
        // underflow
        System.out.println("Busted Min Value = " + (myMinIntValue -1));
        // overflow
        System.out.println("Busted Max Value = " + (myMaxIntValue +1));

        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("myMinByteValue = " + myMinByteValue);
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("myMaxByteValue = " + myMaxByteValue);
        // underflow
        System.out.println("Busted Min Value = " + (myMinByteValue -1));
        // overflow
        System.out.println("Busted Max Value = " + (myMaxByteValue +1));

        int myTotal = (myMinIntValue/2);
        System.out.println(myTotal);
        // byte myNewByteValue = (myMinByteValue/2);
        //not working because considering int as default 
        byte myNewByteValue = (byte) (myMinByteValue/2);
        // type casting done
        System.out.println(myNewByteValue);
    }
}