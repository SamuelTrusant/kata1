
import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;
    private int age;
    
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
        
    }
    
    
    
}
