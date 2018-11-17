package firstTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class application {
    
    public application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
        System.out.println ("Starting the Application");
    //application app = new application();

        //Prints out the current date
        //DateFormat dateFormat = new SimpleDateFormat("yyyy/dd/MM HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
         Date date = new Date();
        System.out.println(dateFormat.format(date)); //11/17/2018 15:27:25


    }
}