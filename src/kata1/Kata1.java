package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person samuel = new Person("Samuel", new Date(99, 2, 5));
        System.out.println(samuel.toString() + " de edad: " + samuel.getAge() + " años");
    }   
    
}
