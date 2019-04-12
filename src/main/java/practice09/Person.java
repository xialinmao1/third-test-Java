package practice09;

public class Person {
    Integer id;
    String name;
    Integer age;

    public Person(Integer id, Integer age, Student name){}
    public Person(Integer id,String name,Integer age){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Integer getAge() { return age; }
    public Integer getId() { return id; }
    public String getName() { return name; }

    public String introduce(){
        return ("My name is "+ this.name +". I am "+ this.age+" years old.");
    }

    public int hashCode(){
        return 1;
    }
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(obj instanceof Person){
            Person person=(Person)obj;
            if(person.id==this.id) return true;
        }
        return false;

    }

}
