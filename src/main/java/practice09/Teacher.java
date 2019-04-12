package practice09;

public class Teacher extends Person{
    public Teacher(Integer id,String name,Integer age) {
        super(id, name, age);
    }
    public Klass klass;

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }
    public Teacher(Integer id,String name,Integer age,Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce(){
        if(this.klass!=null){return (super.introduce()+" I am a Teacher. I teach Class "+this.klass.getNumber()+".");}
        else {return (super.introduce()+" I am a Teacher. I teach No Class.");}
    }

    public String introduceWith(Student student){
        // I am a Teacher. I teach Class 2.
        if(this.klass.getNumber()!=student.getKlass().getNumber()){
            return super.introduce()+" "+"I am a Teacher. I don't teach "+student.getName()+".";
        }
        else{
            return super.introduce()+" "+"I am a Teacher. I teach "+student.getName()+".";}
    }
}
