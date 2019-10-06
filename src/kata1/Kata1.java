package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1999, 5, 2);
        
        Person samuel = new Person("Samuel",date);
        System.out.println(samuel.getName() + " tiene " + samuel.getAge() + " años");
    }   
    
}
