package practice11;

public class Person {
    String name;
    int age;
    int id;
    public Person(){}
    public Person(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }

    public String introduce(){
        //My name is Tom. I am 21 years old.
        return "My name is "+this.name+". I am "+this.age+" years old.";
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
