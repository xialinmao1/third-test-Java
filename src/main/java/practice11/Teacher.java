package practice11;
import java.util.LinkedList;
public class Teacher extends Person{
    Student student;
    LinkedList<Klass> linkedList;
    public Teacher(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public LinkedList<Klass> getClasses(){
        return this.linkedList;
    }

    public Teacher(int id,String name,int age,LinkedList<Klass> linkedList){
        this.id=id;
        this.name=name;
        this.age=age;
        this.linkedList=linkedList;
        if(!this.linkedList.isEmpty()){
            for(int i=0;i<this.linkedList.size();i++){
                this.linkedList.get(i).setTeacher(this);
            }
        }
    }
    public boolean isTeaching(Student student){
        if(this.linkedList.contains(student.getKlass()))
            return true;
        else
            return false;
    }
    public String introduce(){
        // I am a Teacher. I teach Class 2.
        String result;
        if(this.linkedList==null){
            result= super.introduce()+" "+"I am a Teacher. I teach No Class.";
        }
        else{
            result=super.introduce()+" "+"I am a Teacher. I teach Class ";
            for(int i=0;i<linkedList.size();i++){
                if(i!=linkedList.size()-1){
                    result+=linkedList.get(i).number+", ";}
                else
                    result+=linkedList.get(i).number;
            }
            result+=".";
        }
        return result;
    }
    public String introduceWith(Student student){
        // I am a Teacher. I teach Class 2.
        if(!isTeaching(student)){
            return super.introduce()+" "+"I am a Teacher. I don't teach "+student.getName()+".";
        }
        else{
            return super.introduce()+" "+"I am a Teacher. I teach "+student.getName()+".";}
    }
    public void observeNewjoin(Student student,Klass klass){
        //"I am Tom. I know Jerry has joined Class 2.
        System.out.print("I am "+this.getName()+". I know "+student.getName()+" has joined Class "+klass.getNumber()+".\n");
    }
    public void observeNewjleader(Student student,Klass klass){
        //I am Tom. I know Jerry become Leader of Class 2.
        System.out.print("I am "+this.getName()+". I know "+student.getName()+" become Leader of Class "+klass.getNumber()+".\n");
    }
}
