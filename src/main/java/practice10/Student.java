package practice10;

public class Student extends Person{
    public Student(int id,String name,int age){
        super(id, name, age);
    }

    public Klass klass;

    public void setKlass(Klass klass) { this.klass = klass; }
    public Klass getKlass() { return klass; }

    public Student(int id,String name,int age,Klass klass){
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce(){
        //My name is Tom. I am 21 years old.
        if(this.klass.leader!=null) {
            if (this.klass.leader.getId() == this.getId()) {
                return super.introduce() + " " + "I am a Student. I am Leader of Class " + this.klass.getNumber() + ".";
            } else {
                return super.introduce() + " " + "I am a Student. I am at Class " + this.klass.getNumber() + ".";
            }
        }
        else
            return super.introduce() + " " + "I am a Student. I am at Class " + this.klass.getNumber() + ".";
    }

}
