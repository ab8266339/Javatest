package lecture5;

/**
 *
 * @author sdn
 */
public class Person {

    final static int AGE_OF_MAJORITY = 18;

    private static int count = 0;
    public static int getCount() { return count;  }

    private String name;
    private int age;
    private boolean isMale;

    public Person(String n, String title, String dateOfBirth) {
        name = n;
        age = new DateOfBirth(dateOfBirth).getAge();
        isMale = title.equals("Mr");
        count++;
    }

    public Person(String n, int a, boolean m) {
        name = n;
        age = a;
        isMale = m;
        count++;
    }

    public String getName() {  return name;  }
    public int getAge() {  return age;  }
    public boolean getIsMale()  {  return isMale;  }

    public void setNameTo(String newName)  {
        name = newName;
    }
    public void increaseAge()  {  age++;  }
    public void changeSex()  {  isMale = ! isMale;  }

    @Override
    public String toString() {
        String result = name + ", a " + age + " year old ";
        if (  age >= AGE_OF_MAJORITY  )
            if  (  isMale  )
                return result+"man";
            else
                return result+"woman";
        else
            if  (  isMale  )
                return result+"boy";
            else
                return result+"girl";
    }

}
