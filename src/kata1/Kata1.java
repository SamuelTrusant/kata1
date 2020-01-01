package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1999, 5, 2);
        
        Person samuel = new Person("Samuel",date);
        System.out.println(samuel.getName() + " tiene " + samuel.getAge() + " años");
    }   
    
}
