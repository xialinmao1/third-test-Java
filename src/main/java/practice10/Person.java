package practice10;
/*
写一个Person类，要有id，name，age属性，靠id来判断是否是同一个人。要有一个introduce方法，
introduce方法返回一个字符串形如：
>My name is Tom. I am 21 years old.
 */
public class Person {
    int id;
    String name;
    int age;

    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setId(int id) { this.id = id; }
    public int getId() { return id; }

    public Person(){}
    public Person(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        return ("My name is "+this.name+". I am "+this.age+" years old.");
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
