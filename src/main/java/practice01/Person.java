package practice01;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public String introduce()
    {
        return ("My name is "+ getName()+ ". I am "+getAge()+" years old.");
    }

    public static void main(String[] args)
    {
        Person s = new Person("Tom",21);
        s.introduce();
    }

}
