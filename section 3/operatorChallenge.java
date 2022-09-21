// public class operatorChallenge {
//     public static void main(String[] args) {
//         double a = 20.00;
//         double b = 80.00;
//         double sum = a + b * 100;
//         double remainder = sum % 40.00;
//         boolean remainderNew = remainder ? true : false;
//         if (remainderNew) {
//             System.out.println("True it's " + remainderNew);
//         } else {
//             System.out.println("Got some remainder i.e. " + remainderNew);
//         }
//     }
// }

public class operatorChallenge {
    public static void main(String[] args) {
        double a = 20.00d;
        double b = 80;
        float total = ((float) (a + b)) * 100; // as per precision multiply will be done first gotta take care about d
        // i thought pc is intelligent enough that it could tell the precision factors
        // it's also working with simply writing 80 or 100 since double by default i
        // guess
        // after changing if i write 100 d it's not working else it's automatically
        // intercepting it to be float without declaration
        // seems like based on the variable datatype literal changing itself
        System.out.println("total = " + total);
        double remainder = total % 40.00d;
        System.out.println("the remainder is = " + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
        else {
            System.out.println("It's clear");
        }
    }
}