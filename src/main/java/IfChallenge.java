public class IfChallenge {
    public static void main(String[] args) {
        IfChallenge ifChallenge = new IfChallenge();
        ifChallenge.dayOfWeek(7);
    }
    /**
    The dayOfWeek method below takes an integer parameter as input and will output the
    appropriate day of the week in English. Assume that 1 is Monday, 2 is Tuesday, etc.
    For example: If this method is called like dayOfWeek(7), then it will return
    "Sunday". Use if statements
    Pre-conditions: The input will be an integer
    Post-conditions: It will return the value "Not a valid day of week"
     if the integer doesn't represent a day of the week and will return the English day of the week
     if it is a valid day.
     **/
    public String dayOfWeek(int dayAsNum) {
        if (dayAsNum < 1 || dayAsNum > 7) {
            return "Not a valid day of week";
        } else if (dayAsNum == 1) {
            return "Monday";
        } else {
            return "Not a valid day of week";
        }


    }

}