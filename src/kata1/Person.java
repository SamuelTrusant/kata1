package kata1;
import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;
    private static final int MS_PER_SECOND = 1000;
    private static final int SECOND_PER_MIN = 60;
    private static final int MIN_PER_HOUR = 60;
    private static final int HOUR_PER_DAY = 24;
    private static final double DAY_PER_YEAR = 365.25;
    private static final double MS_PER_YEAR = MS_PER_SECOND * SECOND_PER_MIN * MIN_PER_HOUR * HOUR_PER_DAY * DAY_PER_YEAR;
    
    
    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge() {
        long ms = new Date().getTime() - birthday.getTime();
        return toYears(ms);
    }

    private int toYears(long ms) {
       int years = (int) (ms / MS_PER_YEAR);
       return years;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthday=" + birthday + '}';
    }
}
