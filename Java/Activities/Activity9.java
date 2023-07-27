package activities;
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Keya");
        myList.add("Rohan");
        myList.add("Rina");
        myList.add("Raju");
        myList.add("Adrit");
        System.out.println("size of  list" + myList.size());
        System.out.println("size of  list" + myList);
        myList.add("Soumi");
        System.out.println("size of  list" + myList.size());
        System.out.println("size of  list" + myList);
        myList.remove("Raju");
        System.out.println("size of  list" + myList.size());
        System.out.println("size of  list" + myList);

        System.out.println("Do we have Raju: "+myList.contains("Raju"));

    }


}

