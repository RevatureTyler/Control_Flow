public class Main {
    public static void main(String[] args) {
        // we instantiate because the class is not static
        IfElse ifElse = new IfElse();

        String newString = "Hello World";

        //System.out.println(ifElse.checkStringLength("Tiffany"));
        System.out.println(ifElse.printTStringsONly(newString));

        /*
                        For Loops
         */

        //notice we did not have to make an instance of our ForLoops class
        //in order to invoke(call) these methods - this is because they are static

        //here we are creating our String array right in the parameter of our method
        ForLoops.printAssociatesNames(new String[] {"Jo Jo","CJ","DeeAnne","David","Shane"});


        //the other way is to declare the array first
        //assign it to a variable
        //and use the variable in the method parameter
        String[] associates = {"Shaquanna ","Mark ","Tyler ","Eric ","Janga ","Li "};
        System.out.println(ForLoops.printTotalAssociatesNamesCount(associates));

        /*
                        While Loops
         */

        WhileLoops.printFirst3Indexes(associates);

        /*
                        Do-While Loops
         */

        DoWhile dowhile = new DoWhile();
        dowhile.printValueIfTrue();

        /*
                    Switch Statements
         */

        SwitchStatements switchStatements = new SwitchStatements();
        switchStatements.gradeCalculator(95);


    }


}
