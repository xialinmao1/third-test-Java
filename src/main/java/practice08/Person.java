package practice08;

public class Person {
    private String name;
    private int age;
    private int id;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public int getId(){return id;}
    public void setAge(int id){this.id = id;}

    public Person(){}
    public Person(int id,String name, int age)
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    public String introduce()
    {
        return ("My name is "+ this.name+ ". I am "+this.age+" years old.");
    }

    public int hashCode(){
        return 1;
    }
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person person=(Person)obj;
            if(person.id==this.id) return true;
        }
        return false;
    }

}
