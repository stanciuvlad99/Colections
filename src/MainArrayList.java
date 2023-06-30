import java.util.*;

public class MainArrayList {
    public static void main(String[] args) {

        ArrayList<String> peope = new java.util.ArrayList<>();


        peope.add("John");
        peope.add("Dave");
        peope.add("Jane");

        peope.remove("Dave");
        peope.remove(1);

        if (peope.contains("John")){
            System.out.println("John is in the list");
        }

        peope.clear();

        if (peope.isEmpty()){
            System.out.println("The list in empty");
        }



    }
}