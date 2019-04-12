package practice06;

public class Student extends Person {
    private int Klass;

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int Klass) {
        this.Klass = Klass;
    }

    public Student(String name, Integer age, int Klass)
    {
        super(name, age);
        this.Klass = Klass;
    }

    public String callOverrideMethod()
    {
        //super.introduce();
        return super.introduce();
    }

    public String introduce()
    {
        Student tom = new Student("Tom",21,2);
        return(super.introduce()+ " I am a Student. I am at Class "  + tom.Klass+".");
    }



    public static void main(String[] args)
    {
        Student tom = new Student("Tom",21,2);
        System.out.println(tom.callOverrideMethod()+ tom.introduce());
    }
}