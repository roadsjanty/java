public class ternaryOperator {
  public static void main(String[] args) {
    boolean isCar = true;
    boolean wasCar = isCar ? true : false;
    if (wasCar) {
      System.out.println("wasCar is true");
    }

    isCar = false;
    boolean newWasCar = isCar ? true : false;
    if (!newWasCar) { // it means if newWasCar isnt' ture i.e. false, which matches hence gives output
      System.out.println("wasCar isn't true");
    }

    // isCar ;// i guess it'll take previous isCar data i.e. false // well it
    // doesn't work
    boolean allNewCar = isCar ? true : false;
    if (allNewCar == false) { // it worked with == but not with = and took the previous false value
      System.out.println("allNewCar is false for sure!");
    }

    isCar = false; // i guess i don't need to write boolean isCar all the time
    if (isCar != true) {
      System.out.println("isCar is false!");
    } // i guess second one doesn't work if first case already passed ? NO
    if (isCar == false) { // still isn't working without ==
      System.out.println("well = isn't working anymore in new java i guess!");
    }
  }
}