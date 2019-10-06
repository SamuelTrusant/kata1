package kata1;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthday;
    private final long MS_PER_YEAR = (long) (1000*60*60*24*365.25);    

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public int getAge() {
        Calendar today = GregorianCalendar.getInstance();
        return (int) (MsToYears(today.getTimeInMillis() - birthday.getTimeInMillis()));
    }

    private long MsToYears(long ms) {
       return (ms / MS_PER_YEAR);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthday=" + birthday + '}';
    }
}
