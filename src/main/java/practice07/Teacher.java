package practice07;

public class Teacher extends Person {

    public Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce() {
        if (klass != null) {
            return (super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".");
        } else {
            return (super.introduce() + " I am a Teacher. I teach No Class.");
        }

    }

    public String introduceWith(Student student) {
        if (this.klass ==student.getKlass())
        {
            return ("My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.");
        }
        else{
            return ("My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.");
        }
    }
}








