package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final LocalDate birthday;
    private Period periodo;
    private final String  name;
    //private final Calendar birthday;
    private static final long MS_per_year = (long) (1000 * 60 * 60 * 24 * 365.25);

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
   
    public int getAge(){
        LocalDate today = LocalDate.now();
        periodo = Period.between(birthday, today);
        return periodo.getYears();
    }

    private long msToYears(long ms) {
        return (ms/MS_per_year);
    }
   
}
