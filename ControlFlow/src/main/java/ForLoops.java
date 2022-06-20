public class ForLoops {

    public ForLoops(){

    }


    public static void printAssociatesNames(String[] names){

        // here we have our basic for loop
        // 'i' is an index to access the collection
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

    }




    public static int printTotalAssociatesNamesCount(String[] associatesArray){

        int counter = 0;

        //here we have an enhanced ForLoop because we do not have to have the int i = 0 and continuation like i++

        //we are looking for every single value in this array
        // the semicolon is saying we are looking for Strings inside the associatesArray
        for(String singleAssociate: associatesArray){

            //here we are adding the length or count of EACH string or for all strings in the string array
            //to our counter

            //this states that it will not only count the first string but will also add it up
            counter += singleAssociate.length();
                    }
        //after it has completely gone through the entire array
        //we will return counter that has our total

        return counter;
    }






}
