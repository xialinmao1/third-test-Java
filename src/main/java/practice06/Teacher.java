package practice06;

public class Teacher extends Person{

    private Integer Klass;

    public void setKlass(int Klass)
    {
        this.Klass = Klass;
    }

    public int getKlass(){
        return Klass;
    }

    public Teacher(String name,int age)
    {
        super(name,age);
    }
    public Teacher(String name,int age,int Klass)
    {
        super(name,age);
        this.Klass = Klass;
    }


    public String introduce(){
        if(Klass!=null)
        {
            return(super.introduce()+ " I am a Teacher. I teach Class "+ this.Klass+".");
        }
        else
        {
            return(super.introduce()+ " I am a Teacher. I teach No Class.");
        }

    }

}
