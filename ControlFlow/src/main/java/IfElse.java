public class IfElse {
    public IfElse() {

    }

    public boolean checkStringLength(String input) {

        // the condition here says - if the length of the incoming string that we called
        // 'input' has more than 7 characters  (chars)
        // it will return true.
        if (input.length() > 7) {


            return true;
        } else {
            return false;
        }


        // unnecessary because it'll never reach this statement.
        // this is because all possible conditions have been met
        // return false;
    }

    public String printTStringsONly(String input) {
        //here we made the var 'firstletter'
        // equal to the charAt index 0 of our input
        // this selects the first character of the index which is at 0,
        char firstLetter = input.charAt(0);
        //we declare the boolean check but we do not give it a value
        boolean check;
        // the first letter of this input is equal to T or t then we will return input +
        if (String.valueOf(firstLetter).equals("T") || String.valueOf(firstLetter).equals("t")) {

            return input + " begins with the letter 't'";
        } else {
            // here we are giving check a value
            check = false;
        }


        return "Did this word begin with the letter 't'? : " + check;
    }


}
